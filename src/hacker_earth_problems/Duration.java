package hacker_earth_problems;

import java.util.Scanner;

public class Duration {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int noOfWorks=scanner.nextInt();
        String[] result=new String[noOfWorks];
        for (int i = 0; i < noOfWorks; i++) {
            int sh=scanner.nextInt();
            int sm=scanner.nextInt();
            int eh=scanner.nextInt();
            int em=scanner.nextInt();
            int totalStartingMin=sh*60+sm;
            int totalEndingMin=eh*60+em;
            int totalDurationMin=totalEndingMin-totalStartingMin;
            int durationHour=totalDurationMin/60;
            int durationMin=totalDurationMin%60;
            result[i]=durationHour+" "+durationMin;
        }
        for (String res:result) {
            System.out.println(res);
        }
    }
}
