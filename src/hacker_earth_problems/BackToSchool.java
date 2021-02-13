package hacker_earth_problems;

import java.util.Scanner;

public class BackToSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 3; i++) {
            int point = scanner.nextInt();
            if (point > max) {
                max = point;
            }
        }
        System.out.println(max);
    }
}
