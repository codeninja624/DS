package L7Q1;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeQ2 {
    public static void main(String[] args) {
        String[]inputs={"T_T","uvvwu","xyzzyx","pppqpp"};
        for (int i = 0; i < inputs.length; i++) {
            System.out.println(inputs[i]+" " +(isPalindrome(inputs[i])?"Palindrome":"Not Palindrome"));
        }
    }
    public static boolean isPalindrome(String s){
        Queue<Character> q=new LinkedList<>();
        for (int i = 0; i < s.length()/2; i++) {
            q.offer(s.charAt(i));
        }
        for (int i = s.length()-1; !q.isEmpty() ; i--) {
            if(q.poll()!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
