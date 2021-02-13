package hacker_earth_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SevenSegmentDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        Map<Integer, Integer> noWithMatchStick = new HashMap<>();
        noWithMatchStick.put(0, 6);
        noWithMatchStick.put(1, 2);
        noWithMatchStick.put(2, 5);
        noWithMatchStick.put(3, 5);
        noWithMatchStick.put(4, 4);
        noWithMatchStick.put(5, 5);
        noWithMatchStick.put(6, 6);
        noWithMatchStick.put(7, 3);
        noWithMatchStick.put(8, 7);
        noWithMatchStick.put(9, 6);
        String[] result = new String[testCase];
        for (int i = 0; i < testCase; i++) {
            int totalStick = 0;
            StringBuilder tem = new StringBuilder();
            String input=scanner.next();
            for (int j = 0; j < input.length(); j++) {
                totalStick=totalStick+noWithMatchStick.get(Integer.parseInt(String.valueOf(input.charAt(j))));
            }
            if (totalStick % 2 == 0) {
                for (int j = 0; j < totalStick / 2; j++) {
                    tem.append("1");
                }
            } else {
                totalStick = totalStick - 3;
                tem.append("7");
                for (int j = 0; j < totalStick / 2; j++) {
                    tem.append("1");
                }
            }
            result[i] = tem.toString();
        }
        for (String res : result) {
            System.out.println(res);
        }
    }
}
