public class App {
    public static void main(String[] args) throws Exception {
        CircularLinkedList<String> list = new CircularLinkedList<>();

        list.addFirst("A");
        list.addLast("B");
        list.addLast("C");
        list.addNode("D", 2);

        System.out.println("List after additions: " + list.toString());

        list.rotate();
        System.out.println("List after first rotation: " + list.toString());

        list.rotate();
        System.out.println("List after second rotation: " + list.toString());

        list.findNode("B");

        list.removeNode(1);
        list.addNode("E", 1);
        System.out.println("List after removing node at position 1: " + list.toString());
    }
}
