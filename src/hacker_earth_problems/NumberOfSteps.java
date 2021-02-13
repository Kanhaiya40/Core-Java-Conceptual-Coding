package hacker_earth_problems;

import java.util.Scanner;

public class NumberOfSteps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > b[i] && a[i] > min) {
                while (a[i] != min) {
                    if (a[i] > 1) {
                        if (a[i] < min) {
                            min = a[i];
                            break;
                        }
                        a[i] = a[i] - b[i];
                        count++;
                    } else {
                        System.out.println(-1);
                        System.exit(0);
                    }
                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[1] != a[i]) {
                System.out.println(-1);
                System.exit(0);
            }
            if (i == a.length - 1 && a[1] == a[a.length - 1]) {
                System.out.println(count);
            }
        }
    }
}
