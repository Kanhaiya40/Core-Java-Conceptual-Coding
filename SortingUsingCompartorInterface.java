import java.util.Comparator;
import java.util.TreeSet;

public class SortingUsingCompartorInterface {
    public static void main(String[] args) {
        /*Comparator Interface Contains Two methods
        -public int compare(Object obj1)
        -public boolean equals(Object o)
       // Class implementing Comparator Interface should Compulsary Override compare()
        Method but not required to Override equals() because equals()
        has Already be Overidden by Object Class(Root Class)
        //It is also called Customize Sorting technique
        //In this we can give sorting technique by ownSelf
         */
        TreeSet t1=new TreeSet(new Comparator1());
        t1.add("Rahhi");
        t1.add("Ragni");
        t1.add("Bhagirathi");
        t1.add("Rajrani");
        t1.add(new StringBuffer("Aisa"));
        t1.add(new StringBuffer("Bihu"));
        System.out.println(t1);
    }
}
class Comparator1 implements Comparator
{
    @Override
    public int compare(Object o, Object t1) {
        String s1=o.toString();
        String s2=t1.toString();
        return s2.compareTo(s1);//Descending Order
       // return s1.compareTo(s2);//Ascending Order
       //return -s1.compareTo(s2);//Descending Order
       // return -s2.compareTo(s1);//Ascending Order

    }
}
