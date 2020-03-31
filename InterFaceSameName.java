interface Same1
{
    public int sum();

}
interface Same2
{
    public int sum();
}
class Same implements Same1,Same2
{
    public int sum()
    {
        int sum=0;
        for (int i = 0; i <10 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        return sum;

    }

}




public class InterFaceSameName {
    public static void main(String[] args)
    {
        Same s1=new Same();
        s1.sum();
    }
}
