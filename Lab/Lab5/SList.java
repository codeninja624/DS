package SList;

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

    public void appendEnd(E e) {
        if (tail == null) {
            head = tail = new SNode<E>(e);
        } else {
            SNode<E> current = new SNode<>(e);
            tail.next = current;
            tail = tail.next;
        }
        size++;
    }

    public E removeInitial() {
        if (size == 0) {
            return null;
        } else {
            SNode<E> current = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return current.element;
        }
    }
    public boolean contains(E e){
        SNode<E>current=head;
        for (int i = 0; i < size; i++) {
            if(e.equals(current.element)){
                return true;
            }
        }
        return false;
    }
    public void clear(){
        head=null;
        tail=null;
    }
    public void display(){
        SNode<E>current=head;
        while(current!=null){
            System.out.print(current.element+" ");
            current=current.next;
        }
    }
}
