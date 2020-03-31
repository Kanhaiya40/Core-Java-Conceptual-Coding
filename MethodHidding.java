class MethodHide1 {

    public static  void m1()
    {
        System.out.println("This is Hidden Method");
    }

}
class MethodHide2 extends MethodHide1
{
    public static void m1()
    {
        System.out.println("This is Method Hidding Process");
    }
}

    public class MethodHidding {
        public static void main(String[] args) {
            MethodHide1 t1=new MethodHide1();
            MethodHide2 t2=new MethodHide2();
            MethodHide1 t3=new MethodHide2();
            t1.m1();
            t2.m1();
            t3.m1();
        }
    }

/* In the Method Hidding Method Resolution Takes Care by Copiler */