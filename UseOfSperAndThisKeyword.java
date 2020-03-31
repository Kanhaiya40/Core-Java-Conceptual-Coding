
class This
{
    int x=777;
    This()
    {
        System.out.println(this.x);
    }
}
class Super extends This
{
    Super()
    {
        super();
        System.out.println(super.x);
    }
}
public class UseOfSperAndThisKeyword {
    public static void main(String[] args) {
        Super s1=new Super();
        This t1=new This();


    }
}
