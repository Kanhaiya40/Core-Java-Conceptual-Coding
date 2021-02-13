package hacker_earth_problems;

import java.util.Scanner;

public class TeddyAndTweedy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float N = scanner.nextInt();
        float side = N / 3;
        if (side == (int) side) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
