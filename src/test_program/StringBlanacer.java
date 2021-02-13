package test_program;

import java.util.Stack;

public class StringBlanacer {

    public static void main(String[] args) {
        String input = "[ [ ] ]";
        StringBlanacer stringBlanacer = new StringBlanacer();
        boolean isbalance = stringBlanacer.checkString(input);
        if (isbalance) {
            System.out.println("Balaced String");
        } else {
            System.out.println("Not Balanced String");
        }
    }

    private boolean checkString(String input) {
        Stack<Character> checkString = new Stack<>();
        if (input.charAt(0) == ']') {
            return false;
        } else {
            checkString.push(input.charAt(0));
        }

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == '[') {
                checkString.push(input.charAt(i));
            } else if (input.charAt(i) == ']' && checkString.peek() == '[') {
                checkString.pop();
            }
        }
        return checkString.isEmpty();
    }
}
