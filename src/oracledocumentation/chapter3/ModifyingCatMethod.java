package oracledocumentation.chapter3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

/**
 * Modify the following cat method so that it will compile.
 * public static void cat(File file) {
 * RandomAccessFile input = null;
 * String line = null;
 * <p>
 * try {
 * input = new RandomAccessFile(file, "r");
 * while ((line = input.readLine()) != null) {
 * System.out.println(line);
 * }
 * return;
 * } finally {
 * if (input != null) {
 * input.close();
 * }
 * }
 * }
 * <p>
 * ouput---
 * This row contain 5 elements
 */
public class ModifyingCatMethod {
    public static void cat(File file) throws IOException {
        String line;
        try (RandomAccessFile input = new RandomAccessFile(file, "r")) {
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/input.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("This row contain 5 elements");
            printWriter.flush();
            printWriter.close();
            cat(file);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
