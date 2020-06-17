package oracledocumentation.chapter1;

/**
 * This Program is returning reverse of Given String
 */
public class MemoryManagement {
    public static String reverseIt(String source) {
        int length = source.length();
        /* This reverseString is used as temporary Object refrence */
        StringBuilder reversedString = new StringBuilder(length);
        for (int i = (length - 1); i >= 0; i--) {
            reversedString.append(source.charAt(i));
        }
        return reversedString.toString(); /* After returing result it will be available to Garbage collector */
    }

    public static void main(String[] args) {
        System.out.println(MemoryManagement.reverseIt("Kanhaiya"));
    }
}
