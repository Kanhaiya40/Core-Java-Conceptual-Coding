package oracledocumentation.chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionWithSortingAlogorithm {
    public static void main(String[] args) {
        String[] country={"India","Australia","Canada","South Africa","Ameriaca"};
        List<String> list = Arrays.asList(country);
        Collections.sort(list);
        System.out.println(list);
    }
}
