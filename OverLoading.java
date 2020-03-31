class Overload1
{
    public void m1(int age)
    {
        System.out.println("Age="+age);
    }
    public void m1(String name)
    {
        System.out.println("Name="+name);

    }
}
class Overload2 extends Overload1
{
    public void m1(float Salary)
    {
        System.out.println("Salary="+Salary);
    }
    public void m2(Object o)
    {
        System.out.println("Object class="+o.getClass().getName());
    }
    public void m2(String s)
    {
        System.out.println("This is String Class"+s);
    }
}
public class OverLoading {
    public static void main(String[] args) {
        Overload2 o1=new Overload2();
        o1.m1("Kanhaiya");
        o1.m1('a');
        o1.m1(10000f);
        o1.m2("Kanhaiya");
        o1.m2(new Object());

    }
}
