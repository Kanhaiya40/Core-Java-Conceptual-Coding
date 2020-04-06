import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedVersionOfHashMap {
    public static void main(String[] args) {
        HashMap h1=new HashMap();
        Map m= Collections.synchronizedMap(h1);
    }
}
