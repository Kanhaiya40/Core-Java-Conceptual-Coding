package hacker_earth_problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int noOfStudents=scanner.nextInt();
        int noOfRows=scanner.nextInt();
        int maxCapacity=scanner.nextInt();
        int[] studentsRows=new int[noOfStudents];
        for(int i=0;i<noOfStudents;i++){
            studentsRows[i]=scanner.nextInt();
        }
        int count=0;
        int i=0;
        int rowNum=1;
        while(i<noOfStudents){
            if(rowNum<noOfRows){
                int k=0;
                while(k<maxCapacity){
                    if(studentsRows[i]!=rowNum){
                        count++;
                    }
                    i++;
                    k++;
                }
                rowNum++;
                ArrayList<Integer> newArray=new ArrayList<>();

            }
            else {
                i++;
                count++;
            }
        }
        System.out.println(count);
    }
}
