public class Main {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(2);
        MyLinkedList ll = new MyLinkedList(c);
        ll.addItem(a);
        ll.addItem(b);
        ll.addItem(new Node(10));
        ll.traverse(a);
        ll.addItem(new Node(5));
        System.out.println();
        ll.traverse(a);
    }
}
