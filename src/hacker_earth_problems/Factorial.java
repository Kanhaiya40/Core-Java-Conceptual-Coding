package hacker_earth_problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int fact=calculateFactorial(num);
        System.out.println(fact);
    }

    private static int calculateFactorial(int num) {
        int fact=1;
        for (int i = num; i >0; i--) {
            fact=fact*i;
        }
        return fact;
    }
}
