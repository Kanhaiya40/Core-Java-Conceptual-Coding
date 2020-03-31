import java.lang.reflect.Method;

class Annonymous1
{
    public  void m1(int x, int y)
    {
        System.out.println("This is Sum of Two no.s"+(x+y));
    }
    public void m2()
    {
        System.out.println("This is M2 Method");
    }
    public void m3()
    {
        System.out.println("This is M3 Mthod");
    }
}

public class AnnonymousInnerClassExtendsClass {
    public static void main(String[] args) {
        Annonymous1 a1=new Annonymous1()
        {
            public void m1(int x, int y)
            {
                System.out.println("The Mutiplication of Two given no. is"+(x*y));
            }
        };
        a1.m1(5,3);
        System.out.println(a1.getClass().getName());
        Annonymous1 a2=new Annonymous1()
        {
            @Override
            public void m1(int x, int y) {
                try {

                        System.out.println("Division of Two nos. is" + (y / x));
                    }
                    catch(ArithmeticException e)
                    {
                        System.out.println("Divinding with Wrong Input");
                        System.out.println("After Puting Right Input "+(x/y));
                    }
            }
        };
        a2.m1(5,10);
        a2.m1(10,5);
        a2.m1(0,10);
        System.out.println(a2.getClass().getName());
        Annonymous1 a3=new Annonymous1();
        Class c=a3.getClass();
        int count=0;
        Method[] m=c.getDeclaredMethods();
        for (Method m1:m
             ) {
            count++;
            System.out.println(m1.getName());

        }
        System.out.println(count);
    }
}
