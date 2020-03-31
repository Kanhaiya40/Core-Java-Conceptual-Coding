class ThreadLocal1 extends Thread{
    static Integer custId=0;
    private static ThreadLocal t1=new ThreadLocal()
    {
        @Override
        protected Object initialValue() {
            return ++custId;
        }

    };
    String name;
    ThreadLocal1(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"..."+t1.get());
    }
}




public class OverridingOfThreadLocal {
    public static void main(String[] args) {
        ThreadLocal1 t1=new ThreadLocal1("Kanhaiya");
        ThreadLocal1 t2=new ThreadLocal1("Asfaque");
        ThreadLocal1 t3=new ThreadLocal1("Narendra");
        ThreadLocal1 t4=new ThreadLocal1("Ansari");
        ThreadLocal1 t5=new ThreadLocal1("Modi");
        ThreadLocal1 t6=new ThreadLocal1("Maurya");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();


    }
}
