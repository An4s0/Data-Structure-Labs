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

    public void addNode(E data, int position){
        Node<E> newNode = new Node<E>(data);
        if (position == 0){
            addFirst(data);
        } else if (position == size){
            addLast(data);
        } else if (position > 0 && position < size){
            Node<E> current = head;
            for (int i = 1; i < position; i++){
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++;
        } else {
            System.out.println("Invalid position");
        }
    }




}
