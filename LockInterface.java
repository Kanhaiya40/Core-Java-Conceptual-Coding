import java.util.concurrent.locks.*;
class Reentrant1
{
    String game;
    ReentrantLock r=new ReentrantLock();
    public void play(String game)
    {
        r.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(game);
        }
        r.unlock();
    }

}
class Reentrant2 extends  Thread{
    Reentrant1 l;
    String game;
    Reentrant2(Reentrant1 l,String game)
    {
        this.l=l;
        this.game=game;
    }

    @Override
    public void run() {
        l.play(game);
    }
}



public class LockInterface {
    public static void main(String[] args) {


        Reentrant1 l = new Reentrant1();
        Reentrant2 r2 = new Reentrant2(l, "Football");
        Reentrant2 r3 = new Reentrant2(l, "Cricket");
        r2.start();
        r3.start();

    }

}
