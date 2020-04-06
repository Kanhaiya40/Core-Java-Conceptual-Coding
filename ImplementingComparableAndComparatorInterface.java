import javax.xml.namespace.QName;
import java.util.Comparator;
import java.util.TreeSet;

public class ImplementingComparableAndComparatorInterface {
    public static void main(String[] args) {
        TreeSet t1=new TreeSet(new Employe("Name",1));
        Employe e1=new Employe("Ishant",33);
        Employe e2=new Employe("Umesh",31);
        Employe e3=new Employe("Shami",32);
        Employe e4=new Employe("Bumarah",26);
        Employe e5=new Employe("Bhubhneshwar",30);
        Employe e6=new Employe("Deepak",23);
        Employe e7=new Employe("Shardul",27);
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        t1.add(e7);
        System.out.println(t1);
        TreeSet t2=new TreeSet();
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        t2.add(e6);
        t2.add(e7);
        System.out.println(t2);


    }
}
class Employe implements Comparable, Comparator
{
    private String name;
    private int id;
    public Employe(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString() {
        return name+" "+id;
    }
    public int compareTo(Object o)
    {
        Employe e1=(Employe)o;
        int id1=e1.id;
        int id2=this.id;
        if(id1>id2)
        {
            return +1;
        }
        if (id1<id2)
        {
            return -1;
        }
        else
        {
            return 0;
        }

    }
    public int compare(Object o,Object t1)
    {
        Employe e1=(Employe)o;
        Employe e2=(Employe)t1;
        String name1=e1.name;
        String name2=e2.name;
        return name1.compareTo(name2);
    }
}
