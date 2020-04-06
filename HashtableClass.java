import java.util.HashMap;
import java.util.Hashtable;

public class HashtableClass {
    public static void main(String[] args) {
        Hashtable h1=new Hashtable();
        Hash h2=new Hash(4);
        Hash h3=new Hash(7);
        Hash h4=new Hash(8);
        Hash h5=new Hash(9);
        Hash h6=new Hash(10);
        Hash h7=new Hash(3);
        Hash h8=new Hash(5);
        Hash h9=new Hash(7);
        Hash h10=new Hash(4);
        Hash h11=new Hash(7);
        h1.put(h2,'A');
        h1.put(h3,'B');
        h1.put(h4,'C');
        h1.put(h5,'D');
        h1.put(h6,'E');
        h1.put(h7,'F');
        h1.put(h8,'G');
        h1.put(h9,'H');
        h1.put(h10,'I');
        h1.put(h11,'J');
        System.out.println(h1);
    }
}
class Hash
{
    private int i;
    public Hash(int i)
    {
        this.i=i;
    }

    @Override
    public String toString() {
        return i+" ";
    }

    @Override
    public int hashCode() {
        //return i;
        return i%9;//By default it is i%11 means it depends on intial capacity
    }
}
