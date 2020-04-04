import java.io.*;

public class DemoSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d1=new Dog();
        System.out.println(d1);
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
      FileInputStream fis=new FileInputStream("abc.ser");
      ObjectInputStream ois=new ObjectInputStream(fis);
      Dog d2=(Dog)ois.readObject();
        System.out.println(d2.i+"\t"+d2.j);




    }


}
class Dog implements Serializable
{
   transient int i=10;
    int j=20;


}
