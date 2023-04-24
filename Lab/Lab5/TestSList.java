package SList;

public class TestSList {
    public static void main(String[] args) {
        SList<String>append= new SList<String>();
        append.appendEnd("Linked list");
        append.appendEnd("is");
        append.appendEnd("easy");
        append.display();
        System.out.println();
        System.out.println("Removed value: "+append.removeInitial());
        System.out.println("Check if difficult is in the list: "+append.contains("difficult"));
        append.clear();
        System.out.print("After clearing list: ");
        append.display();

    }
}
