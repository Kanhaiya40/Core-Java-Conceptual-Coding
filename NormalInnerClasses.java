class OuterNormal
{
     int x=10;
     static int y=20;


    class InnerNormal
    {
      // # Case-1 public static void main(String[] args) {

       // }
        int x=100;
        int y=15;
        public void m1()
        {
            System.out.println("This is Inner Class");
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(OuterNormal.this.x);
            System.out.println(InnerNormal.this.x);
            System.out.println(InnerNormal.this.y);
            System.out.println(OuterNormal.this.y);
            System.out.println(this.y);
            System.out.println(y);  /* We cant deacalre static member's  Inside Inner Class , it Dosen't mean that we Can't access Static member's in Inner CLass */
        }
    }
   /* public void m2()
    {
        InnerNormal i1=new InnerNormal();   */    /* Accessing InnerClass code from Instance area of Outer Class */
      /*  i1.m1();
    } */


}



public class NormalInnerClasses {
    public static void main(String[] args) {
        OuterNormal o1=new OuterNormal();
        OuterNormal.InnerNormal i1=o1.new InnerNormal();
        i1.m1();
       // o1.m2();
        System.out.println(i1.getClass().getName());
    }
}

/*
1. Normal or Regular Inner cLasses Can't have static declartion inside Inner class.
*/
