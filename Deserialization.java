import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fos=new FileInputStream("Serialization.ser");
        ObjectInputStream ois=new ObjectInputStream(fos);
        Serialize s=(Serialize) ois.readObject();
        System.out.println(s.i+"\t"+s.j);
    }
}
