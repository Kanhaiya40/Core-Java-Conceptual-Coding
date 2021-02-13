package test_program;

import java.util.Scanner;

public class DistanceWithHour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int output = calculateMinimumHour(n);
        System.out.println(output);
    }

    private static int calculateMinimumHour(int n) {
        int minHour;
        if (n <= 5) {
            minHour = 1;
        } else if (n % 5 == 0) {
            minHour = n / 5;
        } else {
            minHour = n / 5 + 1;
        }
        return minHour;
    }
}
