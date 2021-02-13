package hacker_earth_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LifeUniverse {

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == 42) {
                break;
            }
            result.add(input);
        }
        for (int res : result) {
            System.out.println(res);
        }
    }
}
