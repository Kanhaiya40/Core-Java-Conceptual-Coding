public class OverLoadingwrtWideningAndVar_ArgMethod {
    public static void main(String ...args) {
        AutoBoxing2 a2=new AutoBoxing2();
        a2.m1(100);
    }
}
class AutoBoxing2
{
    public void m1(int...x)
    {
        System.out.println("Var-arg Method Dominates int x="+x);
    }
    public void m1(long l)
    {
        System.out.println("Widening dominates long l="+l);
    }
}
