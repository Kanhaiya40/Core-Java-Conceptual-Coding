import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListClass extends Thread {

    /*
    It is Child Interface of List interface
    It is Cloned Copy of UnderLlying ArrayList
    There are Several Methods Defined For CopyOnWriteArrayList are-
    -boolean addIfAbsent(Object o)
    -int addAllAbsent(Collection c)
     */
   static CopyOnWriteArrayList cw=new CopyOnWriteArrayList();
    @Override
    public void run() {
        for (int i = 0; i <9; i++) {
            System.out.println("Good Morning:");
            cw.addIfAbsent("Kamayani");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            cw.addIfAbsent("Ranju");
            System.out.println("Kanhaiya");
        }
    }

    public static void main(String[] args) {
        CopyOnWriteArrayListClass c1=new CopyOnWriteArrayListClass();
        c1.start();
        cw.addIfAbsent("Kanhaiya");
        cw.addIfAbsent("Kanhaiya");
        cw.addIfAbsent("Kunal");
        cw.addIfAbsent("Kishore");
        cw.addIfAbsent("Gautam");
        cw.addIfAbsent("Rishi");
        cw.addIfAbsent("Ritu");
        Iterator i1=cw.iterator();
        while(i1.hasNext())
        {
            String s1=i1.next().toString();
            int l1=s1.length();
            if (l1>5)
            {
                System.out.println(s1);
            }
            else
            {
                //i1.remove();//We can't Perform Remove Operation on  CopyOnWriteArrayList Otherwise it will give UnsupportedOperationException
            }
        }
        System.out.println(cw);
    }
}
