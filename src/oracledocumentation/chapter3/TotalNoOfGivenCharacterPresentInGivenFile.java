package oracledocumentation.chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static sun.nio.ch.IOStatus.EOF;

/**
 * Problem--
 * Write an example that counts the number of times a particular character,
 * such as e, appears in a file. The character can be specified at the command line
 */
public class TotalNoOfGivenCharacterPresentInGivenFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/GivenFile.txt"));
        char ch = args[0].charAt(0);
        int stream = bufferedReader.read();
        char ch1;
        while (stream != EOF) {
            ch1 = (char) stream;
            if (ch1 == ch) {
                count++;
            }
            stream = bufferedReader.read();
        }
        bufferedReader.close();
        System.out.println("No of time" + ch + "is =" + count);
    }
}
