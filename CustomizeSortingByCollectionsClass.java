import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CustomizeSortingByCollectionsClass {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add("K");
        l1.add("A");
        l1.add("N");
        l1.add("H");
        l1.add("A");
        l1.add("I");
        l1.add("Y");
        l1.add("A");
        l1.add("K");
        l1.add("U");
        l1.add("M");
        l1.add("A");
        l1.add("R");
        System.out.println("LinkedList Before Sorting");
        System.out.println(l1);
        Collections.sort(l1,new Comparator8());
        System.out.println("LinkedList After Customize Sorting");
        System.out.println(l1);

    }
}
class Comparator8 implements Comparator
{
    @Override
    public int compare(Object o, Object t1) {
        String s1=o.toString();
        String s2=t1.toString();
        return s2.compareTo(s1);
    }
}
