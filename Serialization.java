import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Serialize s=new Serialize();
        FileOutputStream fis=new FileOutputStream("Serialization.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fis);
        oos.writeObject(s);
    }
}
class Serialize implements Serializable
{
    int i=10;
    int j=14;
}
