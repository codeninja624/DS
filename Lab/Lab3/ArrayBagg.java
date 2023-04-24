package L3Q1;


public class ArrayBagg<T> implements BagInterface<T> {
    private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries = 0;

    public ArrayBagg() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayBagg(int capacity) {
        bag=(T[])new Object[capacity];

    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries==bag.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries==0;
    }


    @Override
    public boolean add(T newEntry) {
        if(!isFull()){
            bag[numberOfEntries++]=newEntry;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public T remove() {
        T result=null;
        if(!isEmpty()){
            result=bag[numberOfEntries-1];
            bag[numberOfEntries-1]=null;
            numberOfEntries--;
        }
        return result;
    }

    @Override
    public boolean remove(T anEntry) {
       if(!isEmpty()){
           for (int i = 0; i < numberOfEntries; i++) {
               if(bag[i].equals(anEntry)){
                   bag[i]=bag[numberOfEntries-1];
                   bag[numberOfEntries-1]=null;
                   numberOfEntries--;
                   return true;
               }
           }
       }
       return false;
    }

    @Override
    public void clear() {
        while (!isEmpty()){
            remove();
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count=0;
        for (int i = 0; i < numberOfEntries; i++) {
            if(anEntry.equals(bag[i])){
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if(anEntry.equals(bag[i])){
                return true;
            }
        }
        return false;

    }

    @Override
    public T[] toArray() {
        T[]result=(T[])new Object[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            result[i]=bag[i];
        }
        return result;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> b) {
        T[]bagA=this.toArray();
        T[]bagB=b.toArray();
        BagInterface<T>newArray=new ArrayBagg<>(bagA.length+bagB.length);
        for (int i = 0; i < bagA.length; i++) {
            newArray.add(bagA[i]);
        }
        for (int i = 0; i < bagB.length; i++) {
            newArray.add(bagB[i]);
        }
        return newArray;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> b) {
        T[]bagA=this.toArray();
        T[]bagB=b.toArray();
        BagInterface<T>newArray=new ArrayBagg<>();
        for (int i = 0; i < bagA.length ; i++) {
            for (int j = 0; j < bagB.length; j++) {
                if(bagA[i].equals(bagB[j])){
                    newArray.add(bagA[i]);
                    bagB[j]=null;
                    break;
                }
            }
        }
        return newArray;

    }

    @Override
    public BagInterface<T> difference(BagInterface<T> b) {
        T[]bagA=this.toArray();
        T[]bagB=b.toArray();
        BagInterface<T>newArray=new ArrayBagg<>();
        for (int i = 0; i < bagA.length ; i++) {
            for (int j = 0; j < bagB.length; j++) {
                if(bagA[i].equals(bagB[j])){
                    bagA[i]=null;
                    bagB[j]=null;
                    break;
                }
            }
        }
        for (int i = 0; i < bagA.length; i++) {
            if(bagA[i]!=null){
                newArray.add(bag[i]);
            }
        }
        return newArray;

    }
}
