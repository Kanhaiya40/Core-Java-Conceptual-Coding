import java.util.*;

public class VectorClass {
    public static void main(String[] args) {
        Vector v=new Vector();
        System.out.println(v.capacity());
        v.addElement(10);
        v.addElement(25);
        v.addElement(21);
        v.addElement(29);
        v.addElement(24);
        v.addElement(27);
        v.addElement(28);
        v.addElement(22);
        v.addElement(24);
        v.ensureCapacity(5);
        v.addElement(25);
        v.addElement(65);
        v.addElement(45);
        v.sort(
                new Comparator() {
                    @Override
                    public int compare(Object o, Object t1) {
                        Integer i1=(Integer)o;
                        Integer i2=(Integer)t1;
                        return i1.compareTo(i2);
                    }
                }
        );
        Enumeration er=v.elements();
        while(er.hasMoreElements())
        {
            System.out.println(er.nextElement());
        }
        System.out.println(v);
        System.out.println(v.capacity());
        Iterator ir=v.iterator();
        while (ir.hasNext())
        {
            System.out.println(ir.next());
        }

        System.out.println(v.firstElement());
        System.out.println(v.elementAt(7));
        System.out.println(v.get(5));
        v.setElementAt(12,3);
        System.out.println(v);


    }
}
