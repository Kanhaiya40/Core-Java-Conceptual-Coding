class ThreadOverload1 extends Thread{
    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            System.out.println("Good Morning");
            try
            {
               Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Kanhaiya");
        }

    }
    public void run(int i)
    {

        for (int j = 0; j < 20; j++) {
            System.out.println("Good Morning");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Vikas");
        }


    }
}






public class ThreadOverLoading {
    public static void main(String[] args) {
        ThreadOverload1 t1=new ThreadOverload1();
        t1.start();
        t1.run(19);

    }

}
