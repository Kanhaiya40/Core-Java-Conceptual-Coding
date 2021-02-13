package test_program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumSubjects {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCase=scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            Map<Integer,Integer> time=new HashMap<>();
            int noOfSubjects=scanner.nextInt();
            for (int j = 0; j < noOfSubjects; j++) {
                String subject=scanner.nextLine();
                String marksWithSubject[]=subject.split(" ");

            }
        }
    }
}
