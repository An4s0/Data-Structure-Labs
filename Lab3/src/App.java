public class App {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.addFirst(5555);
        myList.addFirst("IAU");
        myList.addLast(1234);
        myList.addNode("aa", 1);
        myList.removeFirst();
        myList.display();
    }
}