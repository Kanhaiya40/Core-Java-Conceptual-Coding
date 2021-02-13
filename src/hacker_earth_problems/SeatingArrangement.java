package hacker_earth_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SeatingArrangement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> seatNumberWithType = new HashMap<>();
        String[] seatType = new String[]{"WS", "MS", "AS"};
        Map<Integer, String> seatNumberType = new HashMap<>();
        int i = 1;
        int k = 0;
        int flag = 0;
        int j = 11;
        while (i != 109) {
            seatNumberWithType.put(i, i + j);
            seatNumberType.put(i, seatType[k]);
            if (flag == 0) {
                k++;
            } else {
                k--;
            }
            if (i % 3 == 0 && flag == 0) {
                k = seatType.length - 1;
                flag = 1;
            } else if (i % 3 == 0 && flag == 1) {
                k = 0;
                flag = 0;
            }
            j -= 2;
            if (i % 12 == 0) {
                j = 11;
            }
            i++;
        }
        int testCase = scanner.nextInt();
        int[] seatNum = new int[testCase];
        for (int q = 0; q < testCase; q++) {
            seatNum[q] = scanner.nextInt();
        }
        for (int value : seatNum) {
            System.out.print(seatNumberWithType.get(value) + " ");
            System.out.println(seatNumberType.get(value));
        }
    }
}
