package test_program;

import java.util.Arrays;
import java.util.TreeSet;

public class PropeticSorting {

    public static void main(String[] args) {
        int[] input = new int[]{-1, 9, 2, -4, 7};
        PropeticSorting propeticSorting = new PropeticSorting();
        int[] resultArr = propeticSorting.getSorted(input);
        System.out.println(Arrays.toString(resultArr));
    }

    private int[] getSorted(int[] input) {
        TreeSet<Integer> posNumber = new TreeSet<>();
        TreeSet<Integer> negNumber = new TreeSet<>();
        int[] resultantArr = new int[input.length];
        for (int value : input) {
            if (value < 0.0) {
                negNumber.add(value);
            } else {
                posNumber.add(value);
            }
        }
        for (int i = 0; i < resultantArr.length; i++) {
            if (i % 2 != 0 && !negNumber.isEmpty()) {
                resultantArr[i] = negNumber.pollFirst();
            } else {
                resultantArr[i] = posNumber.pollFirst();
            }
        }
        return resultantArr;
    }
}
