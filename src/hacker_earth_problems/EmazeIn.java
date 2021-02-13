package hacker_earth_problems;

import java.util.Scanner;

public class EmazeIn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int leftRight = 0;
        int upDown = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'L') {
                leftRight = leftRight - 1;
            } else if (input.charAt(i) == 'R') {
                leftRight = leftRight + 1;
            } else if (input.charAt(i) == 'D') {
                upDown = upDown - 1;
            } else {
                upDown = upDown + 1;
            }
        }
        System.out.println(leftRight + " " + upDown);
    }
}
