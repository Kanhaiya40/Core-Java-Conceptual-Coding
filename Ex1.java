import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
       Parent p1=new Parent();
       Parent p2=new Child();
       Child c1=new Child();
       p1.m1(10);//parent
       p2.m1(10);//Parent
        c1.m1(10);//Parenet



    }





}
class  Parent
{
    public void m1(long l) {
        System.out.println("Parent");
    }
}

class Child extends Parent
{
    public void m1(Integer i)
   {
      System.out.println("Child");
    }
}




