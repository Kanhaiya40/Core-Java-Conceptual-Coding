
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

class Try3
{

    String game;
    static ReentrantLock l=new ReentrantLock();

    public void play(String game)
    {
        do {
            try {
                if (l.tryLock(500, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + "You are Playing now");

                    Thread.sleep(2000);


                } else {
                    System.out.println(Thread.currentThread().getName() + "...unable to get Lock");

                }
            }
                catch(InterruptedException e){
                    System.out.println(e);

                }
            }while (true);

        }


    }
class  Try4 extends Thread{
    Try3 r;
    String game;
    String name;
    Try4(String name,Try3 r,String game)
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
public class TryLockMethodWithTimePeriod {
    public static void main(String[] args) {
        Try3 t1=new Try3();
        Try4 t2=new Try4("First",t1,"Football");
        Try4 t3=new Try4("Second",t1,"Cricket");
        t2.start();
        t3.start();
    }
}
