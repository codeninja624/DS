package L2Q2;
public class CompareMax {
    public static <E extends Comparable<E>> E maximum(E a, E b, E c) {
        E maximum=a;
        if(b.compareTo(maximum)>0){
            maximum=b;
        }
        if(c.compareTo(maximum)>0){
            maximum=c;
        }
        return maximum;
    }

    public static void main(String[] args) {
        Integer integer= maximum(1,2,3);
        System.out.println("Maximum integer: "+integer);
        String string=maximum("a","b","c");
        System.out.println("Maximum string: "+string);
    }
}