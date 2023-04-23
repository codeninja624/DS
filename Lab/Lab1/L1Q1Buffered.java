package L1Q1;

import java.io.*;

public class L1Q1Buffered {
    public static void main(String[] args) throws IOException {
        String path = "letter one";
        print(path);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
        System.out.println("Enter text to apppend");
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
        }
        bufferedWriter.close();
        print(path);

    }

    public static void print(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
