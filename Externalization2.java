import java.io.*;

public class Externalization2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        External2 e1=new External2("Kanhaiya",20,"Kanha");
        FileOutputStream fos=new FileOutputStream("Serialization");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e1);
        FileInputStream f1=new FileInputStream("Serialization");
        ObjectInputStream ois=new ObjectInputStream(f1);
        External2 e2=(External2) ois.readObject();
        System.out.println(e2.s+"\t"+e2.d+"\t"+e2.s1);


    }
}
class External2 implements Externalizable
{
    String s;
    int d;
    String s1;
    public External2(String s,int d,String s1)
    {
        this.s=s;
        this.d=d;
        this.s1=s1;
    }
    public External2()
    {
        System.out.println("No Argumanet Constructor");
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(s);
        objectOutput.writeInt(d);

    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        String s4=(String)objectInput.readObject();
        int i=objectInput.readInt();
        s=s4;
        d=i;
    }
}