import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class ImplementingNavigableMapInterface {
    public static void main(String[] args) {
        TreeMap t1=new TreeMap();
        t1.put(3,"Kanhaiya");
        t1.put(5,"Kranti");
        t1.put(7,"Sunil");
        t1.put(9,"Ahuti");
        t1.put(8,"Gulshan");
        t1.put(6,"Anmol");
        t1.put(4,"Bipul");
        t1.put(2,"Bhaiya");
        System.out.println(t1);
        System.out.println(t1.floorKey(9));
        System.out.println(t1.lowerKey(9));
        System.out.println(t1.ceilingKey(9));
        System.out.println(t1.higherKey(9));
        System.out.println(t1.pollFirstEntry());
        System.out.println(t1.pollLastEntry());
        NavigableMap n1=t1.descendingMap();
        Set s1=n1.entrySet();
        Iterator i1=s1.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }

    }
}
