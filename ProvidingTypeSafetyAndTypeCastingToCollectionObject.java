import java.util.ArrayList;

public class ProvidingTypeSafetyAndTypeCastingToCollectionObject {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();//Genric Version Of ArrayList
        al.add("K");
        al.add("A");
        al.add("N");
        al.add("H");
       // al.add(10);//CompileTime Error So we Can't add Other type data instead of String
        al.add("A");
        System.out.println(al);
        String s1=al.get(3);//Hence At the Time Of Retrival We Are Not Require to Type-Cast the Object
        System.out.println(s1);
        /*
        Hence By this Way we Provided Type-Safety and Type-Casting to Collections
         */

    }
}
