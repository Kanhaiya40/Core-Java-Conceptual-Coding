package test_program;

import java.util.Scanner;

public class QuantumIssue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int count = 0;
        if (X==1){
            System.out.println(X);
        }
        else {
            while (X != 1) {
                if (X % 3 == 0) {
                    X = X / 3;
                    count++;
                } else if (X % 3 > 1) {
                    X = X + 1;
                    count++;
                } else {
                    X = X - 1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
