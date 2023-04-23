package L1Q2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L1Q2II {
    public static void main(String[] args) throws FileNotFoundException {
        String[] fileNameArray =
                {"text1.txt", "text2.txt", "text3.txt", "text4.txt"};
        String[] delimiter = {",", ",\\s", ";\\s", "\\d+"};

        for (int i = 0; i < fileNameArray.length; i++) {
            int tokenCount=0;
            int charCount=0;
            String character="";
            Scanner scanner=new Scanner(new File(fileNameArray[i]));
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                String[]word=line.split(delimiter[i]);
                tokenCount+= word.length;
                for(String ch:word){
                    character+=ch+"\t";
                    charCount+=ch.length();
                }
                character+="\n";
            }
            System.out.println("Number of tokens count: "+tokenCount);
            System.out.println("Number of character count: "+charCount);
            System.out.println(character);
            scanner.close();

        }


    }

}
