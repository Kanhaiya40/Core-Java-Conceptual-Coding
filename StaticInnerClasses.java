class StaticInner1
{
    int x=10;
    static int y=18;
     static class StaticInner2
    {
        public void m1()
        {
            System.out.println("This is Static Method");
          //  System.out.println(x); /* Non-static field 'x' cannot be referenced from a static context */
            System.out.println(y);
        }

    }
    }









public class StaticInnerClasses {
    public static void main(String[] args) {
        StaticInner1 si2=new StaticInner1();
        StaticInner1.StaticInner2 si1=new StaticInner1.StaticInner2();
        si1.m1();
        System.out.println(si1.getClass().getName());


    }
}
