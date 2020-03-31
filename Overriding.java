class Override1
{
    public void m1()
    {
        System.out.println("This is parent Method");
    }
}
class Override2 extends Override1
{
    @Override
    public void m1() {
        System.out.println("This is child method");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Override1 o1=new Override1();
        Override2 o2=new Override2();
        Override1 o3=new Override2();
        o3.m1();o1.m1();o2.m1();

    }
}
