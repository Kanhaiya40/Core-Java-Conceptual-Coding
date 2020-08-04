package words_frequency;

public class Rough extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello Kanhaiya");
        }
    }

    public static void main(String[] args) {
        Rough rough=new Rough();
        Thread thread=new Thread(rough);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello Ram");
        }
    }
}
