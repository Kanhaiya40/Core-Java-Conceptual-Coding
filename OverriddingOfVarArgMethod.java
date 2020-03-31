class VarArg1
{
    public void m1(String...s)
    {
        System.out.println(s.getClass().getName());
    }
}
class VarArg2 extends VarArg1
{

    public void m1(String s) {
        System.out.println("This is Integer Class");
    }
}



public class OverriddingOfVarArgMethod {

    public static void main(String[] args) {
        VarArg1 v1=new VarArg1();
        VarArg2 v2=new VarArg2();
        VarArg1 v3=new VarArg2();
        v1.m1("Kanhaiya","Kanhiaya2");
        v2.m1("Kanhaiya3");
        v3.m1("Kanhiaya4","Kanhiaya5");
    }
}
