package hacker_earth_problems;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        StringBuilder output= new StringBuilder();
        for (int i = input.length()-1; i >=0; i--) {
            output.append(input.charAt(i));
        }
        if (input.contentEquals(output)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
