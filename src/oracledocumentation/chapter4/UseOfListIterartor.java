package oracledocumentation.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UseOfListIterartor {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(23);
        list.add(16);
        list.add(32);
        list.add(98);
        list.add(31);
        list.add(28);
        ListIterator<Integer> listIterator = list.listIterator();
        if (listIterator.hasNext()) {
            do {
                Integer number = listIterator.next();
                if (number % 2 == 0) {
                    System.out.println("Even Integer of List=" + number);
                } else {
                    System.out.println("Odd Integer of List=" + number);
                }
            } while (listIterator.hasNext());
        }

    }
}
