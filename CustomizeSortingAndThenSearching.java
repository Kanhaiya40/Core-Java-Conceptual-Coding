import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomizeSortingAndThenSearching {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("Vivek");
        a1.add("Abhishek");
        a1.add("Gopi");
        a1.add("Vishal");
        a1.add("Prince");
        a1.add("Ashutosh");
        a1.add("Lokesh");
        a1.add("Gulam");
        a1.add("Vinay");
        System.out.println(a1);
        Collections.sort(a1,new Comparator9());
        Comparator c=Collections.reverseOrder(new Comparator9());
         Collections.sort(a1,c);
        System.out.println(a1);
        System.out.println(Collections.binarySearch(a1,"Vinay"));

    }
}
class Comparator9 implements Comparator
{
    @Override
    public int compare(Object o, Object t1) {
        String s1=o.toString();
        String s2=t1.toString();
        int i1=s1.length();
        int i2=s2.length();
        if (i1<i2)
        {
            return +1;
        }
        if (i1>i2)
        {
            return -1;
        }
        else
            return s2.compareTo(s1);
    }
}
