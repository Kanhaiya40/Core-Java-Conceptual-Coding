public class OverLoadingwrtVar_ArgMethodAndAutoBoxing {
    public static void main(String[] args) {
        System.out.println(args.length);
        AutoBoxing3 a3=new AutoBoxing3();
        a3.m1(1000);

    }
}
class AutoBoxing3
{
    public void m1(int... x)
    {
        System.out.println("Var-Arg Method Dominates int x="+x);
    }
    public void m1(Integer i)
    {
        System.out.println("Autoboxing Concept Dominates Integer i="+i);
    }
}
