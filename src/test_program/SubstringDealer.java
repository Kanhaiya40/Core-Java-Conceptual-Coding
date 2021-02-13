package test_program;

import java.util.Scanner;

public class SubstringDealer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        String input = scanner.next();
        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        int noOfQueries = scanner.nextInt();
        int[] result=new int[noOfQueries];
        for (int i = 0; i < noOfQueries; i++) {
            int count = 0;
            int startIndex = scanner.nextInt();
            int endIndex = scanner.nextInt();
            String updatedString = input.substring(startIndex, endIndex + 1);
            for (int j = 0; j < updatedString.length() - 1; j++) {
                String concat = "" + updatedString.charAt(j);
                for (int k = j + 1; k < updatedString.length(); k++) {
                    String sequence = "" + updatedString.charAt(j) + updatedString.charAt(k);
                    concat = concat + updatedString.charAt(k);
                    if (!concat.equals(sequence)) {
                        if (concat.startsWith("" + start) && concat.endsWith("" + end)) {
                            count++;
                            System.out.println(concat);
                        }
                    }
                    if (sequence.startsWith("" + start) && sequence.endsWith("" + end)) {
                        count++;
                    }
                    System.out.println(sequence);

                }
            }
            result[i]=count;
        }
        for (int res:result) {
            System.out.println(res);
        }
    }
}
