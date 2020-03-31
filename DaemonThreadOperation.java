class Daemon1 extends Thread{
    @Override
    public void run() {
        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Step  \t["+i+"]");
            try
            {
                sum+=i;
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(sum);

        }
        System.out.println(Thread.currentThread().isDaemon());
    }
}
public class DaemonThreadOperation {
    public static void main(String[] args) {
        Daemon1 d1=new Daemon1();
        d1.setDaemon(true);
        d1.start();

    }
}


/*
1. If main thread is non-Daemon and child Thread is Daemon means whenever main Thread terminates Chid Thread also be Terminated
 */
