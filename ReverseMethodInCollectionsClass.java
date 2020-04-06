import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseMethodInCollectionsClass {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
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
        int count=0;
        Collections.reverse(l1);
        Iterator i1=l1.iterator();
        while (i1.hasNext())
        {
            String s1=i1.next().toString();
            if ((s1.equals("A")))
            {
                count++;
            }

        }
        System.out.println(count);
        System.out.println(l1);
    }
}
