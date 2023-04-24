package L4Q1test;

public class MyLinkedList<E> {
    Node <E>head;
    Node<E>tail;
    int size;


    public MyLinkedList() {
        head = null;
        tail = null;
    }
    public void addFirst(E e){
        Node<E>current=new Node<>(e);
        current.next=head;
        head=current;
        size++;
        if(tail==null){
            tail=head;
        }
    }
    public void addLast(E e){
        if(size==0){
            head=tail=new Node<>(e);
        }else{
            tail.next=new Node<>(e);
            tail=tail.next;
        }
        size++;
    }
    public void add(int index,E e){
        if(index==0){
            addFirst(e);
        }else if(index>=size){
            addLast(e);
        }else{
            Node<E>current=head;
            for (int i = 0; i < index; i++) {
                current=current.next;
            }
            Node<E>newnode=current.next;
            current.next=new Node<>(e);
            current.next.next=newnode;
        }
        size++;

    }
    public E removeFirst(){
        if(size==0){
            return null;
        }else {
            Node<E> current = head;
            head = head.next;
            if(head==null){
                tail=null;
            }
            size--;

            return current.element;
        }
    }
    public E removeLast(){
        if(size==0){
            return null;
        }else if(size==1){
            Node<E>current=head;
            head=tail=null;
            size=0;
            return current.element;
        }else {
            Node<E>current=head;
            for (int i = 0; i < size-2; i++) {
                current=current.next;
            }
            Node<E>temp=tail;
            tail=current;
            tail.next=null;
            size--;
            return temp.element;
        }
    }
    public E remove(int index){
        if(index<0||index>=size) {
            return null;
        }else if(index==0) {
            return removeFirst();
        }else if (index==size-1){
            return removeLast();
        }else {
            Node<E> previous=head;
            for (int i = 1; i < index; i++) {
                previous=previous.next;
            }
            Node<E>current=previous.next;
            previous.next=current.next;
            size--;
            return current.element;
        }
    }
    public boolean contains(E e){
        Node<E>current=head;
        for (int i = 0; i < size; i++) {
            if(e.equals(current)){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public E get(int index){
        Node<E>current=head;
        for (int i = 0; i < index; i++) {
            current=current.next;
        }
        return current.element;
    }
    public E getFirst(){
        if(head==null){
            return null;
        }
        return head.element;
    }
    public E getLast(){
        if(tail==null){
            return null;
        }
        return tail.element;
    }
    public int indexOf(E e){
        int index=-1;
        Node<E>current=head;
        if(current!=null){
            for (int i = 0; i < size; i++) {
                if (e.equals(current.element)) {
                    index = i;
                    break;
                }
                current = current.next;
            }
        }
        return index;
    }
    public int lastIndexOf(E e){
        int index=-1 ;
        Node<E>current=head;
        for (int i = 0; i < size; i++) {
            if(e.equals(current)){
                index=i;
            }
            current=current.next;
        }
        return index;
    }
    public E set(int index, E e){
        if (index < 0 || index >= size) {
            return null;
        }
        Node<E>current=head;
        for (int i = 0; i < index; i++) {
            current=current.next;
        }
        E temp=current.element;
        current.element=e;
        return temp;
    }
    public void clear(){
        head=null;
        tail=null;
    }
    public void print(){
        Node<E>current=head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.element);
            current=current.next;
        }
    }
    public void reverse(){
//        if(head == null && tail == null) {
//            System.out.println("[ ]");
//        }
//        else {
//            String s = head.element + "";
//            for(Node<E> node = head; node != null; node = node.next) {
//                s = node.element + ", " + s;
//            }
//            System.out.printf("[%s]\n", s);
//        }
        if(head==null&&tail==null){
            System.out.println(" ");
        }else{
            String s=head.element+" ";
//            for (Node <E>current=head; current!=null ; current=current.next) {
//                s=current.element+","+s;
//            }
            Node <E> current=head;
            while(current!=null){
                s=current.element+","+s;
                current=current.next;

            }
            System.out.println(s);
        }
    }
    public E getMiddleValue(){
        Node<E>current=head;
        int middle=size/2;
        for (int i = 0; i < middle; i++) {
            current=current.next;
        }
        return current.element;
    }
}
