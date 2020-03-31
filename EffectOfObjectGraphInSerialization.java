import java.io.*;

public class EffectOfObjectGraphInSerialization {
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        InSerial i1=new InSerial();
        FileOutputStream fos=new FileOutputStream("Serialization2");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(i1);
        FileInputStream fis=new FileInputStream("Serialization2");
        ObjectInputStream ois=new ObjectInputStream(fis);
        InSerial i2=(InSerial) ois.readObject();
        System.out.println(i2.o+"\t"+i2.p);
        System.out.println(i2.g.n+"\t"+i2.g.m);
        System.out.println(i2.g.o1.k+"\t"+i2.g.o1.l);
        System.out.println(i2.g.o1.e.i+"\t"+i2.g.o1.e.j);
    }
}
class Effect implements Serializable
{
    int i=10;
    int j=11;
}
class Object1 implements Serializable
{
    Effect e=new Effect();
    int k=12;
    transient int l=13;

}
class Graph implements Serializable
{
    Object1 o1=new Object1();
    int n=14;
    transient int m=15;
}
class InSerial implements Serializable
{
    Graph g=new Graph();
    int o=16;
    int p=17;
}
