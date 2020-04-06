import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
public class SortingOfArrayPrimitivesByArraysClass {
    public static void main(String[] args) {
        int[] i={51,54,69,916,31,23,12,79,86,19,82,53};
        Arrays.sort(i);
        System.out.println("Primitive Array traversing:");
        for (int i2:i
             ) {
            System.out.println(i2);
        }
        Arrays.fill(i,1);
        System.out.println("List Representation Of Array:");
        List l=Arrays.asList(i);
        ListIterator l1=l.listIterator();
        while (l1.hasNext())
        {
            System.out.println(l1.next());
        }
        Integer[] i1={115,45,23,646,25,65,38,19,36,725};
        String[] s1={"Kanhaiya","Singh","Kamlesh","jayesh","Hamid","Guitar"};
        System.out.println("Integer Object traversing:");
        //Arrays.sort(i1);
        Arrays.sort(i1,new Comparator7());
        //Arrays.sort(s1);
        //Arrays.sort(s1,new Comparator7());
        for (Integer i2:i1
             ) {
            System.out.println(i2);
        }
        System.out.println("Inter Object traversing by natural default sorting:");
        for (String s6:s1
             ) {
            System.out.println(s6);
        }
    }
}
class Comparator7 implements Comparator
{
    @Override
    public int compare(Object o, Object t1) {
        Integer i1=(Integer)o;
        Integer i2=(Integer)t1;
        String s1=o.toString();
        String s2=t1.toString();
        return i2.compareTo(i1);
        //return s2.compareTo(s1);
    }
}
