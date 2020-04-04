import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class ArrayListClass {
    public static void main(String[] args) {

        ArrayList l=new ArrayList();


        ArrayList l1= new ArrayList(20);

        l.add(20);
        l.add(30);
        l.add(25);
        l.add(23);
        l.add(27);
        l.set(2,27);
        Object[] l7=l.toArray();

        for (Object o:l7
        ) {

            System.out.println(o);

        }

        System.out.println(l.isEmpty());

        l.remove(2);


        l.ensureCapacity(3);
        l.sort(new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
                Integer i1=(Integer)o;
                Integer i2=(Integer)t1;
                return i1.compareTo(i2);
            }
        });
        l.add(1,"Parwej");
        l.add("Kanhaiya");
        l.add("Parwej");

        if (l.contains(27))
        {
            l.set(l.indexOf(27),45);
        }





        System.out.println(l);

        l1.add("Kanhaiya");
        l1.add("asfaque");
        l1.add("Happy");
        l1.add("Krishna");
        l1.add(10);
        l1.add("Bharat");
        Collection l2=new ArrayList();
        l2.add(1.2);
        l2.add(3.2);
        l2.add(4.2);
        l2.add(5.2);



        l1.addAll(3,l2);
        System.out.println(l1.removeAll(l2));
        System.out.println(l1);


        System.out.println(l1.spliterator());





    }
}
