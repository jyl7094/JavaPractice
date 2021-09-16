public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    ListItem next() {
        return this.rightLink;
    }

    ListItem setNext(ListItem item) {
        return this.rightLink = item;
    }

    ListItem previous() {
        return this.leftLink;
    }

    ListItem setPrevious(ListItem item) {
        return this.leftLink = item;
    }

    int compareTo(ListItem item) {
        return this.getValue().toString().compareTo(item.getValue().toString());
    }  
}
