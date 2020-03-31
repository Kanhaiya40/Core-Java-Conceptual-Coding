class DeadLock1
{
    synchronized  void deadLock1(DeadLock2 d)
    {
        System.out.println("Kanhaiya");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        d.condition1();

    }
    synchronized void condition2()
    {
        System.out.println("Sports");
    }
}
class DeadLock2
{
    synchronized  void deadLock2(DeadLock1 d)
    {
        System.out.println("Oxford");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        d.condition2();
    }
    synchronized void condition1()
    {
        System.out.println("University");
    }
}
class DeadLock extends Thread{
    DeadLock1 d1=new DeadLock1();
    DeadLock2 d2=new DeadLock2();
    public void Condition()
    {
        this.start();
        d1.deadLock1(d2);
    }
    public void run()
    {
        d2.deadLock2(d1);
    }
}


public class DeadLockCondition {
    public static void main(String[] args) {
        DeadLock d4=new DeadLock();
        d4.Condition();
    }
}
