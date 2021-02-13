package test_program;

import java.util.Scanner;

public class CountNoOfDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digits = calculateDigits(n);
        System.out.println(digits);
    }

    private static int calculateDigits(int n) {
        int noOfDigits = 0;
        for (int i = 1; i < n; i++) {
            while (i != 0) {
                i = i / 10;
                noOfDigits++;
            }
        }
        return noOfDigits;
    }
}
