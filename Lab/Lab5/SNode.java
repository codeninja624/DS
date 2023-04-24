package SList;

public class SNode<E> {
    public SNode<E> next;
    public E element;

    public SNode() {
    }

    public SNode(E element) {
        this.element = element;
    }

}
