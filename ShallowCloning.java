public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Shallow s=new Shallow(20);
        ShallClone s1=new ShallClone(s,10);
        ShallClone s2=(ShallClone) s1.clone();
        s2.s.j=12;
        s2.i=14;
        System.out.println(s1.s.j+"\t"+s1.i);
        System.out.println(s2.s.j+"\t"+s2.i);


    }
}
class Shallow
{
    int j=10;
    Shallow(int j)
    {
        this.j=j;
    }
}
class ShallClone implements Cloneable
{
    Shallow s;
    int i;
    ShallClone(Shallow s,int i)
    {
        this.s=s;
        this.i=i;

    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

