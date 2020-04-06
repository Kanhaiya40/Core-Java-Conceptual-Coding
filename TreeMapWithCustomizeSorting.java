import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapWithCustomizeSorting {
    public static void main(String[] args) {
        TreeMap t1=new TreeMap(new Comparator5());
        t1.put("Ravindra",56);
        t1.put("Ashwin",87);
        t1.put("Stokes",32);
        t1.put("Mathews",16);
        t1.put("Russel",58);
        t1.put("Polard",73);
        t1.put("Hardik",45);
        t1.put("Jayant",108);
        t1.put("Yuvraj",205);
        System.out.println(t1);

    }
}
class Comparator5 implements Comparator
{
    @Override
    public int compare(Object o, Object t1) {
        String s1=o.toString();
        String s2=t1.toString();
        return s2.compareTo(s1);
    }
}
