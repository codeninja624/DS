package L6Q1;

import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        System.out.println("Enter an integer value: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        MyStack<Integer>stack=new MyStack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println("Size: "+stack.getSize());
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
