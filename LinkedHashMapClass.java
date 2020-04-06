import java.util.*;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap lh1=new LinkedHashMap();
        for (int i = 0; i <10; i++) {
            for (int j = 'a'; j < 'l'; j++) {
                lh1.put(i, j);
            }
        }
        Set s1=lh1.entrySet();

        Set s2=lh1.keySet();

        Collection c=lh1.values();

        Iterator it1=s1.iterator();
        while(it1.hasNext())
        {
            Map.Entry m1=(Map.Entry)it1.next();
            m1.toString();
            if (m1.getValue()=="107")
            {
                m1.setValue(109);
            }
            else
                System.out.println("Not Matched");
        }
        System.out.println(lh1);
    }
}
