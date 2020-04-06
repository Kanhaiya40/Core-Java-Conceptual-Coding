import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet t1=new TreeSet();
        t1.add(54);
        t1.add(42);
        t1.add(67);
        t1.add(87);
        t1.add(32);
        t1.add(58);
        System.out.println(t1);
        System.out.println(t1.headSet(67));
        System.out.println(t1.tailSet(67));
        System.out.println(t1.subSet(54,87));
        System.out.println(t1.first());
        System.out.println(t1.last());
        System.out.println(t1.comparator());


    }
}
