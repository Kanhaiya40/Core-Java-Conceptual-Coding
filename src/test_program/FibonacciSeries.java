package test_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number Of Elemnets:");
        int number = scanner.nextInt();
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        List<Integer> fibonacci;
        fibonacci = fibonacciSeries.getFibonacciSeries(number);
        System.out.println("Fibonacci Series:" + fibonacci);
    }

    private List<Integer> getFibonacciSeries(int number) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        int prev = 0;
        int after = 1;
        int fibNum;
        fibonacciSeries.add(prev);
        fibonacciSeries.add(after);
        for (int i = 2; i < number; i++) {
            fibNum = prev + after;
            fibonacciSeries.add(fibNum);
            prev = after;
            after = fibNum;
        }
        return fibonacciSeries;
    }
}
