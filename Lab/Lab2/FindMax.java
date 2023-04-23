package L2Q5;

public class FindMax {
    public static void main(String[] args) {
        Integer[]numbers={1,2,3};
        String[]colours={"red","green","blue"};
        Circle[]circle={new Circle(3),new Circle(2.9),new Circle(5.9)};
        System.out.println("Max Integer: "+max(numbers));
        System.out.println("Max String: "+max(colours));
        System.out.println("Max Circle: "+max(circle).getRadius());

    }
    public static <E extends Comparable<E>>E max(E[]list){
        E max=list[0];
        for (int i = 0; i < list.length; i++) {
            if(list[i].compareTo(max)>0){
                max=list[i];
            }
        }
        return max;
    }
}
