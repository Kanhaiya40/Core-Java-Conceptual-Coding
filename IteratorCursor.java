import java.util.*;

public class IteratorCursor {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        for (int i = 100; i <200; i++) {
            a1.add(i);
        }
        Iterator i1=a1.iterator();
        while (i1.hasNext())
        {
            Integer i2=(Integer)i1.next();
            if(i2%3==0)
            {
                System.out.println("Multiple of Three:"+i2);
            }
           else if (i2%2==0)
                {
                    System.out.println("Multiple of Two:"+i2);
                }
                else
            {
                i1.remove();
            }

        }
        System.out.println(a1);
        System.out.println("Iterating LinkedList Object According to Some Condition:");
        LinkedList l1=new LinkedList();
        l1.add("Liqayat");
        l1.add("Humayat");
        l1.add("Karan");
        l1.add("Karishma");
        l1.add("Kanika");
        Iterator i3=l1.iterator();
        while(i3.hasNext())
        {
            String s1=i3.next().toString();

            if(s1.length()%2==0)
            {
                System.out.println(s1);
            }
            else
            {
                i3.remove();
            }
        }
        System.out.println(l1);
        System.out.println("Iterating Set Object");
        TreeSet t1=new TreeSet();
        for (int i =28; i >0 ; i--) {
            t1.add(i);
        }
        Iterator i5=t1.iterator();
        while (i5.hasNext())
        {
            Integer i7=(Integer)i5.next();
            if ((i7*2+1)%3==0)
            {
                System.out.println(i7);
            }
            else
            {
                i5.remove();
            }
        }
        System.out.println(t1);
        System.out.println("Iterating a Map Object:");
        LinkedHashMap lh=new LinkedHashMap();
        for (int i = 10; i <20 ; i++) {
            lh.put("Kan"+i,i);
        }
        System.out.println(lh);
        Iterator i6=l1.listIterator();
        while (i6.hasNext())
        {
            System.out.println(i6.next());
        }
    }
}
