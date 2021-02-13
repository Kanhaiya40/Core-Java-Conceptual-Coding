package hacker_earth_problems;

import java.util.Scanner;

public class GokisFriends {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfPeople = scanner.nextInt();
        String[] result = new String[noOfPeople];
        int minSkill = scanner.nextInt();
        for (int i = 0; i < noOfPeople; i++) {
            int skill = scanner.nextInt();
            if (skill >= minSkill) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        for (String res : result) {
            System.out.println(res);
        }
    }
}
