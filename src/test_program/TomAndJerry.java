package test_program;

import java.util.ArrayList;
import java.util.Scanner;

public class TomAndJerry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        String[] result = new String[testCase];
        for (int i = 0; i < testCase; i++) {
            StringBuilder output = new StringBuilder();
            String tom = scanner.next();
            String jerry = scanner.next();
            ArrayList<Character> jerryCharacter = new ArrayList<>();
            for (int j = 0; j < jerry.length(); j++) {
                jerryCharacter.add(jerry.charAt(j));
            }
            for (int j = 0; j < tom.length(); j++) {
                for (int k = 0; k < jerryCharacter.size(); k++) {
                    if (!jerryCharacter.contains(tom.charAt(j))) {
                        break;
                    } else if (jerryCharacter.contains(tom.charAt(j)) && tom.charAt(j) == jerryCharacter.get(k)) {
                        output.append(tom.charAt(j));
                        jerryCharacter.remove(jerryCharacter.get(k));
                        break;
                    }
                }
            }
            if (jerry.equals(output.toString())) {
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
