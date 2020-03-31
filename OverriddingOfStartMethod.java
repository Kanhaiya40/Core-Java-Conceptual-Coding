
class StartMethod1 extends Thread{
    String name;
    String runname;
    StartMethod1(String name,String runname)
    {
        this.name=name;
        this.runname=runname;

    }
    public void start()
    {

        super.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("Good Morning");

            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(name);
        }

    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Good Morning");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(runname);
        }

    }
}








public class OverriddingOfStartMethod {
    public static void main(String[] args) {
        StartMethod1 s1=new StartMethod1("Kanhaiya","Kamal");
        s1.start();

    }
}
/*
1. Overriding of run Method is already done
   becoz Without Overridding of run Method thre is no impact of multiThreading Features.
2. Overriding of start Method will not inovke run method of Thread class start method.
 */