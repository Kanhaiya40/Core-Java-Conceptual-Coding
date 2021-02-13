package hacker_earth_problems;

import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] result = new int[testCase];
        String input_1;
        String input_2;
        for (int i = 0; i < testCase; i++) {
            input_1 = scanner.next();
            input_2 = scanner.next();
            StringBuilder inp_1=new StringBuilder(input_1);
            StringBuilder inp_2=new StringBuilder(input_2);
            result[i] = calculateDeletion(inp_1,inp_2);
        }
        for (int res : result) {
            System.out.println(res);
        }
    }

    public static int calculateDeletion(StringBuilder input_1, StringBuilder input_2) {
        for (int i = 0; i < input_1.length(); i++) {
            for (int j = 0; j < input_2.length(); j++) {
                if (input_1.charAt(i)==input_2.charAt(j)){
                    input_1.deleteCharAt(i);
                    input_2.deleteCharAt(j);
                    i=0;
                    break;
                }
            }
        }
        for (int i = 0; i < input_2.length(); i++) {
            for (int j = 0; j < input_1.length(); j++) {
                if (input_2.charAt(i)==input_1.charAt(j)){
                    input_2.deleteCharAt(i);
                    input_1.deleteCharAt(j);
                    break;
                }
            }

        }
        return (input_1.length())+(input_2.length());
    }
}
