public abstract class ListItem {
    protected ListItem rightLink, leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem node);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem node);
    abstract int compareTo(ListItem node);

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
