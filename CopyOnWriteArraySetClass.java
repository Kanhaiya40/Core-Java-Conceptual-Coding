import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetClass extends Thread {
    /*
    It is Child Interface Of Set Interface
    It is Internally Implemnted By CopyOnArrayList so Almost Every
    Feature is Same Like CopyOnWriteArrayList
    -No additional Methods in CopyOnWriteArraySet, We should use methods Present in'
    Set(I) and Collection(I)
    */
    //static ArrayList c1=new ArrayList();//It Will Give ConcurrentModificationException
    static  CopyOnWriteArraySet c1=new CopyOnWriteArraySet();
    @Override
    public void run() {
        for (int i = 0; i <9 ; i++) {
            System.out.println("Good Afternoon");
            c1.add("KrishnaMurty");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            c1.add("Veda");
            System.out.println("Kanhaiya");
        }
    }

    public static void main(String[] args) {
        CopyOnWriteArraySetClass c2=new CopyOnWriteArraySetClass();
        c2.start();
        c1.add("Smiriti");
        c1.add("Mandana");
        c1.add("HarmanPrit");
        c1.add("Kaur");
        c1.add("Mitali");
        c1.add("Raj");
        c1.add("Poonam");
        c1.add("Yadav");
        Iterator i1=c1.iterator();
        while (i1.hasNext())
        {
            String s1=i1.next().toString();
            int len=s1.length();
            if (len>4)
            {
                System.out.println(s1);
            }
            else
            {
                //i1.remove();//It Will Give UnsupportedOperationException
            }
        }
        System.out.println(c1);

    }


}