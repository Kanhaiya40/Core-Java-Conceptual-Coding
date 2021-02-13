package hacker_earth_problems;

import java.util.Scanner;

public class RunOnHorlicks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < testCase; i++) {
            int radius = scanner.nextInt();
            int horlicks = scanner.nextInt();
            int circle = 2 * (22 / 7) * radius * 10;
            if (100 * horlicks >= circle) {
                count++;
            }
        }
        System.out.println(count);
    }
}
