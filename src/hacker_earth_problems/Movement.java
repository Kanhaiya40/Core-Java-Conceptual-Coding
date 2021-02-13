package hacker_earth_problems;

import java.util.Scanner;

public class Movement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int noOfSteps=0;
        if (input / 5 > 1) {
            if (input%5==0)
            noOfSteps = input / 5;
            else {
                noOfSteps = noOfSteps + 1;
            }
        } else {
            noOfSteps = 1;
        }
        System.out.println(noOfSteps);
    }
}
