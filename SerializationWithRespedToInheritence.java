import java.io.*;

public class SerializationWithRespedToInheritence {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Inherit3 i1=new Inherit3();
        Inherit1 i3=new Inherit1();
        Inherit1 i4=new Inherit3();
        FileOutputStream fos=new FileOutputStream("Serialization");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(i1);

        FileInputStream fis=new FileInputStream("Serialization");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Inherit3 i2=(Inherit3)ois.readObject();
        System.out.println(i2.f+"\t"+i2.j);
        i2.m1();

        /*FileOutputStream fos1=new FileOutputStream("Serialization");
        ObjectOutputStream oos1=new ObjectOutputStream(fos1);
        oos1.writeObject(i3);

        FileInputStream fis1=new FileInputStream("Serialization");
        ObjectInputStream ois1=new ObjectInputStream(fis1);
        Inherit1 i5=(Inherit1)ois1.readObject();
        System.out.println(i5.j);
        i5.m1();*/

        FileOutputStream fos2=new FileOutputStream("Serialization");
        ObjectOutputStream oos2=new ObjectOutputStream(fos2);
        oos2.writeObject(i4);

        FileInputStream fis2=new FileInputStream("Serialization");
        ObjectInputStream ois2=new ObjectInputStream(fis2);
        Inherit3 i7=(Inherit3)ois2.readObject();
        System.out.println(i7.f+"\t"+i7.j);
        i7.m1();



    }
}
class Inherit1
{
    public Inherit1() {
        System.out.println("Parent Constructor");
    }

    int j=12;
    public void m1()
    {
        System.out.println("This is Parent  Class");
    }
}
class Inherit3 extends Inherit1 implements Serializable
{
    public Inherit3(){
        System.out.println("This is ChildConstructor");
    }
  int f=29;
  public void m1()
  {
      System.out.println("This is Child Class");
  }
}
