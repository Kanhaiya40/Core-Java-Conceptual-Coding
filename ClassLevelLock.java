class ClassLevel1
{
    String channel;
    public static  synchronized void tvShow(String channel)
{
    for (int i = 10; i >0 ; i--) {
        System.out.println(i+"This is channel \t ["+i+"]"+channel);
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println("This is Unvalid Channel");
        }
    }

}
public static synchronized void sportsPack(String channel)
{
    for (int i = 10; i >0 ; i--) {
        System.out.println(i+"This is SportsChanel\t["+i+"]"+channel);
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println("This is Not in your Sport Pack Channel");
        }
    }

}
}
class ClassLevel2 extends Thread
{
    ClassLevel1 c;
    String channel;
    ClassLevel2(ClassLevel1 c,String channel)
    {
        this.c=c;
        this.channel=channel;
    }

    @Override
    public void run() {
        c.tvShow(channel);
        for (int i = 0; i <10 ; i++) {

            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

        }
    }
}
class ClassLevel3 extends Thread
{
    ClassLevel1 c;
    String channel;
    ClassLevel3(ClassLevel1 c,String channel)
    {
        this.c=c;
        this.channel=channel;
    }

    @Override
    public void run() {
        c.sportsPack(channel);
        for (int i = 0; i <10 ; i++) {

            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

        }

    }
}








public class ClassLevelLock {


    public static void main(String[] args) {
         ClassLevel1 c=new ClassLevel1();
         ClassLevel2 c1=new ClassLevel2(c,"StarPlus");
        ClassLevel3 c2=new ClassLevel3(c,"StarSports");
         c1.start();
         c2.start();
    }





}
/*
1. Seems to be like Object lavel Lock but operating with static Synchronized Method thread needs class level Lock.
 */