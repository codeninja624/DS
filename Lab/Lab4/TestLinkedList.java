package L4Q1test;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> c = new MyLinkedList<>();
        c.addLast('a');
        c.addLast('b');
        c.addLast('c');
        c.addLast('d');
        c.addLast('e');
        System.out.println("Elements in the list: ");
        c.print();
        System.out.println();
        System.out.println("Elements in reverse order: ");
        c.reverse();
        System.out.println();
        System.out.println("Middle value of element: " + c.getMiddleValue());
        System.out.println("Number of elements in the list: " + c.size);
        System.out.println("First value: " + c.getFirst());
        System.out.println("Last value: " + c.getLast());
        System.out.println("Value deleted: " + c.remove(2));
        System.out.println("Second value: " + c.indexOf('b'));
        System.out.println("Third value: " + c.indexOf('c'));
        System.out.println("List has value 'c'?" + c.contains('c'));

        c.set(0, 'j');
        c.set(1, 'a');
        c.set(2, 'v');
        c.set(3, 'a');
        System.out.println("Elements: ");
        c.print();
        System.out.println();
        System.out.println("Middle value of element: " + c.getMiddleValue());
    }
}