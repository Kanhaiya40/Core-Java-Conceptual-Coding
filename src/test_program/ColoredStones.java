package test_program;

import java.util.Scanner;

public class ColoredStones {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        String coloredStones=scanner.next();
        int count=0;
        for (int i = 0; i < num-1; i++) {
            for (int j = i+1; j < num; j++) {
                if (coloredStones.charAt(i)!=coloredStones.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
