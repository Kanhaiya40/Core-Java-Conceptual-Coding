class Thread3 extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Sub-Thread");
        System.out.println(Thread.currentThread().getName());
    }


}

public class GettingAndSettingNameOfThread {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        System.out.println(Thread.currentThread().getName());
        t1.start();

    }

}
