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
        a.nextValue = b; b.nextValue = c;
        SinglyLinkedList reverse = reverse(a);
        System.out.println(reverse.getValue());
        System.out.println(reverse.nextValue.getValue());
        System.out.println(reverse.nextValue.nextValue.getValue());
    }

    // Write a function to reverse a linked list in place. The function will take in 
    //the head of the list as input and return the new head of the list.
    public static SinglyLinkedList reverse(SinglyLinkedList node) {
        SinglyLinkedList current = node;
        SinglyLinkedList previous = null;
        SinglyLinkedList next;

        while(current != null) {
            next = current.nextValue;
            current.nextValue = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}