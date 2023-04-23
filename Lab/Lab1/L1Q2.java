package L1Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L1Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        String[][]texts={{"text1.txt",","},
                {"text2.txt",",\\s"},
                {"text3.txt",";\\s"},
                {"text4.txt","\\d+"}};
        for(String[]text:texts){
            remove(text[0],text[1]);
        }
    }

    public static void remove(String path,String delimiter) throws FileNotFoundException {
        int tokenCount=0;
        int characterCount=0;
        String text = "";
        Scanner scanner=new Scanner(new FileInputStream(path));
        while(scanner.hasNextLine()){
            String paragraph=scanner.nextLine();
            String[]word=paragraph.split(delimiter);
            tokenCount+=word.length;
            for(String character:word){
                characterCount+=character.length();
                text+=character+"\t";
            }
            text+="\n";
        }
        scanner.close();
        System.out.println("Number of tokens count: "+tokenCount);
        System.out.println("Number of character count: "+characterCount);
        System.out.println(text);
    }
}
