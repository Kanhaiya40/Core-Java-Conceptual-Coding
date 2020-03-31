class Planet
{

}
class Mars extends Planet
{

}
class Axis
{
    public void m1(Planet p)
    {
        System.out.println("This Is Planet area");
    }
    public void m1(Mars m)
    {
        System.out.println("This is Mars Area");
    }
}

public class OverLoadingMethodResolution {
    public static void main(String[] args) {
        Planet o=new Planet();
        Axis a=new Axis();
        a.m1(o);
        Mars m=new Mars();
        a.m1(m);
        Planet y=new Mars();
        a.m1(y);
    }
}
