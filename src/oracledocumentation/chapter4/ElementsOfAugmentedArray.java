package oracledocumentation.chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem--Write a program that prints its arguments in random order.
 * Do not make a copy of the argument array.
 * Demonstrate how to print out the elements using both
 * streams and the traditional enhanced for statement.
 * output:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 7 2 4 3 0 5 8 9 6 1
 * 7 2 4 3 0 5 8 9 6 1
 */
public class ElementsOfAugmentedArray {
    public static void main(String[] args) {
        Integer[] array=new Integer[10];
        for (int i = 0; i < 10; i++) {
            array[i]=i;
        }
        List<Integer> elements= Arrays.asList(array);
        System.out.println(elements);
        Collections.shuffle(elements);
        elements.forEach(e->System.out.format("%s ",e));
        System.out.println();
        for (Integer element:elements) {
            System.out.format("%s ",element);
        }
        System.out.println();
    }
}
