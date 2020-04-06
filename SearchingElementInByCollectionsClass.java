import java.util.ArrayList;
import java.util.Collections;

public class SearchingElementInByCollectionsClass {
    /*
    Range of Succesfull Searched is- 0 to n-1;
    Range of Unsuccessful Searched is- -1 to -(n+1)
    And Total Range of Searching in Collection is - -(n+1) to (n-1)
     */
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(45);
        a1.add(32);
        a1.add(23);
        a1.add(20);
        a1.add(14);
        a1.add(28);
        a1.add(56);
        a1.add(98);
        a1.add(46);
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println("Index Of Succesful  Sereached Element:");
        System.out.println(Collections.binarySearch(a1,45));
        System.out.println("Index Of Unsuccesful Serched Element:");
        System.out.println(Collections.binarySearch(a1,44));
    }
}
