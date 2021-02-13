package hacker_earth_problems;

import java.util.Scanner;

public class MinimumPriceOfBaloon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] minPrice = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            int costOfGreenBalloon = scanner.nextInt();
            int costOfPurpleBalloon = scanner.nextInt();
            int noOfParticipants = scanner.nextInt();
            int minimumPrice = 0;
            if (i % 2 == 0) {
                minimumPrice = getMinimumPrice(scanner, costOfPurpleBalloon, costOfGreenBalloon, noOfParticipants, minimumPrice);
            } else {
                minimumPrice = getMinimumPrice(scanner, costOfGreenBalloon, costOfPurpleBalloon, noOfParticipants, minimumPrice);
            }
            minPrice[i] = minimumPrice;
        }
        for (int miniPrice : minPrice) {
            System.out.println(miniPrice);
        }
    }

    private static int getMinimumPrice(Scanner scanner, int costOfGreenBalloon, int costOfPurpleBalloon, int noOfParticipants, int minimumPrice) {
        for (int j = 0; j < noOfParticipants; j++) {
            int firstPerformanceStatus = scanner.nextInt();
            int secondPerformanceStatus = scanner.nextInt();
            if (firstPerformanceStatus == 1) {
                minimumPrice += costOfPurpleBalloon;
            }
            if (secondPerformanceStatus == 1) {
                minimumPrice += costOfGreenBalloon;
            }
        }
        return minimumPrice;
    }

}
