package hacker_earth_problems;

import java.util.Scanner;

public class ChikuMedicine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfNameOfBook = scanner.nextInt();
        int noOfPages = scanner.nextInt();
        if (lengthOfNameOfBook <= 23 && noOfPages >= 500 && noOfPages <= 1000) {
            System.out.println("Take Medicine");
        } else {
            System.out.println("Don't take Medicine");
        }
    }
}
