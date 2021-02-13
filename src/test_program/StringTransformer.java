package test_program;

import java.util.HashMap;
import java.util.Map;

public class StringTransformer {

    public static void main(String[] args) {
        String input = "aaabbdcccccf";
        StringTransformer stringTransformer = new StringTransformer();
        String transformedString = stringTransformer.transformString(input);
        System.out.println(transformedString);
    }

    private String transformString(String input) {
        String resultantString = "";
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (charFrequency.containsKey(input.charAt(i))) {
                charFrequency.put(input.charAt(i), charFrequency.get(input.charAt(i)) + 1);
            } else {
                charFrequency.put(input.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            resultantString += "" + entry.getKey() + "" + entry.getValue();
        }
        return resultantString;
    }
}
