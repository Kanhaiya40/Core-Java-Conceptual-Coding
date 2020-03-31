abstract class Abstract1
{
    private static  int x;
    private static String c;
    private static float y;

    Abstract1(int x,String c,float y)
    {
    this.x=x;
    this.c=c;
    this.y=y;
    }
    public void multiple()
    {
        System.out.println("This is mutiltiple class");
        System.out.println(x);
        System.out.println(c);
        System.out.println(y);

    }
   abstract public void sum();




}
class Abstract2 extends Abstract1
{
    private int  age;
    private static int treat=100;
    Abstract2(int x,String c,float y,int age)
    {
        super(x,c,y);
        this.age=age;

    }
    public void sum()
    {
        treat=234;
        System.out.println("This is sum Method");
        System.out.println(age);
        System.out.println(treat);

    }

}
abstract class p
{
    p()
    {
        System.out.println(this.hashCode());
    }
}
class c extends  p
{
    c()
    {
        System.out.println(this.hashCode());
    }
}




public class AbstractClassConstructor {
    public static void main(String[] args) {
        Abstract2 a1 = new Abstract2(8, "Kanhaiya", 20.3f, 20);
        c d=new c();
        System.out.println(d.hashCode());
        a1.sum();
        a1.multiple();
    }
}
