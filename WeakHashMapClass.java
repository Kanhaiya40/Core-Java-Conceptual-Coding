import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapClass {
    public static void main(String[] args) {
        /*
        -In HashMap when we Call Garbage Colletor for Object Destruction
        Then HashMap Dominates Garbage Collector
        -But in WeakHashMap It will Available for Garbage Collector

        */
        //HashMap h1=new HashMap();
        WeakHashMap h1=new WeakHashMap();
        Weak w1=new Weak();
        h1.put(w1,10);
        System.out.println(h1);
        System.gc();
        System.out.println(h1);

    }
}
class Weak
{
    @Override
    public String toString() {
        return "Weak";
    }

    @Override
    protected void finalize(){
        System.out.println("Destruction of Object Done");
    }
}