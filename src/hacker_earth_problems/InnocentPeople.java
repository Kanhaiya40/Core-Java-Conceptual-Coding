package hacker_earth_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InnocentPeople {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Character> vowels=new ArrayList<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('Y');
        String input=scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            int sum=0;
            int t=i;
            if (i!=input.length()-1) {
                if (Character.isDigit(input.charAt(t))) {
                    if (Character.isDigit(input.charAt(t + 1))) {
                        sum = Integer.parseInt(String.valueOf(input.charAt(t))) + Integer.parseInt(String.valueOf(input.charAt(t + 1)));
                    }
                }
            }
            if (Character.isLetter(input.charAt(i))){
                if (!vowels.contains(input.charAt(i))){
                    if (i==8){
                        System.out.println("valid");
                    }
                    continue;
                }
                else {
                    System.out.println("invalid");
                    break;
                }
            }
            if (sum%2!=0){
                System.out.println("Invalid");
                break;
            }
            else if (i==input.length()-1){
                System.out.println("Valid");
            }
        }
    }
}
