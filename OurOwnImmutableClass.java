public class OurOwnImmutableClass {
    public static void main(String[] args) {
        Immutable i1=new Immutable(100);
        Immutable i2=new Immutable(10);
        Immutable i3=(Immutable) i1.modify(100);
        System.out.println(i1==i2);
        System.out.println(i1==i3);
        System.out.println(i2==i3);
        Immutable i5=(Immutable)i2.modify(27);
        System.out.println(i5==i2);

    }
}
class Immutable
{
    private int i;
    Immutable(int i)
    {
        this.i=i;
    }
    public Object  modify(int i)
    {
        if (this.i==i)
        {
            return this;

        }
        else
        {
            return (new Immutable(i));
        }
    }
}
