package test_program;

import java.util.*;

public class OldKeyPads {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, List<Character>> keypad = new HashMap<>();
        for (int i = 0; i <= 1; i++) {
            List<Character> images = new ArrayList<>();
            char img = (char) (48 + i);
            images.add(img);
            keypad.put(i, images);
        }
        int k = 97;
        for (int i = 2; i <= 9; i++) {
            List<Character> images = new ArrayList<>();
            if (i == 7 || i == 9) {
                for (int j = 0; j < 4; j++) {
                    char img = (char) (k + j);
                    images.add(img);
                }
                keypad.put(i, images);
                k = k + 4;
            } else {
                for (int j = 0; j < 3; j++) {
                    char img = (char) (k + j);
                    images.add(img);
                }
                keypad.put(i, images);
                k = k + 3;
            }
        }
        System.out.println(keypad);
        for (int i = 0; i < keypad.get(2).size(); i++) {
            for (int j = 0; j < keypad.get(3).size(); j++) {
                System.out.print(keypad.get(2).get(i));
                System.out.print(keypad.get(3).get(j));
                System.out.print("\t");
            }
        }
    }
}
