import java.util.Comparator;
import java.util.TreeSet;

public class InsertingStringAndStringBufferAccordToLength {
    public static void main(String[] args) {
        TreeSet t1=new TreeSet(new Comparator4());
        t1.add(new StringBuffer("Sikhar"));
        t1.add(new StringBuffer("Rahul"));
        t1.add(new StringBuffer("Rohit"));
        t1.add(new StringBuffer("Virat"));
        t1.add(new StringBuffer("Kholi"));
        t1.add("Singh");
        t1.add("Dhoni");
        System.out.println(t1);
    }
}
class Comparator4 implements Comparator
{
    @Override
    public int compare(Object o, Object t1) {
        String s1=o.toString();
        String s2=t1.toString();
        int i1=s1.length();
        int i2=s2.length();
        if(i1>i2)
        {
            return +1;
        }
        if (i1<i2)
        {
            return -1;
        }
        else {
            return s1.compareTo(s2);
        }
    }
}