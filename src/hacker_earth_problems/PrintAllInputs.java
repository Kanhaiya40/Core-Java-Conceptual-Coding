package hacker_earth_problems;

import java.util.Scanner;

public class PrintAllInputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int[] result = new int[elements];
        for (int i = 0; i < elements; i++) {
            result[i] = scanner.nextInt();
        }
        for (int res : result) {
            System.out.println(res);
        }
    }
}
