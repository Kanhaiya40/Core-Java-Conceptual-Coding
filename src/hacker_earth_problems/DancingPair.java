package hacker_earth_problems;

import java.util.Scanner;

public class DancingPair {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            int countPair = 0;
            int noOfBoys = scanner.nextInt();
            int[] boysSkills = new int[noOfBoys];
            for (int j = 0; j < noOfBoys; j++) {
                boysSkills[j] = scanner.nextInt();
            }
            int noOfGirls = scanner.nextInt();
            int[] girlsSkills = new int[noOfGirls];
            for (int j = 0; j < noOfGirls; j++) {
                girlsSkills[j] = scanner.nextInt();
            }
            if (noOfBoys <= noOfGirls) {
                for (int j = 0; j < noOfBoys; j++) {
                    for (int k = 0; k < noOfGirls; k++) {
                        if (boysSkills[j] - girlsSkills[k] == 1 || boysSkills[j] - girlsSkills[k] == -1 || boysSkills[j] - girlsSkills[k] == 0) {
                            countPair++;
                            girlsSkills[k] = -girlsSkills[k];
                            break;
                        }
                    }
                }
            } else {
                for (int j = 0; j < noOfGirls; j++) {
                    for (int k = 0; k < noOfBoys; k++) {
                        if (boysSkills[k] - girlsSkills[j] == 1 || boysSkills[k] - girlsSkills[j] == -1 || boysSkills[k] - girlsSkills[j] == 0) {
                            countPair++;
                            boysSkills[k] = -boysSkills[k];
                            break;
                        }
                    }
                    }
            }
            result[i] = countPair;
        }
        for(int res:result){
            System.out.println(res);
        }
    }
}
