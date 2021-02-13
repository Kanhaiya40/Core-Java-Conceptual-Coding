package hacker_earth_problems;

import java.util.Scanner;

public class ISBNCode {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String IsbncCode=scanner.nextLine();
        int sum=0;
        if (IsbncCode.length()==10){
            for (int i = 1; i <= IsbncCode.length(); i++) {
                sum=sum+i*Integer.parseInt(String.valueOf(IsbncCode.charAt(i-1)));
            }
            if (sum%11==0){
                System.out.println("Legal ISBN");
            }
            else {
                System.out.println("Illegal ISBN");
            }
        }
        else {
            System.out.println("Illegal ISBN");
        }
    }
}
