package oracledocumentation.chapter1;

/**
 * This Class Describes Basics of Java Language
 */
public class GettingStarted {
    public static void main(String[] args) {
        /*  Printing HelloWorld Program */
        System.out.println("This Is Program To Print HelloWorld");
        //Declaring a Array
        int[] myPoints;
        //Intializing a array
        myPoints = new int[3];
        int i;
        for (i = 0; i < 3; i++) {
            myPoints[i] = i;     //Allocating Memory to array
        }
        for (int value : myPoints
        ) {
            System.out.print(value);
        }
    }
}
