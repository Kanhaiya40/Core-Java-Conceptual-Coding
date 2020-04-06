import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomizeSortingInPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue p2 = new PriorityQueue(16,new Comaprator6(30));
        Comaprator6 c1 = new Comaprator6(1045);
        Comaprator6 c2 = new Comaprator6(5455);
        Comaprator6 c3 = new Comaprator6(7944);
        Comaprator6 c4 = new Comaprator6(3828);
        Comaprator6 c5 = new Comaprator6(2596);
        Comaprator6 c6 = new Comaprator6(6189);
        Comaprator6 c7 = new Comaprator6(8159);
        Comaprator6 c8 = new Comaprator6(1656);
        p2.offer(c1);
        p2.offer(c2);
        p2.offer(c3);
        p2.offer(c4);
        p2.offer(c5);
        p2.offer(c6);
        p2.offer(c7);
        System.out.println(p2);




    }


}
class Comaprator6 implements Comparator
{
    private int i;
    public Comaprator6(int i)
    {
        this.i=i;
    }

    @Override
    public String toString() {
        return i+" ";
    }

    @Override
    public int compare(Object o, Object t1) {
        Comaprator6 c1=(Comaprator6)o;
        Comaprator6 c2=(Comaprator6)t1;
        int i1=c1.i;
        int i2=this.i;
        if (i1<i2)
        {
            return +1;
        }
        else
            if (i1>i2)
            {
                return -1;
            }
            else
                return 0;
    }
}