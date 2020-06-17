package oracledocumentation.chapter2;

/**
 * Problem-
 * Instead of reading integer arguments, it reads floating-point arguments.
 */
public class PassingFloatingInsteadOfIntegerInCommandLine {
    public static void main(String[] args) {
        float sum = 0;
        for (String arg : args) {
            sum = sum + Float.parseFloat(arg);
        }
        System.out.println(sum);
    }
}
