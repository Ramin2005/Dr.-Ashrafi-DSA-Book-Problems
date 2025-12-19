
public class Ch7_Problem1 {

    public static void f(Node head) {

        Node temp1 = head;
        Node temp2 = head;
        Node maxBefore = head;
        Node maxNode = head;
        int max = head.getValue();

        while (temp1.hasNext()) {

            temp1 = temp1.getNext();

            if (temp1.getValue() > max) {

                max = temp1.getValue();
                maxBefore = temp2;
                maxNode = temp1;

            }

            temp2 = temp1;
        }

        if (maxBefore == maxNode) {

            head = new Node();

        } else {

            maxBefore.setNext(maxNode.getNext());

        }
    }
}
