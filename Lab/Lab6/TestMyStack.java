package L6Q1;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character>stack=new MyStack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack.toString());
        System.out.println("Value 'b' is in the stack?"+stack.search('b'));
        System.out.println("Value 'k' is in the stack?"+stack.search('k'));
        System.out.println();
        MyStack<Integer>intStack=new MyStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println(intStack.toString());
        System.out.println("Value 6 is in the stack?"+intStack.search(6));

    }
}
