package oracledocumentation.chapter4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Take the FindDups example and modify it to use a SortedSet instead of a Set.
 * Specify a Comparator so that case is ignored when sorting and identifying set elements.
 */
public class FindDuplicates {
    public static void main(String[] args) {
        String[] strings = {"Kania", "Kania", "Galahad", "Vial","Vial"};
        SortedSet<String> box = new TreeSet<>(new TestClass());
        box.addAll(Arrays.asList(strings));
        System.out.println(box.size() + " distinct words: " + box);
    }
}

class TestClass implements Comparator<String> {

    @Override
    public int compare(String o, String t1) {
        int length1=o.length();
        int length2=t1.length();
        if (length1>length2)
            return 1;
        else if(length1<length2)
                return 1;
        else
            System.out.println("Duplicates="+o);
        return 0;

    }
}
