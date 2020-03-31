public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Deep d=new Deep(14,28);
        DeepClone d3=new DeepClone(10,d);
        DeepClone d4=(DeepClone) d3.clone();
        d4.d.j=90;
        d4.d.k=190;
        d4.i=67;
        System.out.println(d3.d.j+"\t"+d3.d.k+"\t"+d3.i);
        System.out.println(d4.d.j+"\t"+d4.d.k+"\t"+d4.i);
    }
}
class Deep
{
    int j=10;
    int k=17;
    Deep(int j,int k)
    {
        this.j=j;
        this.k=k;
    }
}
class DeepClone implements Cloneable
{
    int i;
    Deep d;
    DeepClone(int i,Deep d)
    {
        this.i=i;
        this.d=d;

    }
    public Object clone() throws CloneNotSupportedException
    {
        Deep d1=new Deep(d.j,d.k);
        DeepClone d2=new DeepClone(12,d1);
        return d2;
    }
}

