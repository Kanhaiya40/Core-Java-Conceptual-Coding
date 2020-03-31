
import java.util.concurrent.locks.*;

class Try1
{

    String game;
    static ReentrantLock l=new ReentrantLock();

    public void play(String game) {
        for (int i = 0; i < 10; i++) {


            if (l.tryLock()) {
                System.out.println(Thread.currentThread().getName() + "You are Playing now");
                try {
                    Thread.sleep(2000);
                    System.out.println(game);
                } catch (InterruptedException e) {
                    System.out.println(e);

                }

                l.unlock();
            } else {
                System.out.println(Thread.currentThread().getName() + "...unable to get Lock");

            }

        }
    }



    }
class  Try2 extends Thread{
    Try1 r;
    String game;
    String name;
    Try2(String name,Try1 r,String game)
    {
        super(name);
        this.r=r;
        this.game=game;

    }

    @Override
    public void run() {

        r.play(game);
    }
}




public class TryLockMethod {

    public static void main(String[] args) {
        Try1 t1=new Try1();
        Try2 t2=new Try2("First",t1,"Football");
        Try2 t3=new Try2("Second",t1,"Cricket");
        t2.start();
        t3.start();
    }
}
