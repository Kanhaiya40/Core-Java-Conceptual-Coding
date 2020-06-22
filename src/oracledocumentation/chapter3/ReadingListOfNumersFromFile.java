package oracledocumentation.chapter3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Add a readList method to ListOfNumbers.java.
 * This method should read in int values from a file, print each value,
 * and append them to the end of the vector. You should catch all appropriate errors.
 * You will also need a text file containing numbers to read in.
 */
public class ReadingListOfNumersFromFile {
    private static final int SIZE = 10;
    private final List<Integer> list;

    public ReadingListOfNumersFromFile() {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(i);
    }

    public static void main(String[] args) {
        ReadingListOfNumersFromFile readingListOfNumersFromFile = new ReadingListOfNumersFromFile();
        readingListOfNumersFromFile.writeList();
        readingListOfNumersFromFile.readList();
    }

    public void writeList() {
        PrintWriter out = null;
        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/OutFile.txt"));
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                    e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public void readList() {
        BufferedReader in;
        Vector<Character> vector = new Vector<>();
        try {
            in = new BufferedReader(new FileReader("OutFile.txt"));
            int number = in.read();
            while (number != -1) {
                System.out.print((char) number);
                vector.add((char) number);
                number = in.read();
                System.out.println(vector);
            }
            System.out.println("Closing BufferReader");
            in.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
