package hacker_earth_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LiftQueries {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int noOfTestCases=scanner.nextInt();
        Map<String,Integer> lift=new HashMap<>();
        String liftA="Lt A";
        String liftB="Lt B";
        lift.put(liftA,0);
        lift.put(liftB,6);
        char[] result=new char[noOfTestCases];
        for (int i = 0; i < noOfTestCases; i++) {
            int liftADistance;
            int liftBDistance;
            int calledFloor=scanner.nextInt();
            if (lift.get(liftA)>calledFloor){
                liftADistance=lift.get(liftA)-calledFloor;
            }
            else {
                liftADistance=calledFloor-lift.get(liftA);
            }
            if (lift.get(liftB)>calledFloor){
                liftBDistance=lift.get(liftB)-calledFloor;
            }
            else {
                liftBDistance=calledFloor-lift.get(liftB);
            }
            if (liftADistance<=liftBDistance){
                result[i]='A';
                lift.put(liftA,calledFloor);
            }
            else {
                result[i]='B';
                lift.put(liftB,calledFloor);
            }
        }
        for (char res:result) {
            System.out.println(res);
        }
    }
}
