package L2Q3;

public class Test {
    public static void main(String[] args) {
        StorePairGeneric<Integer, Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer, Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer, Integer> c = new StorePairGeneric<>(6, 3);
        System.out.println("a compare to b "+a.compareTo(b));
        System.out.println("a compare to c "+a.compareTo(c));
        System.out.println("b compare to c "+b.compareTo(c));

        System.out.println("a equals b "+a.equals(b));
        System.out.println("a equals c "+a.equals(c));
        System.out.println("b equals c "+b.equals(c));

    }
}
