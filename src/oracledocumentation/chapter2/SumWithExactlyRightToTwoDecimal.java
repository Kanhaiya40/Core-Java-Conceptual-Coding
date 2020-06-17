package oracledocumentation.chapter2;

/**
 * Problem--
 * It displays the sum of the arguments,
 * using exactly two digits to the right of the decimal point
 */
public class SumWithExactlyRightToTwoDecimal {
    public static void main(String[] args) {
        float sum = 0;
        for (String arg : args) {
            sum = sum + Float.parseFloat(arg);
        }
        System.out.println(Math.round(sum * Math.pow(10, 2)) / Math.pow(10, 2));
    }
}
