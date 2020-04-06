import java.util.Arrays;
import java.util.List;

public class ConversionOfArrayToList {
    public static void main(String[] args) {
            String[] s1={"G","B","K","h","N","H","I","Y"};
            int[] i1={606,45,5,861,465,468,682,6,31,39};
            List l1= Arrays.asList(s1);
            List l2=Arrays.asList(i1);
        System.out.println(l2);
            //l1.add("J");//It Will Create Runtime Exception Saying UnsupportedOPerationException
            //l1.set(3,45);//It will create RuntimeExceptionSaying ArrayStoreException
        System.out.println(l1);
    }
}
