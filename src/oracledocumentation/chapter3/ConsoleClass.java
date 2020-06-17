package oracledocumentation.chapter3;

import java.io.Console;
import java.util.Arrays;

public class ConsoleClass {
    public static void main(String[] args) {
        Console console = System.console();
        String login = console.readLine("Enter UserId:");
        char[] oldPassword = console.readPassword();
        if (verify()) {
            boolean noMatch;
            do {
                char[] newPassword1 = console.readPassword("Enter your new password: ");
                char[] newPassword2 = console.readPassword("Enter new password again: ");
                noMatch = !Arrays.equals(newPassword1, newPassword2);
                if (noMatch) {
                    console.format("Passwords don't match. Try again.%n");
                } else {
                    change();
                    console.format("Password for %s changed.%n", login);
                }
                Arrays.fill(newPassword1, ' ');
                Arrays.fill(newPassword2, ' ');
            } while (noMatch);
        }
        Arrays.fill(oldPassword, ' ');
    }

    // Dummy change method.
    static boolean verify() {
        // This method always returns
        // true in this example.
        // Modify this method to verify
        // password according to your rules.
        return true;
    }

    // Dummy change method.
    static void change() {
        // Modify this method to change
        // password according to your rules.
    }
}

