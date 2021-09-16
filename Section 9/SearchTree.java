public class SearchTree implements NodeList {
    private ListItem root;
    
    public SearchTree(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return this.root;
    }

    public boolean addItem(ListItem item) {
        return true;
    }

    public boolean removeItem(ListItem item) {
        return true;
    }

    private void perfromRemoval(ListItem item, ListItem parent) {

    }

    public void traverse(ListItem root) {
        System.out.println();
    }
}
