package L6Q1;

public class L6Q3correct {
    public static void main(String[] args) {
        MyStack<Integer>stack=new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Sum of every element: "+sum(stack));
    }
    public static int sum (MyStack<Integer>stack){
        int sum=0;
        while(!stack.isEmpty()){
            int o=stack.pop();
            sum+=o;
        }
        return sum;
    }
}
