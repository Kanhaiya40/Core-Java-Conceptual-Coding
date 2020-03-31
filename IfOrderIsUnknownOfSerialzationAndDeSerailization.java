import java.io.*;

public class IfOrderIsUnknownOfSerialzationAndDeSerailization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serialize4 s1=new Serialize4();
        FileOutputStream fos1=new FileOutputStream("Serialization2.ser");
        ObjectOutputStream oos1=new ObjectOutputStream(fos1);
        oos1.writeObject(s1);
        FileInputStream fis3=new FileInputStream("Serialization2.ser");
        ObjectInputStream ois3=new ObjectInputStream(fis3);
        Object o2 =  ois3.readObject();
        if (o2 instanceof Serialize4) {
            Serialize4 s4 = (Serialize4) o2;
            System.out.println(s4.i + "\t" + s4.j);
        }




        Serialize5 s2=new Serialize5();
        FileOutputStream fos2=new FileOutputStream("Serialization2.ser");
        ObjectOutputStream oos2=new ObjectOutputStream(fos2);
        oos2.writeObject(s2);

        FileInputStream fis2=new FileInputStream("Serialization2.ser");
        ObjectInputStream ois2=new ObjectInputStream(fis2);
        Object o1 =  ois2.readObject();
        if (o1 instanceof Serialize5) {
            Serialize5 s5 = (Serialize5) o1;
            System.out.println(s5.k + "\t" + s5.l);
        }



        Serialize6 s3=new Serialize6();
        FileOutputStream fos3=new FileOutputStream("Serialization2.ser");
        ObjectOutputStream oos4=new ObjectOutputStream(fos3);
        oos4.writeObject(s3);


        FileInputStream fis1=new FileInputStream("Serialization2.ser");
        ObjectInputStream ois1=new ObjectInputStream(fis1);
        Object o =  ois1.readObject();


            if (o instanceof Serialize6) {
                Serialize6 s6 = (Serialize6) o;
                System.out.println(s6.m + "\t" + s6.n);
            }




















    }
}
class Serialize4 implements Serializable
{
    int i=10;
    int j=20;
}
class Serialize5 implements Serializable
{
    int k=30;
    int l=40;

}
class Serialize6 implements Serializable
{
    int m=50;
    int n=60;
}