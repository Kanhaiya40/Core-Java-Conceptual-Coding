class Construct1
{

    Construct1()
    {



        System.out.println("This is Default Constructor");

    }
    Construct1(int x)
    {
        System.out.println("The is single Argument Constructor");
    }
    Construct1(int y,int f)
    {
        System.out.println("This is Multiple Argument Constructor");
    }
}




public class ConstructorEx {
    public static void main(String[] args) {
        Construct1 c1=new Construct1();
        Construct1 c2=new Construct1(10);
        Construct1 c3=new Construct1(10,20);



    }
}
