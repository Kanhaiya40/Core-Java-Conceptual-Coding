class Iherit1
{
   int Wheel;
   String Companyname;
    public void car(int Wheel,String Companyname)
    {
        this.Wheel=Wheel;
        this.Companyname=Companyname;
    }

}
class Inherit2 extends Iherit1
{
    public void carInfo()
    {
        System.out.println("Wheel="+Wheel);
        System.out.println("Companyname="+Companyname);
    }
}


public class Inhetitance {
    public static void main(String[] args)
    {
        Inherit2 i1=new Inherit2();
        i1.car(4,"Maruti");
        i1.carInfo();

    }

}
