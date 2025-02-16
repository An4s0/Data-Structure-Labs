public class SinglyLinkedList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            this.element = e;
            this.next = n;
        }

        public E getElement() {
            return this.element;
        }

        public Node<E> getNext() {
            return this.next;
        }

        public void setNext(Node<E> n) {
            this.next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public E first() {
        if (isEmpty())
            return null;
        return this.head.getElement();
    }

    public E last() {
        if (isEmpty())
            return null;
        return this.tail.getElement();
    }

    //////////////////////////////////////////
    public void addFirst(E e) {
        this.head = new Node<>(e, this.head);
        if (isEmpty())
            this.tail = this.head;
        this.size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty())
            this.head = newNode;
        else
            this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    public void addNode(E e, int position) {
        if (position < 0 || position > this.size)
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        if (position == 0)
            addFirst(e);
        else if (position == this.size)
            addLast(e);
        else {
            Node<E> current = this.head;
            for (int i = 0; i < position - 1; i++)
                current = current.getNext();
            current.setNext(new Node<>(e, current.getNext()));
            this.size++;
        }
    }

    public void removeFirst() {
        if (isEmpty())
            return;
        this.head = this.head.getNext();
        this.size--;
        if (isEmpty())
            this.tail = null;
    }

    public void findNode(E e) {
        Node<E> current = this.head;
        int position = 0;
        while (current != null) {
            if (current.getElement() == e) {
                System.out.println("Position: " + position);
                return;
            }
            current = current.getNext();
            position++;
        }
        System.out.println("Not found");
    }

    public void removeNode(int position) {
        if (position < 0 || position > this.size)
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        if (position == 0)
            removeFirst();
        else {
            Node<E> current = this.head;
            for (int i = 0; i < position - 1; i++)
                current = current.getNext();
            current.setNext(current.getNext().getNext());
            this.size--;
            if (position == this.size)
                this.tail = current;
        }
    }

    //////////////////////////////////////////
    public void display() {
        Node<E> current = this.head;
        while (current != null) {
            System.out.print(current.getElement() + " -> ");
            current = current.getNext();
        }
    }
}
