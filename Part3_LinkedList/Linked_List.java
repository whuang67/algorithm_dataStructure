class SinglyLinkedList {
    private double value;
    public SinglyLinkedList nextValue = null;

    public SinglyLinkedList(double value) { this.value = value; }

    public double getValue() { return value; }
}
class DoubleLinkedList {
    private double value;
    public DoubleLinkedList prevValue = null;
    public DoubleLinkedList nextValue = null;

    public DoubleLinkedList(double value) { this.value = value; }

    public double getValue() { return value; }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Singly Linked List -------------------------------------");
        SinglyLinkedList x = new SinglyLinkedList(1);
        SinglyLinkedList y = new SinglyLinkedList(3);
        SinglyLinkedList z = new SinglyLinkedList(5);
        x.nextValue = y; y.nextValue = z;
        System.out.println(x.getValue());
        System.out.println(x.nextValue.getValue());
        System.out.println(x.nextValue.nextValue.getValue());

        System.out.println("Double Linked List -------------------------------------");
        DoubleLinkedList a = new DoubleLinkedList(1);
        DoubleLinkedList b = new DoubleLinkedList(2);
        DoubleLinkedList c = new DoubleLinkedList(3);
        a.nextValue = b; b.nextValue = c;
        c.prevValue = b; b.prevValue = a;

        System.out.println(a.getValue());
        System.out.println(a.nextValue.getValue());
        System.out.println(a.nextValue.nextValue.getValue());
        System.out.println(c.getValue());
        System.out.println(c.prevValue.getValue());
        System.out.println(c.prevValue.prevValue.getValue());
    }
}