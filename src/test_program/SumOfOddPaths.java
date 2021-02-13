package test_program;


import java.util.Scanner;

public class SumOfOddPaths {

    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n-1; i++) {
            int node_1=scanner.nextInt();
            int node_2=scanner.nextInt();
            int weight=scanner.nextInt();
            int count= calculateMaximumUnorderedPair(n);
        }

    }

    private static int calculateMaximumUnorderedPair(int n) {
        return 0;
    }
}
