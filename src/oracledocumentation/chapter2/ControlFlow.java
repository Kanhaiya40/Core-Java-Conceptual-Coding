package oracledocumentation.chapter2;

/**
 * Problem--
 * Consider the following code snippet.
 * <p>
 * if (aNumber >= 0)
 * if (aNumber == 0)
 * System.out.println("first string");
 * else System.out.println("second string");
 * System.out.println("third string");
 * What output do you think the code will produce if aNumber is 3?o/p--second string,third string
 * Write a test program containing the previous code snippet; make aNumber 3.
 * What is the output of the program?
 * Is it what you predicted? Explain why the output is what it is; in other words,
 * what is the control flow for the code snippet?
 * Using only spaces and line breaks, reformat the code snippet to make the control flow easier
 * to understand.Use braces, { and }, to further clarify the code.
 */
public class ControlFlow {
    public static void main(String[] args) {
        int aNumber = 3;
        while (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first string");
            } else {
                System.out.println("second string");
            }
            aNumber--;
        }
        System.out.println("third string");
    }
}
