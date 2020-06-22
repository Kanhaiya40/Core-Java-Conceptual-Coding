package oracledocumentation.chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Based on AsciiCode Sum Of the Given string
 */
public class SumOfStringBasedOnAscciCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            char lowerCase = (char) ((char) 65 + i);
            map.put(lowerCase, 65 + i);
            char upperCase = (char) ((char) 97 + i);
            map.put(upperCase, 97 + i);
        }
        System.out.println("According to Ascii Value Sum Of Given String is:" + calculateSum(input, map));
    }

    private static int calculateSum(String input, Map<Character, Integer> map) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i)))
                sum = sum + map.get(input.charAt(i));
        }
        return sum;
    }
}
