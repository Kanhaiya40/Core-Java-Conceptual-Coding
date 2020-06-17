package oracledocumentation.chapter3;

public class MechanismOfSleepAndIntruptMethod {
    static String message;

    public static void main(String[] args) throws InterruptedException {
        Interrupt interrupt1 = new Interrupt();
        interrupt1.start();
        interrupt1.interrupt();
        message = "Mares do not eat oats.";
        Thread.sleep(500);
        System.out.println(message);

    }

    public static class Interrupt extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException interruptedException) {
                message = "Mares do eat oats.";
                System.out.println(message);
            }
        }
    }
}
