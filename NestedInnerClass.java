class  OuterNested
{

    int x=5;
    static int y=10;
    class InnerNested
    {
        int x=10;
        int y=20;
        public void m2()
        {
            System.out.println("This is Inner Class");
            SubInnerNested s1=new SubInnerNested();
            System.out.println(s1.x);
            System.out.println(s1.y);
            System.out.println(this.x);
            System.out.println(this.y);
            System.out.println(OuterNested.this.x);
            System.out.println(OuterNested.this.y);
            s1.m1();
        }
        class SubInnerNested
        {
            int x=15;
             int y=25;
            public void m1()
            {
                System.out.println("This is InnerMost Class");
                System.out.println(this.x);
                System.out.println(this.y);
                System.out.println(x);
                System.out.println(y);
                System.out.println(InnerNested.this.x);
                System.out.println(InnerNested.this.y);
                System.out.println(OuterNested.this.x);
                System.out.println(OuterNested.this.y);
            }
        }
    }
}



public class NestedInnerClass {
    public static void main(String[] args) {
        OuterNested o1=new OuterNested();
        OuterNested.InnerNested i1=o1.new InnerNested();
        i1.m2();
    }
}
