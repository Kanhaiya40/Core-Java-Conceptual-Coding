import java.util.concurrent.*;

class  Executor extends Thread
{
    String name;
    Executor(String name)
    {
        super(name);
    }
    @Override
    public void run() {

            System.out.println("hi");
            System.out.println(Thread.currentThread().getName()+"...."+name);

    }
}
public class ExecutorFrameWorkByExtendingThreadClass {
    public static void main(String[] args) {

        Executor[] execute = {
                new Executor("Kanhaiya"),
                new Executor("Ramesh"),
                new Executor("Suresh"),
                new Executor("Jayesh"),
                new Executor("Ramya"),
                new Executor("Klyani")
        };


        ExecutorService sevice=Executors.newFixedThreadPool(3);
        ExecutorService service1=Executors.newFixedThreadPool(2);
        for (Executor exe:execute
             ) {

            sevice.submit(exe);
            service1.execute(exe);


        }
        sevice.shutdown();
        service1.shutdown();
    }

}
