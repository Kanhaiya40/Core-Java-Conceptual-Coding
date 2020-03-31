

interface Interface1
{
    public void m1();
    public void m2();

}
abstract  class AbsClass1 implements Interface1
{
    public abstract void m1() ;
    public  void m2()
    {
        System.out.println("InterFace Method is Implemented Here");
    }
}
class AbsClass2 extends AbsClass1
{
    public void m1()
    {
        System.out.println("Abstact method is Implemented here");
    }
}



public class OverridingWithInaterfaceAndAbstractClass {
    public static void main(String[] args) {
        AbsClass2 a1=new AbsClass2();
        a1.m1();
        a1.m2();

    }
}
