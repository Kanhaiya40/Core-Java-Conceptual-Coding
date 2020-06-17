package oracledocumentation.chapter3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Use a backreference to write an expression that will match a person's name
 * only if that person's first name and last name are the same
 */
public class PersonNameValidationThroughRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Pattern pattern = Pattern.compile("([A-Z][a-zA-Z]*)");
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            System.out.println("Person Name Matched");
        } else {
            System.out.println("Not a formal name");
        }
    }
}
