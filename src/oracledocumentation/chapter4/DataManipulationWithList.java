package oracledocumentation.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataManipulationWithList {
    public static void main(String[] args) {
        String[] country = {"India", "Australia", "Canada", "South Africa", "Ameriaca"};
        String[] dish = {"Paneer", "Chicken Chilli", "Chicken Kadai", "Boneless Chicken Fry", "Lassi"};
        List<String> list = Arrays.asList(country);
        List<String> list1 = Arrays.asList(dish);
        List<String> list2 = new ArrayList<>(5);
        System.out.println("Original Order Of Elements:" + list);
        Collections.reverse(list);
        System.out.println("Reversed Order Of Elements:" + list);
        // Collections.fill(list,"India");
        System.out.println(list);
        Collections.copy(list1, list2);
        System.out.println(list2);
        Collections.swap(list, 0, 4);
        System.out.println(list);
    }
}