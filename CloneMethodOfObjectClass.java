
class Clone1 implements Cloneable
{
    int i;
    int j;
    Clone1(int i,int j)
    {
        this.i=i;
        this.j=j;

    }
    public static void main(String[] args)  throws CloneNotSupportedException{
        Clone1 c1=new Clone1(10,20);
        Clone1 c2=(Clone1) c1.clone();
        System.out.println(c1.i+"\t"+c1.j);
        c1.i=20;
        c1.j=40;
        System.out.println(c1.i+"\t"+c1.j);
        c2.i=40;
        c2.j=50;
        System.out.println(c2.i+"\t"+c2.j);
        System.out.println(c1.i+"\t"+c1.j);

    }

}

