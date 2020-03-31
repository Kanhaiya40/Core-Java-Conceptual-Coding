public class OverloadingwrtWideningAndAutoboxing {
    public static void main(String[] args) {
        AutoBoxing1 a1=new AutoBoxing1();
        a1.m1(10);
    }
}
class AutoBoxing1
{
    public void m1(Integer i)
    {
        System.out.println("Autoboxing Done Integer i="+i);
    }
    public void m1(long i)
    {
        System.out.println("Widening done long l="+i);
    }
}
