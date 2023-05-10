package L6Q4;

import java.util.Scanner;

public class Palindrome <E>{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string (Maiximum length : 15): ");
        String str= scanner.nextLine();

        GenericStack<Character>stack=new GenericStack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String reverse="" ;
        while(!stack.isEmpty()){
            reverse+=stack.pop();
        }
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
