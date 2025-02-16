public class SinglyLinkedList<E> {
    public Node<E> head;
    public Node<E> tail;
    public int size;

    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(E data){
        Node<E> newNode = new Node<E>(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    public void addLast(E data){
        Node<E> newNode = new Node<E>(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
}
