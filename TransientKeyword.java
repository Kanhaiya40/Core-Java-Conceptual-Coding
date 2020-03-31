import java.io.*;

public class TransientKeyword {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Transient t1 = new Transient(100, 200);
        FileOutputStream fos = new FileOutputStream("Serialization.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(t1);
        FileInputStream fis=new FileInputStream("Serialization.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Transient t2=(Transient)ois.readObject();
        System.out.println(t2.i+"\t"+t2.j);
    }
}
class Transient implements Serializable
{
     int i;
     transient int j;
public Transient(int i,int j)
{
    this.i=i;
    this.j=j;
}

}

/*
Taking Static Or Final Variable as trasient variable is not of use because Satic varialble is not part of Object state.
And final variable will take part in serialization by value directly.
The word transient means not to serialize that variable.
 */