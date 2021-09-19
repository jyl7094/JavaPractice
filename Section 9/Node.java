public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    public ListItem next() {
        return this.rightLink;
    }

    public ListItem setNext(ListItem node) {
        return this.rightLink = node;
    }

    public ListItem previous() {
        return this.leftLink;
    }

    public ListItem setPrevious(ListItem node) {
        return this.leftLink = node;
    }

    public int compareTo(ListItem node) {
        return this.getValue().toString().compareTo(node.getValue().toString());
    }
}
