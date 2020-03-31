class Thread4 extends  Thread
{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Good Morning");
    }
}
class Thread5 extends Thread
{
    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Kanhaiya");
    }
}











public class ThreadPriorities {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread4 t1=new Thread4();
        t1.setPriority(6);
        t1.start();
        Thread5 t2=new Thread5();
        t2.setPriority(8);
        t2.start();
    }


}
