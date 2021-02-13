package hacker_earth_problems;

import java.util.Scanner;

public class MagicProblem {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int noOfElements=scanner.nextInt();

        int min=0;
        int firstIndex=0;
        for (int i = 0; i < noOfElements; i++) {
            int input=scanner.nextInt();
            if (input%7==0 && input<min){
                firstIndex=i;
                min=input;
            }
            else if (input%7==0 && min==0){
                min=input;
            }
            if(i==55){
                System.out.println(input);
            }
        }
        System.out.println(firstIndex+" "+min);
    }
}
