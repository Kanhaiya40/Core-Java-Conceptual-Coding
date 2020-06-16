package OracleDocumentation.chapter3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class SummationUsingScanning {
        public static void main(String[] args) {
                double sum=0;
                Scanner scanner=null;
                try
                {
                        scanner=new Scanner(new BufferedReader(new FileReader("input.txt")));
                        scanner.useLocale(Locale.US);
                        while (scanner.hasNext()) {
                                if (scanner.hasNextDouble()) {
                                        sum=sum+scanner.nextDouble();
                                }
                                else{
                                        scanner.next();
                                }
                        }
                }
                catch(FileNotFoundException fileNotFoundException)
                {
                        fileNotFoundException.printStackTrace();
                }
                finally {
                        if (scanner!=null){
                                scanner.close();
                        }
                }
                System.out.println(sum);

        }
}
