package oracledocumentation.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem--Write a method that takes a List<String> and applies String.trim to each element.
 */
public class TrimElementsOfList {
    public static void main(String[] args) {
        List<String> trimElements;
        String[] withoutTrimedElements = {"  Kannada  ", "Bill ", "  HouseMonk "};
        trimElements = Arrays.stream(withoutTrimedElements).map(String::trim).collect(Collectors.toList());
        System.out.println("Trimed Elements of List are:"+trimElements);
    }
}
