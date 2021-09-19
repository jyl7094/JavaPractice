public class MyLinkedList implements NodeList {
    private ListItem root;
    
    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return this.root;
    }

    public boolean addItem(ListItem item) {
        ListItem curr = this.root;
        if (curr == null) {
            curr = item;
        } else {
            while (curr != null) {
                if (curr.compareTo(item) > 0) {
                    curr.setPrevious(item).setNext(curr);
                } else if (curr.compareTo(item) < 0) {
                    if (curr.next() == null) {
                        curr.setNext(item).setPrevious(curr);
                        return true;
                    }
                    curr = curr.next();
                } else {
                    return false;
                }
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
                System.out.println(root.getValue().toString());
                root = root.next();
            }
        }
    }
}
