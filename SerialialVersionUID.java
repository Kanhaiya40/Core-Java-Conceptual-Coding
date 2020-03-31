import java.io.*;

public class SerialialVersionUID {
    public static void main(String[] args) throws IOException {
        SerialVer s=new SerialVer();
        FileOutputStream f1=new FileOutputStream("Serialization.ser");
        ObjectOutputStream oos=new ObjectOutputStream(f1);
        oos.writeObject(s);




    }
}
class SerialVer implements Serializable
{
    public final static long serialVersionUID=1l;
    int i=10;
    int j=12;
    int k=13;

}
