class MethodLocal
{
    int p=200;
    static int q=300;
    public static void m1() /* It can be both Instance Or Static*/
    {

        int k=10;
        int m=20;

        class InnerMethodLocal
        {
            public void m2(int x, int y)
            {
                System.out.println("The Sum Of Two Given Nos. are: "+(x+y));
             //   System.out.println(p); /* Non-static field 'p' cannot be referenced from a static context */
                System.out.println(q);
                System.out.println(k);
                System.out.println(m);
            }

        }
        InnerMethodLocal i1=new InnerMethodLocal();
        i1.m2(10,20);
        i1.m2(20,30);
        i1.m2(30,40);
    }

}





public class MethodLocalInnerClass {
    public static void main(String[] args) {
        MethodLocal m1=new MethodLocal();
        m1.m1();
    }
}
