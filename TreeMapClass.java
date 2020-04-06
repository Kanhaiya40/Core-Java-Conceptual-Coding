import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap t1=new TreeMap();
        for (int i = 0; i <10 ; i++) {
            t1.put(i,i);
        }
        System.out.println(t1);
        System.out.println(t1.firstEntry());
        System.out.println(t1.lastEntry());
        System.out.println(t1.headMap(7));
        System.out.println(t1.tailMap(7));
        System.out.println(t1.subMap(3,7));

    }
}
//It is ByDefault Natural Sorting based on Key
