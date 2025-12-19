
public class Node {

    private int value;
    private Node next = null;

    public Node() {

    }

    public Node(int value) {

        this.value = value;

    }

    public Node(int value, Node next) {

        this.value = value;
        this.next = next;

    }

    public int getValue() {

        return value;

    }

    public void setValue(int value) {

        this.value = value;

    }

    public boolean hasNext() {

        return this.next != null;

    }

    public Node getNext() {

        return next;

    }

    public void setNext(Node next) {

        this.next = next;

    }

}
