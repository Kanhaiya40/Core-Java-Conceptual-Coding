package hacker_earth_problems;

import java.util.Scanner;

public class MinimumSteps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        int count = 0;
        int[] result = new int[noOfTestCases];
        for (int i = 0; i < noOfTestCases; i++) {
            int k = scanner.nextInt();
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            while (k != m) {
                k = k * n;
                count++;
                if (k != m) {
                    k = k - 1;
                    count++;
                    if (k % m == 0) {
                        k = k * n;
                        count++;
                    } else {
                        k = k - 2;
                        count++;
                    }
                }
            }
            result[i] = count;
        }
        for (int res : result) {
            System.out.println(res);
        }
    }
}
