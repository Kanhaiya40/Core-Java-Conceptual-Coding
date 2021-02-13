package hacker_earth_problems;

import java.util.Scanner;

public class ProductFinder {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sizeOfArr=scanner.nextInt();
        int[] elements=new int[sizeOfArr];
        for (int i = 0; i < sizeOfArr; i++) {
            elements[i]=scanner.nextInt();
        }
        long output=1;
        long modulo=1000000007;
        for (int i = 0; i < sizeOfArr; i++) {
            output=(output*elements[i])%modulo;
        }
        System.out.println(output);
    }
}
