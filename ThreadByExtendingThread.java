class Thread1 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("["+i+"]\tGood Moring");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Dhoni");
        }
    }
}





public class ThreadByExtendingThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }

}
