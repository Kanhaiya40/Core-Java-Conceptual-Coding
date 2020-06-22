package oracledocumentation.chapter4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Write a program that reads a text file,
 * specified by the first command line argument,
 * into a List. The program should then print random lines from the file,
 * the number of lines printed to be specified by the second command line argument.
 * Write the program so that a correctly-sized collection is allocated all at once,
 * instead of being gradually expanded as the file is read in.
 * Hint: To determine the number of lines in the file,
 * use java.io.File.length to obtain the size of the file,
 * then divide by an assumed size of an average line.
 */
public class ListWithRandomLinesOfFile {
    public static void main(String[] args) {
        final int assumedLineLength = 50;
        File file = new File("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/GivenFile.txt");
        List<String> fileList = new ArrayList<>((int) (file.length() / assumedLineLength) * 2);
        BufferedReader bufferedReader = null;
        int lineCount = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            for (String line = bufferedReader.readLine(); line != null;
                 line = bufferedReader.readLine()) {
                fileList.add(line);
                lineCount++;
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.exit(1);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ignored) {
                }
            }
        }
        int repeats = Integer.parseInt("567");
        Random random = new Random();
        for (int i = 0; i < repeats; i++) {
            System.out.format("%d: %s%n", i, fileList.get(random.nextInt(lineCount - 1)));
        }
    }
}