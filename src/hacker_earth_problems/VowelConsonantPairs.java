package hacker_earth_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelConsonantPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int[] result = new int[noOfTestCases];
        int count = 0;
        for (int i = 0; i < noOfTestCases; i++) {
            count = 0;
            int sizeOfString = scanner.nextInt();
            String input = scanner.next();
            for (int j = 0; j < sizeOfString - 1; j++) {
                if (!vowels.contains(input.charAt(j))) {
                    if (vowels.contains(input.charAt(j + 1))) {
                        count++;
                    }
                }
            }
            result[i] = count;
        }
        for (int occurence : result) {
            System.out.println(occurence);
        }
    }
}
