class SynchronizedBlock1
{
    public void anyMethod(String name)
    {

        ;;;;;;;// Lakh lines of codes
        synchronized (SynchronizedBlock1.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(name);
            }
        }
    }
}
class SynchronizedBlock2 extends Thread{
    SynchronizedBlock1 s;
    String name;
    SynchronizedBlock2(SynchronizedBlock1 s,String name)
    {
        this.s=s;
        this.name=name;
    }
    @Override
    public void run() {
        s.anyMethod(name);
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
public class SyschronizedBlock {
    public static void main(String[] args) {
        SynchronizedBlock1 s1=new SynchronizedBlock1();
        SynchronizedBlock2 s2=new SynchronizedBlock2(s1,"Kanhaiya");
        SynchronizedBlock2 s3=new SynchronizedBlock2(s1,"Katorita");
        s2.start();
        s3.start();
    }
}
/*
1. synchronized(SynchronizedBlock1.class)-----providing class Class level lock to corresponding Thread.
2. synchronized(this)-------providing lock for current Object.
3. sychronized(s)---------providing Lock to any specific object s.
 */