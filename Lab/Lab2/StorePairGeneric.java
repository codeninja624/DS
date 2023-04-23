package L2Q3;

public class StorePairGeneric <T extends Comparable<T>,K>implements Comparable<StorePairGeneric<T,K>>{
    private T first;
    private K second;

    public StorePairGeneric(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public void setPair(T first,K second) {
        this.first = first;
        this.second = second;

    }
    public String toString(){
        return "first= "+first+"second= "+second;
    }
    public boolean equals(StorePairGeneric<T,K> o){
        return this.first.equals(o.first);
    }
    public int compareTo(StorePairGeneric<T,K>o){
        return this.first.compareTo(o.first);
    }



}
