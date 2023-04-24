package L3Q1;

public class ArrayBagDemo {
    private static void testAdd(BagInterface<String> aBag, String[] content){
        System.out.print("Adding ");
        for(String c:content){
            aBag.add(c);
            System.out.print(c+" ");
        }
        System.out.println();

    }
    private static void displayBag(BagInterface<String> aBag){
        System.out.println("The bag contains "+aBag.getCurrentSize()+" string(s), as follows:");
        Object[]arr=aBag.toArray();
        for(Object o:arr){
            System.out.print(o+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BagInterface<String> bag1=new ArrayBagg();
        BagInterface<String> bag2=new ArrayBagg();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        System.out.println("bag1: ");
        testAdd(bag1,contentsOfBag1);
        displayBag(bag1);
        System.out.println();

        System.out.println("bag2: ");
        testAdd(bag2,contentsOfBag2);
        displayBag(bag2);
        System.out.println();

        BagInterface<String>bag3=bag1.union(bag2);
        System.out.println("bag3, test the method union of bag1 and bag2:");
        displayBag(bag3);
        System.out.println();

        BagInterface<String>bag4=bag1.intersection(bag2);
        System.out.println("bag4, test the method intersection of bag1 and bag2:");
        displayBag(bag4);
        System.out.println();

        BagInterface<String>bag5=bag1.difference(bag2);
        System.out.println("bag5, test the method difference of bag1 and bag2:" );
        displayBag(bag5);
        System.out.println();

        }
}
