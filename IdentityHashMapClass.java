import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class IdentityHashMapClass {
    public static void main(String[] args) {
        /*
        In NormalHashMap Duplicates are identofied by .equals() by jvm
        But in IdentityHashMap Duplicates are identified by == method by jvm

        */
        //IdentityHashMap i1=new IdentityHashMap();//036

        HashMap i1=new HashMap();
        //LinkedHashMap i1=new LinkedHashMap();
        String s1=new String("Kanhaiya");
        String s2=new String("Kanhaiya");
        i1.put(s1,10);
        i1.put(s2,30);
        System.out.println(i1);

    }
}
