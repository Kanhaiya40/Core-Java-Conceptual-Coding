interface Arg1
{
    public void multiple(int x);
}
interface Arg2
{
    public void multiple(float x);
}
class Argument implements Arg1,Arg2
{
    @Override
    public void multiple(int x) {
        int multiple=1;
        for (int i = 1; i <x ; i++) {
            multiple*=i;
        }
        System.out.println(multiple);

    }

    @Override
    public void multiple(float x) {
        int multiple=1;
        for (int i = 1; i <x ; i++) {
            multiple*=i;
        }
        System.out.println(multiple);

    }
}





public class InterFaceWithDiffrentArg {
    public static void main(String[] args) {
        Argument a1=new Argument();
        a1.multiple(10.3f);
        a1.multiple(10);

    }
}
