package hacker_earth_problems;

import java.util.Scanner;

public class Zoos {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int zCount=0;
        int oCount=0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='z'){
                zCount++;
            }
            else if (input.charAt(i)=='o'){
                oCount++;
            }
        }
        if (oCount==2*zCount){
            System.out.println("YES");
        }
        else {
            System.out.println("No");
        }
    }
}
