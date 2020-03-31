class Approach2 implements Runnable{
    @Override
    public void run() {
        int sum=0;
        for (int i = 0; i < 10 ; i++)
            {
                try {
                    sum+=i;
                }
                catch(ArithmeticException e)
                {
                    System.out.println(e);
                }
            }
            System.out.println(sum);
        }
    }


public class DefiningAThreadByImplementingRunnableInterface {
    public static void main(String[] args) {
        int multi = 1;
        Approach2 a2 = new Approach2();
        Thread t1 = new Thread(a2);
        t1.start();
        System.out.println("Sum of first 10 no. is:");
        for (int i = 1; i < 10; i++) {
            try {
                multi *= i;
                Thread.sleep(2000);
            } catch (ArithmeticException | InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Multiple of first 10 no. is:");
        System.out.println(multi);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Good Morning");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    System.out.println("Narendra");
                }

            }
        };
        Thread t2 = new Thread(r);
        t2.start();
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    System.out.println("Kanhaiya");
                }
            }
        };
        Thread t3=new Thread(r2);
        t3.start();


    }
}
