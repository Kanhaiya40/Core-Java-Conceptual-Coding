package test_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 7, 3, 9, 8, 10};
        int j=0;
        int[] reverseNumbers=new int[numbers.length];
        for (int i = numbers.length-1; i >= 0; i--) {
            reverseNumbers[j]=numbers[i];
            j++;
        }
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        System.out.println("Even Numbers:" + evenNumbers);
        System.out.println("Odd Numbers:" + oddNumbers);
        System.out.println("Reverse array Of numbers:"+ Arrays.toString(reverseNumbers));
    }
}
