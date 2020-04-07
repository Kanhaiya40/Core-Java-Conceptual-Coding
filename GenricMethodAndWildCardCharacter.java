import java.util.ArrayList;
import java.util.Comparator;

public class GenricMethodAndWildCardCharacter {
    public static void main(String[] args) {
        ArrayList<? extends Number> a1=new ArrayList<Integer>();
        //ArrayList<? extends Number> a2=new ArrayList<String>();
        WildCard<Integer> w1=new WildCard<Integer>(20);
        ArrayList<String> i1=new ArrayList<String>();
        System.out.println(w1.get(i1));
    }
}
class  WildCard<T extends Number>
{
    T name;
    public WildCard(T name)
    {
        this.name=name;
    }
    public T get(ArrayList<?> t)
    {
        System.out.println("Class of Variable:"+t.getClass().getName());
        return name;
    }
}