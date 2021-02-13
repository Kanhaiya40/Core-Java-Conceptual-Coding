package hacker_earth_problems;

import java.util.Scanner;

public class BricksGame {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int totalNumberOfBricks=scanner.nextInt();
        int i=1;
        int countBricks=0;
        while (countBricks<=totalNumberOfBricks){
            countBricks=countBricks+i;
            if (countBricks>=totalNumberOfBricks){
                System.out.println("Patlu");
                break;
            }
            countBricks=countBricks+2*i;
            if (countBricks>=totalNumberOfBricks){
                System.out.println("Motu");
                break;
            }
            i++;
        }
    }
}
