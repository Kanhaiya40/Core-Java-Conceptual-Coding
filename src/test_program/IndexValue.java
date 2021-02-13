package test_program;

import java.util.Scanner;

public class IndexValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] elements = new int[size];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }
        int searchingElement = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == searchingElement) {
                System.out.println(i + 1);
                break;
            }
            else if(i==elements.length-1){
                if (elements[i]!=searchingElement){
                    System.out.println(-1);
                    char num=(char)67;
                    System.out.println(num);
                }
            }
        }

    }
}
