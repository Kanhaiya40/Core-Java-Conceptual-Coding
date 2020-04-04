import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add(100);
        l1.add(56);
        l1.add(62);
        l1.add(67);
        l1.add(43);
        l1.add(3,57);
        System.out.println(l1);

        System.out.println(l1.getFirst());
        System.out.println(l1.get(4));
        l1.removeFirstOccurrence(62);
        if (l1.contains(62))
        {
            l1.set(2,100);
        }
        else
        {
            l1.add(2,62);
        }

        System.out.println(l1.element());

        Object[] o=l1.toArray();
        for (Object o2:o
             ) {
            System.out.print(o2+"\t");

        }
    }
}
