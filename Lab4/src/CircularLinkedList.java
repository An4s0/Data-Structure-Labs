public class CircularLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E data) {
        Node<E> newNode = new Node<E>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.setNext(head);
        } else {
            newNode.setNext(head);
            head = newNode;
            tail.setNext(head);
        }
        size++;
    }

    public void addLast(E data) {
        Node<E> newNode = new Node<E>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.setNext(head);
        } else {
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
        size++;
    }

    public void addNode(E data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            addFirst(data);
        } else if (position == size) {
            addLast(data);
        } else {
            Node<E> newNode = new Node<E>(data);
            Node<E> current = head;
            for (int i = 1; i < position; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            head = head.getNext();
            tail.setNext(head);
            size--;
            if (size == 0) {
                tail = null;
            }
        }
    }

    public void removeNode(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            removeFirst();
        } else {
            Node<E> current = head;
            for (int i = 1; i < position; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            if (position == size - 1) {
                tail = current;
            }
            size--;
        }
    }

    public void findNode(E data) {
        Node<E> current = head;
        int count = 0;
        while (current != null) {
            if (current.getData().equals(data)) {
                System.out.println("Value found at Node " + count);
                return;
            }
            current = current.getNext();
            count++;
            if (current == head) break;
        }
        System.out.println("Value not found");
    }

    public void rotate() {
        if (!isEmpty()) {
            head = head.getNext();
            tail = tail.getNext();
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        if (head != null) {
            Node<E> current = head;
            do {
                output.append(current.getData()).append(" ");
                current = current.getNext();
            } while (current != head);
        }
        return output.toString();
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
