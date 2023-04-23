package L2Q4;

public class test {
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
    public static <T extends Comparable<T>>String minmax(T[]array){
        T max=array[0];
        T min=array[0];
        for(T x:array){
            if(x.compareTo(max)>0){
                max=x;
            }
            if(x.compareTo(min)<0){
                min=x;
            }
        }
        return "Max"+max+"Min"+min;
    }
}
