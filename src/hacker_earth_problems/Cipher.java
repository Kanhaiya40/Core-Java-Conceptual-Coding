package hacker_earth_problems;

import java.util.Scanner;

public class Cipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int key = scanner.nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                int alphaNumeric = input.charAt(i) + key%26;
                if (alphaNumeric >= 91 && Character.isUpperCase(input.charAt(i))) {
                    alphaNumeric = alphaNumeric % 91 + 65;
                }
                else if (alphaNumeric>=123 && Character.isLowerCase(input.charAt(i))){
                    alphaNumeric=alphaNumeric%123+ 97;
                }
                char alpha = (char) alphaNumeric;
                output.append(alpha);
            } else if (Character.isDigit(input.charAt(i))) {
                int numeric = Integer.parseInt(String.valueOf(input.charAt(i))) + key;
                numeric = numeric % 10;
                output.append(numeric);
            } else {
                output.append(input.charAt(i));
            }
        }
        System.out.println(output);
    }
}
