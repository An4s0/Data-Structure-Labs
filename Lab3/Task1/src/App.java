public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();

        list.addLast("B");
        list.addLast("C");
        list.addFirst("A");
        list.addNode("D", 3);
        list.removeFirst();
        list.findNode("A");
        list.removeNode(2);
        list.findNode("C");

        System.out.println(list.toString());
    }
}
