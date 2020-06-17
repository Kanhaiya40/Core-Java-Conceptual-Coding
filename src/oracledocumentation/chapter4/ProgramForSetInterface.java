package oracledocumentation.chapter4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ProgramForSetInterface {
    public static void main(String[] args) {
        String[] array = {"store", "mall", "shop", "ksjhk"};
        Set<String> strings = new HashSet<>();
        Set<String> strings1 = Arrays.stream(array).collect(Collectors.toSet());
        strings.add("cognitree");
        strings.add("member");
        strings.add("weekDays");
        System.out.println(strings);
        System.out.println(strings1);
    }
}
