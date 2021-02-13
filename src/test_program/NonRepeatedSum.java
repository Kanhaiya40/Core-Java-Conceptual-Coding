package test_program;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatedSum {
    public static void main(String[] args) {
        int[] input = new int[]{10, 5, 3, 4, 3, 5, 6};
        NonRepeatedSum random = new NonRepeatedSum();
        int sum = random.getSum(input);
        System.out.println("Non Repeated Sum is :" + sum);
    }

    private int getSum(int[] input) {
        int total = 0;
        Set<Integer> items = new HashSet<>();
        for (int value : input) {
            if (!items.contains(value)) {
                items.add(value);
            } else {
                items.remove(value);
            }
        }
        for (int item : items) {
            total += item;
        }
        return total;
    }
}
