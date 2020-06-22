package oracledocumentation.chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfShuffledElements {
    public static void main(String[] args) {
        String[] country = {"India", "Australia", "Canada", "South Africa", "Ameriaca"};
        List<String> list = Arrays.asList(country);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
