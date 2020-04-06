import java.util.Comparator;
import java.util.TreeSet;

public class InsertingStringBufferObjectInTreeSet {
    public static void main(String[] args) {
        TreeSet t1=new TreeSet(new Comprator3());
        t1.add(new StringBuffer("Rahi"));
        t1.add(new StringBuffer("Kamayani"));
        t1.add(new StringBuffer("Babu"));
        t1.add(new StringBuffer("Raja"));
        t1.add(new StringBuffer("Shah"));
        t1.add("Amrita");
        System.out.println(t1);
    }
}
class Comprator3 implements Comparator
{
    @Override
    public int compare(Object o, Object t1) {
        String s1=o.toString();
        String s2=t1.toString();
        return s2.compareTo(s1);
    }
}