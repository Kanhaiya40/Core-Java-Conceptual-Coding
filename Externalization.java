import java.io.*;

public class Externalization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        External e1=new External("Kanhaiya",10,20);
        FileOutputStream fos=new FileOutputStream("Serialization");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e1);

        FileInputStream fis=new FileInputStream("Serialization");
        ObjectInputStream ois=new ObjectInputStream(fis);
        External e2=(External)ois.readObject();
        System.out.println(e2.s+"\t"+e2.j+"\t"+e2.k);



    }
}
class External implements Externalizable
{
    String s;
    int j;
    int k;
    public External()
    {
        System.out.println("No-arg Constructors");
    }
    public External(String s,int i,int j)
    {
        this.s=s;
        this.j=j;
        this.k=k;


    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(s);
        objectOutput.writeInt(j);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        String s1=(String)objectInput.readObject();
        s=s1;
        int k1=objectInput.readInt();
        j=k1;
    }
}
