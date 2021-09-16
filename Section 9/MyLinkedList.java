public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return this.root; 
    }

    public boolean addItem(ListItem item) {
        ListItem current = this.root;
        if (current == null) {
            current = item;
        } else {
            if (current.compareTo(item) > 0) {
                
            } else if (current.compareTo(item) < 0) {

            } else {
                return false;
            }
        }
        return true;
    }

    public boolean removeItem(ListItem item) {
        return true;
    }

    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
