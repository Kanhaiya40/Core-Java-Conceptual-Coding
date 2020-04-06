import java.util.*;

public class ListIteratorCursor {
    public static void main(String[] args) {
        Vector t1=new Vector();
        t1.add("Kanhaiya");
        ArrayList a1=new ArrayList();
        System.out.println("Iterating Vector Object:");
        ListIterator l1= t1.listIterator();
        while (l1.hasNext())
        {
            System.out.println(l1.next());
        }
        for (int i = 0; i <10 ; i++) {
            a1.add(i);
        }
        LinkedList l2=new LinkedList();
        for (int i = 11; i <20 ; i++) {
            l2.add(i);
        }
        Stack s1=new Stack();
        for (int i = 25; i < 37; i++) {
            s1.push(i);
        }
        System.out.println("Iterating ArrayList Object:");
        ListIterator l3=a1.listIterator();
        while (l3.hasNext())
        {
            System.out.println(l3.next());
        }
        System.out.println("Iterating LinkedList Object:");
        ListIterator l4=l2.listIterator();
        while (l4.hasNext())
        {
            Integer i1=(Integer)l4.next();
            if(i1%3==0)
            {
                l4.set(89);
            }
            else
            {
                l4.remove();
            }



        }
        System.out.println(l2);
        System.out.println("Iterating Stack Object:");
        ListIterator l5=s1.listIterator();
        while (l5.hasNext())
        {
            System.out.println(l5.next());
        }
        System.out.println(l1);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
    }
}
