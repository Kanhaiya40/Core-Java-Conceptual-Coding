package test_program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubjectReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfDays = scanner.nextInt();
        Map<String, Double> startingTime = new HashMap<>();
        for (int i = 0; i < noOfDays; i++) {
            int noOfSubjects = scanner.nextInt();
            for (int j = 0; j < noOfSubjects; j++) {
                String sub = scanner.next();
                String timing = scanner.nextLine();
                String[] schedule = timing.split(" ");
                timing = schedule[1].replace(':', '.');
                startingTime.put(sub, Double.parseDouble(timing));
            }
        }
        System.out.println(startingTime);
    }
}
