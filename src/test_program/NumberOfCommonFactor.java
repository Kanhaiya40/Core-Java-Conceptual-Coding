package test_program;

import java.util.Scanner;

public class NumberOfCommonFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int count = 1;
        for (int i = 2; i <=firstNum; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
