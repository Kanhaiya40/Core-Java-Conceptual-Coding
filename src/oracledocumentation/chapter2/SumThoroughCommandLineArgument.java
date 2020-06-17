package oracledocumentation.chapter2;

/**
 * Problem--
 * Create a program that reads an unspecified number of integer arguments
 * from the command line and adds them together. For example, suppose that you enter the following:
 * java Adder 1 3 2 10
 */
public class SumThoroughCommandLineArgument {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum = sum + Integer.parseInt(arg);
        }
        System.out.println(sum);
    }
}
