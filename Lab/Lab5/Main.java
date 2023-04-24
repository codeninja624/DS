package L5Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your student name list. Enter 'n' to end....");
        SList<String>list=new SList<>();
        Scanner scanner=new Scanner(System.in);
        String input;
        while(true){
            input=scanner.nextLine();
            if(input.equalsIgnoreCase("n")){
                break;
            }
            list.add(input);

        }
        System.out.println("You have entered the following students' name: ");
        list.printList();

        System.out.println("The number of students entered is: "+list.getSize());

        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String input1=scanner.nextLine();
        if(input1.equalsIgnoreCase("r")){
            System.out.println("Enter the existing student name that u want to rename: ");
            String answer1=scanner.nextLine();
            System.out.println("Enter the new name: ");
            String answer2=scanner.nextLine();
            list.replace(answer1,answer2);

        }
        System.out.println("The new student list is: ");
        list.printList();
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed");
        String input2=scanner.nextLine();
        if(input2.equals("y")){
            System.out.println("Enter a student name to remove: ");
            String answer3=scanner.nextLine();
            list.removeElement(answer3);
        }
        System.out.println("The number of updated student is: "+list.getSize());
        System.out.println("The updated students list is: ");
        list.printList();
        System.out.println("All student data captured complete. Thank you! ");


    }
}
