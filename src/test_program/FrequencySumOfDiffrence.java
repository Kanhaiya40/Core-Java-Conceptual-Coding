package test_program;

import java.util.*;

public class FrequencySumOfDiffrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = calculateSumOfDiffrence(input);
        System.out.println(sum);
    }

    private static int calculateSumOfDiffrence(String input) {
        int sum = 0;
        Set<String> subStrings = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            subStrings.add("" + input.charAt(i));
            String sub = "" + input.charAt(i);
            for (int j = i + 1; j < input.length(); j++) {
                sub = sub + input.charAt(j);
                subStrings.add(sub);
            }
        }
        for (String subString : subStrings) {
            int diff = calculateFrequency(subString);
            sum = sum + diff;
        }
        System.out.println(subStrings);
        return sum;
    }

    private static int calculateFrequency(String subString) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < subString.length(); i++) {
            if (charCount.containsKey(subString.charAt(i))) {
                charCount.put(subString.charAt(i), charCount.get(subString.charAt(i)) + 1);
            } else {
                charCount.put(subString.charAt(i), 1);
            }
        }
        int min = 1;
        int max = 1;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (charCount.size() == 1) {
                break;
            } else if (entry.getValue() > max) {
                max = entry.getValue();
            } else if (entry.getValue() == min) {
                min = entry.getValue();
            } else if (entry.getValue() < 2) {
                min = 1;
                max = 1;
            }
        }

        return max - min;
    }
}
