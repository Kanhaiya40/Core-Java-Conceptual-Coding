package test_program;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] elements = new int[N];
        int sum = 0;
        int min = 0;
        for (int i = 0; i < N; i++) {
            elements[i] = scanner.nextInt();
            sum = sum + elements[i];
        }
        ArrayList<Integer> condition = new ArrayList<>();
        for (int element : elements) {
            if (N * element > sum) {
                condition.add(element);
            }
        }
        for (int i = 1; i < condition.size(); i++) {
            min = condition.get(0);
            if (condition.get(i) < min) {
                min = condition.get(i);
            }
        }
        System.out.println(min);
    }
}
