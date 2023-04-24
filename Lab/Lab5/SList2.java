package L5Q2;

public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;

    public SList() {
    }

    public SList(SNode<E> head, SNode<E> tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public void add(E e) {
        if (tail == null) {
            head=tail = new SNode<>(e);
        } else {
            SNode<E> temp = new SNode<>(e);
            tail.next = temp;
            tail = tail.next;
        }
        size++;
    }

    public void removeElement(E e) {
        SNode<E> current ;
        if (head.element.equals(e)) {
            current=head;
            head = head.next;
        } else {
            SNode<E> previous = head;
            while (!previous.next.element.equals(e)) {
                previous = previous.next;
            }
            current = previous.next;
            previous.next = current.next;
        }
        size--;
        System.out.println(current.element);
    }

    public void printList() {
        SNode<E> current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        SNode<E> current = head;
        while (current!=null){
            if (e.equals(current.element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void replace(E e, E newE) {
        SNode<E> current = head;
            while (!e.equals(current.element)) {
                current=current.next;

            }
            current.element=newE;
        }
    }

