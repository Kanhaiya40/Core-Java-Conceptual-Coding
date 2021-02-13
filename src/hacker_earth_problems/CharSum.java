package hacker_earth_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> charSum = new HashMap<>();
        charSum.put((char) (97), 1);
        for (int i = 1; i < 26; i++) {
            char character = (char) (97 + i);
            charSum.put(character, i + 1);
        }
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum += charSum.get(input.charAt(i));
        }
        System.out.println(sum);
    }
}
