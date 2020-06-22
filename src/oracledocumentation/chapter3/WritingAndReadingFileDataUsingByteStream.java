package oracledocumentation.chapter3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This Class Explains about reading a byte data from a file
 * and writing it to another file
 */
public class WritingAndReadingFileDataUsingByteStream {
    /*
     * For Character Stream We  will be using
     * FileReader and FileWriter Class
     */
    FileInputStream fileInputStream = null;
    FileOutputStream fileOutputStream = null;

    public static void main(String[] args) throws IOException {
        WritingAndReadingFileDataUsingByteStream writingAndReadingFileDataUsingByteStream = new WritingAndReadingFileDataUsingByteStream();
        writingAndReadingFileDataUsingByteStream.readAndWriteData();
    }

    public void readAndWriteData() throws IOException {
        try {
            fileInputStream = new FileInputStream("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/OutFile.txt");
            fileOutputStream = new FileOutputStream("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/input.txt");
            int number = fileInputStream.read();
            while (number != -1) {
                fileOutputStream.write(number);
                fileOutputStream.flush();
                number = fileInputStream.read();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }
}
