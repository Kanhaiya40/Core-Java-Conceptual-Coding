import java.util.Arrays;
import java.util.Comparator;

public class SearchingOfElementsInArraysClass {
    public static void main(String[] args) {
        int[] i1={165,41,64,297,81,91,984,39,167,61,319,31};
        String[] s1={"Kanhaiya","Dharmendra","Lokesh","Jay","Vishal","Adarsh"};
        Arrays.sort(i1);
        System.out.println(Arrays.binarySearch(i1,91));
        Arrays.sort(s1);
        System.out.println(Arrays.binarySearch(s1,"Jay"));
        System.out.println(Arrays.binarySearch(s1,"Vishal",new Comparator6()));

    }
}
class Comparator6 implements Comparator
{
    @Override
    public int compare(Object o, Object t1) {
        String s1=o.toString();
        String s2=t1.toString();
        return s2.compareTo(s1);
    }
}
