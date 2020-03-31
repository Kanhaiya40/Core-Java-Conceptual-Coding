class Synchronized
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
class Synchronized3 extends Thread{
    Synchronized s;
    String news;
    Synchronized3(Synchronized s,String news)
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
public class Synchronization {
    public static void main(String[] args) {
        Synchronized s=new Synchronized();
        Synchronized3 s1=new Synchronized3(s,"BBC news");
        Synchronized3 s2=new Synchronized3(s,"BBA news");
        s1.start();
        s2.start();
    }
}
