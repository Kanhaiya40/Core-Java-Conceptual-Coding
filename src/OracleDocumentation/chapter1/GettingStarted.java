package OracleDocumentation.chapter1;

import java.awt.*;
import java.util.Scanner;

/**
 * This Class Describes Basics of Java Language
 */
public class GettingStarted {
        public static void main(String[] args) {
                /*
                *  Printing HelloWorld Program
                 */
                System.out.println("This Is Program To Print HelloWorld");
                //Declaring a Array
                int myPoints[];


                //Intializing a array
                myPoints=new int[10];

                int  i;
                for (i = 0;  i < 10;  i++)
                {
                        Scanner scanner=new Scanner(System.in);

                        myPoints[i] = scanner.nextInt();     //Allocating Memory to array

                }

        }
}
