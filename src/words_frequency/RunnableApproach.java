package words_frequency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RunnableApproach implements Runnable {

    @Override
    public void run() {
        int wordFrequency = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/shubh/Desktop/rough.txt"))) {
            String eachLine = bufferedReader.readLine();
            while (eachLine != null) {
                String[] eachWord = eachLine.split("[ ]");
                wordFrequency = wordFrequency + eachWord.length;
                eachLine = bufferedReader.readLine();
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        System.out.println(wordFrequency);
    }
}
