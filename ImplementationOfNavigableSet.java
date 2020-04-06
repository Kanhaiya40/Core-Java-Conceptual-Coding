import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ImplementationOfNavigableSet {
    public static void main(String[] args) {
        TreeSet t1=new TreeSet();
        for (int i = 0; i <10 ; i++) {
            t1.add(i);
        }
        System.out.println(t1.floor(5));
        System.out.println(t1.lower(5));
        System.out.println(t1.ceiling(5));
        System.out.println(t1.higher(5));
        System.out.println(t1);
        System.out.println(t1.pollFirst());
        System.out.println(t1.pollLast());
        System.out.println(t1);
        NavigableSet n1=t1.descendingSet();
        Iterator i1=n1.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }

    }
}
