package test_program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailChecker {

    public static void main(String[] args) {
        System.out.println("Enter Mail Id:");
        Scanner scanner = new Scanner(System.in);
        String inputMailId = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-f]|(_)[0-4]@tapfame.com");
        Matcher matcher = pattern.matcher(inputMailId);
        if (matcher.find()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
