

class CreateObject1
{
    public void m1()
    {
        System.out.println("This is Class "+Object.class.getName());
    }
}




public class CreationOfObject {
    public static void main(String[] args)  {


        CreateObject1 o1 = new CreateObject1();
        o1.m1();

    }
}