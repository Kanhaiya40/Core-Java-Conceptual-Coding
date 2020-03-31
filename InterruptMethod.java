class Interrupt1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("I got Interruption");
            }
            System.out.println("Kanhaiya");
        }
    }
}
    public class InterruptMethod {
        public static void main(String[] args) {
            Interrupt1 i1 = new Interrupt1();
            i1.start();
            i1.interrupt();
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Assfaque");

            }
        }
    }





