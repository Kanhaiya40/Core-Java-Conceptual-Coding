class Covariant1
{
    public Object m1(Object o)
    {
        System.out.println("This is "+o.getClass().getName()+"Class");
        return  0;
    }
}
class Covariant2 extends Covariant1
{
    @Override
    public String m1(Object s) {
        System.out.println("This is "+s.getClass().getName()+"Class");
        return  "";
    }
}
public class OverriddingWithCoVariantReturnType {
    public static void main(String[] args) {
        Covariant2 c1=new Covariant2();
        c1.m1(new StringBuffer("Kanhaiya"));
        c1.m1(new String("KanhaiyaKumar"));

    }
}
