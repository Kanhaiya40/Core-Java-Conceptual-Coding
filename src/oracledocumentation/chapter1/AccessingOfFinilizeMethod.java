package oracledocumentation.chapter1;

import java.io.FileWriter;
import java.io.IOException;

/**
 * This Class Tell state of Object being destroyed and finalize method is invoked by System class
 */
public class AccessingOfFinilizeMethod {
    /* Declaring refrence variable for stream */
    static FileWriter fileWriter;

    static {
        try {
            /* allocating memory for stream Object refrence */
            fileWriter = new FileWriter("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/abc.txt");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        fileWriter.write(10);
        System.gc(); //garbage colector Calling

    }

    /* finalize Method Overidden from Object Class */
    public void finalize() {

        try {
            System.out.println("This is Finalize Method");
            // closing stream refrence
            fileWriter.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
