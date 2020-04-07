import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationException extends Thread {
    //static ArrayList a1=new ArrayList();//It is Giving ConcurrentModificationException So to OverCome This Problem Concurrent Collection Was Introduced
    static CopyOnWriteArrayList a1=new CopyOnWriteArrayList();
    @Override
    public void run() {

        for (int i = 0; i <9; i++) {
            System.out.println("Hi");
            a1.add(30);
            try {

                Thread.sleep(5000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Kanhaiya");
        }

    }

    public static void main(String[] args) {
        ConcurrentModificationException c1=new ConcurrentModificationException();
        c1.start();
        a1.add(10);
        a1.add(30);
        a1.add(50);
        Iterator i1=a1.iterator();
        while (i1.hasNext())
        {
            Integer i2=(Integer)i1.next();
            System.out.println(i2);
        }

    }
}
