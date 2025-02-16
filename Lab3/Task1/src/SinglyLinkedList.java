public class SinglyLinkedList<E> {
    public Node<E> head;
    public Node<E> tail;
    public int size;

    public SinglyLinkedList() {
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
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public void addLast(E data) {
        Node<E> newNode = new Node<E>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
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
        } else if (position > 0 && position < size) {
            Node<E> newNode = new Node<E>(data);
            Node<E> current = head;
            for (int i = 0; i < position - 1; i++) {
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
            size--;
            if (size == 0) {
                tail = null;
            }
        }
    }

    public void findNode(E data) {
        Node<E> current = head;
        int count = 0;
        while (current != null) {
            if (current.getData().equals(data)) {
                System.out.println("Value found at Node: " + count);
                return;
            }
            current = current.getNext();
            count++;
        }
        System.out.println("Value not found");
    }

    public void removeNode(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            removeFirst();
        } else if (position == (size - 1)) {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.getNext();
            }
            current.setNext(null);
            tail = current;
            size--;
        } else {
            Node<E> current = head;
            for (int i = 0; i < position; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            size--;
        }
    }


    @Override
    public String toString() {
        String output = "";
        Node<E> current = head;
        while (current != null) {
            output += current.getData() + " ";
            current = current.getNext();
        }
        return output;
    }

}
