interface  OuterInterface
{
    public String m1();


    interface InerInterface
    {
        public  String m2();
    }
}
class Intraface1 implements OuterInterface
{
    @Override
    public String  m1() {
        System.out.println("This is Outer Interface Implementation Method");
        return "b";
    }
}
class Intraface implements OuterInterface.InerInterface
{
    @Override
    public String m2() {
        System.out.println("This is Inner Interface Implementation Method");
        return "a";
    }
}




public class InterfaceInsideInterface {
    public static void main(String[] args) {
        Intraface1 i1=new Intraface1();
        Intraface i2=new Intraface();
        i1.m1();
        i2.m2();
    }
}
