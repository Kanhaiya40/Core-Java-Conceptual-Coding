class OuterInterfaceClass
{
    interface  InnerInterface
    {
        public void m1();

    }
    class  InnerInter implements InnerInterface
    {
        @Override
        public void m1() {
            System.out.println("This is Implemented Method of Interface");
        }
    }
}






public class InterfaceInsideClass {
    public static void main(String[] args) {
        OuterInterfaceClass o1=new OuterInterfaceClass();
        OuterInterfaceClass.InnerInter i1=o1.new InnerInter();
        i1.m1();

    }
}
