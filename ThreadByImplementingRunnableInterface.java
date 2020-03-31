class Thread2 implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("["+i+"]\tGood Morning");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Kanhaiya");
        }
    }
}






public class ThreadByImplementingRunnableInterface {
    public static void main(String[] args) {
        Thread2 t2=new Thread2();
        Thread t1=new Thread(t2);
        t1.start();
    }
}
