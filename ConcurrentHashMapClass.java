import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapClass extends Thread{
    static ConcurrentHashMap c1=new ConcurrentHashMap();

    @Override
    public void run() {
        for (int i = 0; i <9 ; i++) {
            System.out.println("Hi");
            c1.putIfAbsent(101,"Kanhaiya");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Kanhaiya");
        }
    }

    public static void main(String[] args) {
        c1.putIfAbsent(2,"Anmol");
        c1.putIfAbsent(4,"Bipul");
        c1.putIfAbsent(5,"Rakesh");
        ConcurrentHashMapClass c2=new ConcurrentHashMapClass();
        c2.start();
        Set s1=c1.entrySet();
        Iterator i1=s1.iterator();
        while(i1.hasNext())
        {
            Map.Entry m1=(Map.Entry)i1.next();
            System.out.println(m1);
            Integer i3=(Integer)m1.getKey();
            if(i3==2)
            {
                System.out.println(m1);
            }
        }
    }
}
