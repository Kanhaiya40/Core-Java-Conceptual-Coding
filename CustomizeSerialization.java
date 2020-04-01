import java.io.*;

public class CustomizeSerialization {
    public static void main(String[] args) throws  IOException, ClassNotFoundException {
        Customer c1=new Customer();
        System.out.println(c1.Username+"\t"+c1.pass);
        FileOutputStream f1=new FileOutputStream("Serialization2");
        ObjectOutputStream oos=new ObjectOutputStream(f1);
        oos.writeObject(c1);
        FileInputStream f2=new FileInputStream("Serialization2");
        ObjectInputStream ois=new ObjectInputStream(f2);
        Customer c2=(Customer) ois.readObject();
        System.out.println(c2.Username+"\t"+c2.pass);

    }
}
class Customer implements Serializable
{
    String Username="rokstarkanhaiya";
    transient String pass="8294741264kk";
    private void writeObject(ObjectOutputStream oos) throws Exception, IOException {
        oos.defaultWriteObject();
        String epass="1234"+pass;
        oos.writeObject(epass);
    }
    private void readObject(ObjectInputStream ois) throws Exception, IOException, ClassNotFoundException {
        ois.defaultReadObject();
        String epwd=(String)ois.readObject();
        pass=epwd.substring(4);

    }

}