package hacker_earth_problems;

import java.util.Scanner;

public class StringChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String[] result = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            StringBuilder jerryInput = new StringBuilder(scanner.next());
            String tomInput = scanner.next();

            for (int k = 0; k < tomInput.length(); k++) {
                for (int j = k; j < jerryInput.length(); j++) {
                    if (tomInput.charAt(k) != jerryInput.charAt(j)) {
                        jerryInput.deleteCharAt(j);
                    }
                    else if ((jerryInput.toString().equals(tomInput))){
                        result[i] = "YES";
                        break;
                    }
                }
            }
            if (!jerryInput.toString().equals(tomInput)) {
                result[i] = "NO";
            }
            else {
                result[i] = "YES";
            }
        }
        for (String res : result) {
            System.out.println(res);
        }
    }
}
