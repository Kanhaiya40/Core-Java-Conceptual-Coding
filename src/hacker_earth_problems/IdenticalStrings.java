package hacker_earth_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IdenticalStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfTestCase = scanner.nextInt();
        String[] result = new String[noOfTestCase];
        for (int i = 0; i < noOfTestCase; i++) {
            Map<Character, Integer> charCount = new HashMap<>();
            Map<Character, Integer> forInput_2 = new HashMap<>();
            String input_1 = scanner.next();
            String input_2 = scanner.next();
            for (int j = 0; j < input_1.length(); j++) {
                if (charCount.containsKey(input_1.charAt(j))) {
                    charCount.put(input_1.charAt(j), charCount.get(input_1.charAt(j)) + 1);
                } else {
                    charCount.put(input_1.charAt(j), 1);
                }
                if (forInput_2.containsKey(input_2.charAt(j))) {
                    forInput_2.put(input_2.charAt(j), charCount.get(input_2.charAt(j)) + 1);
                } else {
                    forInput_2.put(input_2.charAt(j), 1);
                }
            }
            if (charCount.equals(forInput_2)) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        for (String res : result) {
            System.out.println(res);
        }
    }
}
