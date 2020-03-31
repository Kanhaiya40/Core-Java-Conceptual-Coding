

class OuterClass
{
    public void m1()
    {
     InnerClass i1=new InnerClass();
     i1.m2();
    }

    class InnerClass
    {
       public void m2()
       {
           for (int i = 0; i <10 ; i++) {
               System.out.println("Hi");
               try
               {
                   Thread.sleep(2000);
               }
               catch(InterruptedException e)
               {
                   System.out.println(e);
               }
               System.out.println("Kanhaiya");
           }
       }
    }
}





public class ClassInsideClass {
    public static void main(String[] args) {
        OuterClass o1=new OuterClass();
        o1.m1();

    }
}
