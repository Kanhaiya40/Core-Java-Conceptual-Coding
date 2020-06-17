package oracledocumentation.chapter2;

/**
 * Problem--
 * Change MaxVariablesDemo to show minimum values instead of maximum values.
 * You can delete all code related to the variables aChar and aBoolean. What is the output?
 * <p>
 * output--
 * Smallest Integer Value=-2147483648
 * Smallest Byte Value=-128
 * Smallest Long Value=-9223372036854775808
 * Smallest Short Value=-32768
 * Smallest Float Value=1.4E-45
 * Smallest Double Value=4.9E-324
 * <p>
 * This Class Defines Min Value can have the following Data types
 */
public class MinVariableOfDataTypes {
    public static void main(String[] args) {
        int smallestIntegerValue = Integer.MIN_VALUE;
        byte smallestByteValue = Byte.MIN_VALUE;
        long smallestLongvalue = Long.MIN_VALUE;
        short smallestShortValue = Short.MIN_VALUE;
        float smallestFloatValue = Float.MIN_VALUE;
        double smallestDoubleValue = Double.MIN_VALUE;
        System.out.println("Smallest Integer Value=" + smallestIntegerValue);
        System.out.println("Smallest Byte Value=" + smallestByteValue);
        System.out.println("Smallest Long Value=" + smallestLongvalue);
        System.out.println("Smallest Short Value=" + smallestShortValue);
        System.out.println("Smallest Float Value=" + smallestFloatValue);
        System.out.println("Smallest Double Value=" + smallestDoubleValue);
    }
}
