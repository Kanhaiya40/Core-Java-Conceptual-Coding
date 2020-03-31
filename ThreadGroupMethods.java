class Thread21 extends  Thread{


    Thread21(ThreadGroup t1,String name)
    {
        super(t1,name);
    }
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Hi");
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {
                System.out.println("SomeOne Interrpted Me");
            }
            System.out.println("Kanhiaya");
        }
    }
}

public class ThreadGroupMethods {
    public static void main(String[] args) {
        ThreadGroup t1=new ThreadGroup("First");
        ThreadGroup[] t6=new  ThreadGroup[2];
        Thread []t3=new Thread[3];
        System.out.println(t1.getName());
        System.out.println(t1.getMaxPriority());
        t1.setMaxPriority(10);
        System.out.println(t1.getMaxPriority());
        System.out.println(t1.getParent().getName());
        t1.list();
        System.out.println(t1.activeCount());
        Thread t2=new Thread(t1,"Thread1");
        t2.start();
        System.out.println(t1.activeCount());
        System.out.println(t1.enumerate(t3));
        System.out.println(t3[0].getName());
        ThreadGroup t4=new ThreadGroup(t1,"Second");
        ThreadGroup t5=new ThreadGroup(t1,"Third");
        System.out.println(t1.enumerate(t6));
        for (ThreadGroup t7: t6) {
            System.out.println(t7.getName());

        }
        System.out.println(t1.isDaemon());
        t1.setDaemon(false);
        Thread21 t8=new Thread21(t1,"New Thread");
        t8.start();
        t1.interrupt();
        t1.destroy();
        t1.list();




    }
}
