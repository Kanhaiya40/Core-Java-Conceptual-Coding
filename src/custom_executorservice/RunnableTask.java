package custom_executorservice;

public class RunnableTask implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
