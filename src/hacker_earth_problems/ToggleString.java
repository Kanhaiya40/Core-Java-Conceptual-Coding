package hacker_earth_problems;

import java.util.Scanner;

public class ToggleString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.next();
        char[] input = inp.toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (Character.isLowerCase(input[i])) {
                input[i] = Character.toUpperCase(input[i]);
            } else {
                input[i] = Character.toLowerCase(input[i]);
            }
        }
        StringBuilder output = new StringBuilder();
        for (char ch : input) {
            output.append(ch);
        }
        System.out.println(output);
    }
}
