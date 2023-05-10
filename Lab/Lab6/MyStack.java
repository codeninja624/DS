package L6Q1;


public class MyStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize()-1);
        return o;
    }
    public E peek(){
        return list.get(getSize() - 1);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public String toString(){
        return list.toString();
    }
    public boolean search (E o){
        return list.contains(o);
    }
}
