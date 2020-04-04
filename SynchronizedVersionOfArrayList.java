import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedVersionOfArrayList {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        List l1= Collections.synchronizedList(l);
        System.out.println(l);
        System.out.println("This ArrayList Gives Feature Of Synchronization");
        l.add("Kanhygvftar");
        System.out.println(l);
    }
}
