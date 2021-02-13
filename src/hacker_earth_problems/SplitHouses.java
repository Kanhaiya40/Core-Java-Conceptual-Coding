package hacker_earth_problems;

import java.util.Scanner;
import java.util.Stack;

public class SplitHouses {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Character> organisation=new Stack<>();
        int noOfGrid=scanner.nextInt();
        String input="H...H";
        char[] grid=new char[noOfGrid];
        for (int i = 0; i < grid.length; i++) {
            grid[i]=input.charAt(i);
        }
        char move=49;
        System.out.println(grid);
        for (int i = 0; i < grid.length; i++) {
            if (grid[i]=='.'){
                move++;
            }
            if (grid[i]=='H'){
                organisation.push(grid[i]);
                organisation.push(move);

            }
            if (grid[i]=='B'){
            }
        }
        System.out.println(organisation);
    }
}
