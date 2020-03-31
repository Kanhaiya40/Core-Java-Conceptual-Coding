class Synchronized1
{
    public synchronized void updatedNews(String news)
    {
        for (int i = 1; i <10 ; i++) {
            System.out.println("News\t"+i+"\t"+news);
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {
                System.out.println("This is not a News!");
            }

        }

    }
}
class Synchronized2 extends Thread{
    Synchronized1 s;
    String news;
    Synchronized2(Synchronized1 s,String news)
    {
        this.s=s;
        this.news=news;
    }

    @Override
    public void run() {
        System.out.println("Today's Blog:");
        for (int i = 0; i <10 ; i++) {
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println("You are not in BLog Section");
            }

        }
        s.updatedNews(news);
    }
}
public class SynchronizationThreadOperatingOnDiffrentObject {
    public static void main(String[] args) {
        Synchronized1 s=new Synchronized1();
        Synchronized1 s3=new Synchronized1();
        Synchronized2 s1=new Synchronized2(s,"BBC news");
        Synchronized2 s2=new Synchronized2(s3,"BBA news");
        s1.start();
        s2.start();
    }
}
/*
1. If mutiple thread operating on single Object then Synchrinization is required.
 */