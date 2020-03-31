import java.io.*;

public class CustomizeSerializationExplanation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account a1=new Account();
        System.out.println(a1.username+"\t"+a1.pwd+"\t"+a1.pin);
        FileOutputStream f1=new FileOutputStream("Serialization2");
        ObjectOutputStream oos=new ObjectOutputStream(f1);
        oos.writeObject(a1);
        FileInputStream fis=new FileInputStream("Serialization2");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a2=(Account)ois.readObject();
        System.out.println(a2.username+"\t"+a2.pwd+"\t"+a2.pin);
    }
}

class Account implements Serializable
{
    String username="Kanhaiya";
    transient String pwd="hagkjah876";
    transient String pin="4532";

    private void writeObject(ObjectOutputStream oos) throws Exception, IOException {
        oos.defaultWriteObject();
        String epin="123"+pin;
        String epwd=epin+pwd;
        oos.writeObject(epin);
        oos.writeObject(epwd);
    }
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        String epin=(String)ois.readObject();
        pin=epin.substring(3);
        String epwd=(String)ois.readObject();
        pwd=epwd.substring(7);
    }

}