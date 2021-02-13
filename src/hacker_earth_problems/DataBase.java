package hacker_earth_problems;

import java.util.Scanner;

public class DataBase {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int noOfTables=scanner.nextInt();
        for (int i = 0; i < noOfTables; i++) {
            int noOfAttributes=scanner.nextInt();
            int noOfTuples=scanner.nextInt();
            for (int j = 0; j < noOfAttributes; j++) {
                System.out.print(""+scanner.next()+" ");
            }
            for (int j = 0; j < noOfTuples; j++) {
                
            }
        }
    }
}
