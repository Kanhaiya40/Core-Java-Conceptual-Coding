import java.io.*;

public class DeseralizationOrderToSerailization {
    public static void main(String[] args) throws IOException ,ClassNotFoundException {
        Serialize1 s1=new Serialize1();
        FileOutputStream fos1=new FileOutputStream("Serialization1.ser");
        ObjectOutputStream oos1=new ObjectOutputStream(fos1);
        oos1.writeObject(s1);

        FileInputStream fis1=new FileInputStream("Serialization1.ser");
        ObjectInputStream ois1=new ObjectInputStream(fis1);
        Serialize1 s4=(Serialize1)ois1.readObject();
        System.out.println(s4.i+"\t"+s4.j);


        Serialize2 s2=new Serialize2();
        FileOutputStream fos2=new FileOutputStream("Serialization1.ser");
        ObjectOutputStream oos2=new ObjectOutputStream(fos2);
        oos2.writeObject(s2);

        FileInputStream fis2=new FileInputStream("Serialization1.ser");
        ObjectInputStream ois2=new ObjectInputStream(fis2);
        Serialize2 s5=(Serialize2)ois2.readObject();
        System.out.println(s5.k+"\t"+s5.l);


        Serialize3 s3=new Serialize3();
        FileOutputStream fos3=new FileOutputStream("Serialization1.ser");
        ObjectOutputStream oos4=new ObjectOutputStream(fos3);
        oos4.writeObject(s3);

        FileInputStream fis3=new FileInputStream("Serialization1.ser");
        ObjectInputStream ois3=new ObjectInputStream(fis3);
        Serialize3 s6=(Serialize3)ois3.readObject();
        System.out.println(s6.n+"\t"+s6.m);

    }
}
class Serialize1 implements Serializable
{
    int i=10;
    int j=20;
}
class Serialize2 implements Serializable
{
    int k=30;
    int l=40;

}
class Serialize3 implements Serializable
{
    int m=50;
    int n=60;
}
