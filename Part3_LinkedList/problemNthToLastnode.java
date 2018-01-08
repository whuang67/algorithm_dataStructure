class SinglyLinkedList {
    private double value;
    public SinglyLinkedList nextValue = null;

    public SinglyLinkedList(double value) { this.value = value; }

    public double getValue() { return value; }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList a = new SinglyLinkedList(1);
        SinglyLinkedList b = new SinglyLinkedList(2);
        SinglyLinkedList c = new SinglyLinkedList(3);
        SinglyLinkedList d = new SinglyLinkedList(4);
        SinglyLinkedList e = new SinglyLinkedList(5);
        a.nextValue = b; b.nextValue = c; c.nextValue = d; d.nextValue = e;
        for(int i = 1; i <= 5; i++) {
            System.out.println(nthToLastNode(a, i));
        }
    }

    //Given a singly linked list, write a function which takes in the first node in a
    //singly linked list and returns a boolean indicating if the linked list contains
    //a 'cycle'.
    //A cycle is when a node's next point actually points back to a previous node in
    //the list. This is also sometimes known as a circularly linked list.
    //The linked list node class is given:
    public static double nthToLastNode(SinglyLinkedList node, int n) {
        SinglyLinkedList marker1 = node;
        SinglyLinkedList marker2 = node;
        
        for(int i = 0; i < (n-1); i++) {
            if(marker1.nextValue != null) {
                marker1 = marker1.nextValue;
            } else {
                System.out.println("Please enter a correct number!");
                return -100;
            }
        }

        while(marker1.nextValue != null) {
            marker1 = marker1.nextValue;
            marker2 = marker2.nextValue;
        }
        return marker2.getValue();
    }
}