package hacker_earth_problems;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArr = scanner.nextInt();
        int sum = 0;
        String[] numbers = new String[sizeOfArr];
        for (int i = 0; i < sizeOfArr; i++) {
            numbers[i] = scanner.next();
        }
        for (int i = 0; i < sizeOfArr / 2; i++) {
            final int sum1 = Integer.parseInt(String.valueOf(numbers[i].charAt(0)));
            if (i%2==0) {
                sum += sum1;
            }
            else {
                sum -= sum1;
            }
        }
        for (int i = sizeOfArr / 2; i < sizeOfArr; i++) {
            final int sum1 = Integer.parseInt(String.valueOf(numbers[i].charAt(numbers[i].length() - 1)));
            if (i%2!=0) {
                sum -= sum1;
            }
            else {
                sum+= sum1;
            }
        }
        if (sum % 11 == 0) {
            System.out.println("OUI");
        } else {
            System.out.println("NON");
        }
        // Write your code here

    }
}
