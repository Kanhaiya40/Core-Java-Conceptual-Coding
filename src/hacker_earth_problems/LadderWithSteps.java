package hacker_earth_problems;

import java.util.Scanner;

public class LadderWithSteps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < 2; i++) {
            System.out.println("*   *");
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    if ((j == 1 || j == 2) && (k == 1 || k == 2 || k == 3)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
