import java.util.ArrayList;
import java.util.Collections;

public class SortingThroughCollectionsClass {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(10);
        a1.add(4);
        a1.add(13);
        a1.add(20);
        a1.add(25);
        a1.add(14);
        a1.add(7);
        a1.add(80);
        a1.add(3);
        a1.add(8);
        a1.add(1);
        Collections.sort(a1);
        System.out.println("Sorted ArrayList:");
        System.out.println(a1);
        Collections.fill(a1,1);
        System.out.println( Collections.frequency(a1,1));
        System.out.println(a1);



    }
}
