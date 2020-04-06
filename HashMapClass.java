import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap h1=new HashMap();
        h1.put(1,"Kanhaiya");
        h1.put(2,"Vishal");
        h1.put(3,"Adarsh");
        h1.put(4,"Lokesh");
        h1.put(5,"Jaha");
        System.out.println(h1);
        Set s1=h1.keySet();
        System.out.println(s1);
        Set s2=h1.entrySet();
        System.out.println(s2);
        Collection c=h1.values();
        System.out.println(c);
        Iterator i1=s2.iterator();
        while (i1.hasNext())
        {

            Map.Entry m1=(Map.Entry)i1.next();
            if(m1.getValue()=="Lokesh")
            {
                m1.setValue("Darling");
            }



        }
        System.out.println(h1);
    }
}
