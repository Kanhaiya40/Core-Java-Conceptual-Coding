interface  Intra1
{
    void sumFirst();
    public static final int x=10;
    public static final int t=5;
}
interface Intra2
{
    void multipleFirst();
    public static final int y=15;
    public static final int t=10;

}
interface  Inter extends Intra1,Intra2
{
    void printFirst();
    public static final int z=x+y;
}
class Interface implements Inter
{
    public void printFirst()
    {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

    }

 public void printVar()
 {
     System.out.print(z);
     System.out.println(Intra1.t);
     System.out.println(Intra2.t);
 }
    @Override
    public void sumFirst() {
        int sum=0;

        for (int  i = 0; i <10; i++) {
            sum+=i;
            System.out.println(i+"..."+sum);
        }

    }

    @Override
    public void multipleFirst() {
        int multiple=1;
        for (int i = 1; i < 5; i++) {
            multiple*=i;
            System.out.println(i+"..."+multiple);
        }
    }
}

public class InterFace1 {
    public static void main(String[] args) {
        Interface I1=new Interface();
        System.out.println("No. from");
        I1.printFirst();
        System.out.println("sum of First 10");
        I1.sumFirst();
        System.out.println("multiple of First 5 nos.");
        I1.multipleFirst();
        I1.printVar();
    }
}
