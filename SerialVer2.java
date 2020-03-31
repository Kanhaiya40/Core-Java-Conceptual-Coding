import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class SerialVer2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerialVer s2=new SerialVer();
        FileInputStream f1=new FileInputStream("Serialization.ser");
        ObjectInputStream ois=new ObjectInputStream(f1);
        SerialVer s=(SerialVer) ois.readObject();
        System.out.println(s.i+"\t"+s.j+"\t");


    }
}
