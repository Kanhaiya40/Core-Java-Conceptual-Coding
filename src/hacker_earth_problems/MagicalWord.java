package hacker_earth_problems;

import java.util.Scanner;

public class MagicalWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCase = scanner.nextInt();
        for (int i = 0; i < noOfTestCase; i++) {
            int lengthOfString = scanner.nextInt();
            String input = scanner.nextLine();
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                int alpha=input.charAt(i)-1;
                int k=0;
                while (checkPrimeOrNot(alpha)){

                }
            }
        }
    }

    private static boolean checkPrimeOrNot(int alpha) {
        boolean flag = true;
        for (int i = 2; i < alpha; i++) {
            flag = alpha % i != 0;
        }
        return flag;
    }
}
