package hacker_earth_problems;

import java.util.Scanner;

public class FriendsRelationships {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] input = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            input[i] = scanner.nextInt();
        }
        for (int value : input) {
            for (int i = 0; i < value; i++) {
                for (int k = 0; k < 2 * value; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
