package oracledocumentation.chapter5;

import java.time.Year;
import java.util.Scanner;

public class YearIsLeapOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Hypothetical Year:");
        int year = scanner.nextInt();
        Year yearClass = Year.of(year);
        if (yearClass.isLeap()) {
            System.out.println("The Given is a Leap Year");
        } else {
            System.out.println("The Given is Not a Leap Year");
        }
    }
}
