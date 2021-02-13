package hacker_earth_problems;

import java.math.BigInteger;
import java.util.Scanner;

public class ConjectIt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        String[] result = new String[noOfTestCases];
        for (int i = 0; i < noOfTestCases; i++) {
            String N=scanner.nextLine();
            result[i]="YES";
        }
        for (String res : result) {
            System.out.println(res);
        }
    }
}
