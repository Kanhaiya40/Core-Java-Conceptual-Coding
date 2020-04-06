import java.util.Comparator;
import java.util.TreeSet;

public class SortingUsingComparatorOfInteger {
    public static void main(String[] args) {
        TreeSet t1=new TreeSet(new Comparator2());
        t1.add(52);
        t1.add(37);
        t1.add(58);
        t1.add(24);
        t1.add(8);
        t1.add(47);
        t1.add(96);
        t1.add(106);
        t1.add(105);
        t1.add(73);
        t1.add(73);
        System.out.println(t1);


    }
}
class Comparator2 implements Comparator

{
    @Override
    public int compare(Object o, Object t1) {
        Integer i1=(Integer)o;
        Integer i2=(Integer)t1;
        //return i2.compareTo(i1);//As we Know Descending order
        //return +1;//Insertion Order will be Preserved in this case
        //return -1;//Reverse of Insertion
       // return 0;//Only First Element will be Executed rest will be treated as Duplicates
        if (i2>i1)
        {
            return +1;
        }
        else if (i2<i1)
        {
            return -1;
        }
        else
            return 0;
    }
}