
class  Notify extends  Thread {
    int sum = 0;

    @Override
    public void run() {


        synchronized (this) {
            for (int i = 0; i <10; i++) {


                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                sum += i;
                System.out.println("Giving notification to  corresponding thread");
                try {
                    Thread.sleep(2000);
                    this.notify();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }


        }
    }
}
    public class InterThreadCommunication {
        public static void main(String[] args) {
          Notify n=new Notify();
            n.start();
            synchronized(n)
            {
                System.out.println("Waiting for notification ");
                try {

                    n.wait(500);
                }
                catch (InterruptedException e)
                {
                    System.out.println(e);
                }
                System.out.println("updating the value");
                System.out.println(n.sum);
            }

        }
    }
