package OracleDocumentation.chapter1;

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
                        fileWriter = new FileWriter("abc.txt");
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
        /* finalize Method Overidden from Object Class */
        public void finalize()
        {

                try {
                        System.out.println("This is Finalize Method");
                        // closing stream refrence
                        fileWriter.close();
                }
                catch (Exception exception)
                {
                        System.out.println(exception);
                }
        }
        public static void main(String[] args) throws IOException {
                fileWriter.write(10);
                AccessingOfFinilizeMethod accessingOfFinilizeMethod=new AccessingOfFinilizeMethod();
                accessingOfFinilizeMethod=null; // nullifing the Object
                System.gc(); //garbage colector Calling

        }
}
