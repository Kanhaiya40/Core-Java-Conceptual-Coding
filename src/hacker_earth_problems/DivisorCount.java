package hacker_earth_problems;

import java.util.Scanner;

public class DivisorCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int r = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        for (int j = i; j <= r; j++) {
            if (j % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
