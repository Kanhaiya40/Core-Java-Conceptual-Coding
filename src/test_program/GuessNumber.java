package test_program;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            int count = 0;
            int noOfHints = scanner.nextInt();
            String l = scanner.next();
            int number = scanner.nextInt();
            String r = scanner.next();
            int secondGuess = scanner.nextInt();
            if (number < secondGuess) {
                for (int j = number + 1; j < secondGuess; j++) {
                    count++;
                }
            } else {
                for (int j = secondGuess + 1; j < number; j++) {
                    count++;
                }
            }
            result[i] = count;
            if (count == 0) {
                result[i] = -1;
            }
        }
        for (int res : result) {
            System.out.println(res);
        }

    }
}
