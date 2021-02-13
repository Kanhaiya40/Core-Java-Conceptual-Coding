package hacker_earth_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumBoarder {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCase=scanner.nextInt();
        List<Character> cells=new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            int noOfRows=scanner.nextInt();
            int noOfColumns=scanner.nextInt();
            for (int j = 0; j < noOfRows; j++) {
                for (int k = 0; k < noOfColumns; k++) {
                    cells.add(scanner.next().charAt(j));
                }
            }
            System.out.println(cells);
        }
    }
}
