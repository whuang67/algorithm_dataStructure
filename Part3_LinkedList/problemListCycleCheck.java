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
        System.out.println(cycleCheck(a));
        c.nextValue = a;
        System.out.println(cycleCheck(a));
    }
    
    //Given a singly linked list, write a function which takes in the first node in a 
    //singly linked list and returns a boolean indicating if the linked list contains 
    //a 'cycle'.
    //A cycle is when a node's next point actually points back to a previous node in 
    //the list. This is also sometimes known as a circularly linked list. 
    //The linked list node class is given:
    public static boolean cycleCheck(SinglyLinkedList node) {
        SinglyLinkedList marker1 = node.nextValue;
        SinglyLinkedList marker2 = node.nextValue.nextValue;

        while(marker1.nextValue != null && marker2.nextValue != null) {
            if(marker1.getValue() == marker2.getValue())
                return true;
            marker1 = marker1.nextValue;
            marker2 = marker2.nextValue.nextValue;
        }
        return false;
    }
}