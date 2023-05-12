package L7Q1;

import java.util.Collections;
import java.util.LinkedList;

public class MyQueue <E>{
    private LinkedList<E>list;
    public MyQueue() {
        list=new LinkedList<>();
    }

    public MyQueue(E[]e){
        list=new LinkedList<>();
//        for(E element:e){
//            list.add(element);
//        }
        Collections.addAll(list,e);
    }
    public void enqueue(E e){
        list.add(e);
    }
    public E dequeue(){
        return list.removeFirst();
    }
    public E getElement(int i){
        return list.get(i);
    }
    public E peek(){
        return list.getFirst();
    }
    public int getSize(){
        return list.size();
    }
    public boolean contains(E e){
        return list.contains(e);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public String toString(){
        return list.toString();
    }

    public static void main(String[] args) {
        MyQueue<String>fruitQ=new MyQueue<>(new String[]{"Durian","Blueberry"});
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println(fruitQ.toString());
        System.out.println("Top item: "+fruitQ.peek());
        System.out.println("Queue size: "+fruitQ.getSize());
        fruitQ.dequeue();
        System.out.println("Item in index position of 2: "+fruitQ.getElement(2));
        System.out.println("The queue consists of Cherry? "+fruitQ.contains("Cherry"));
        System.out.println("The queue consists of Durian? "+fruitQ.contains("Durian"));
        while (!fruitQ.isEmpty()){
            System.out.print(fruitQ.dequeue()+" ");
        }

    }
}
