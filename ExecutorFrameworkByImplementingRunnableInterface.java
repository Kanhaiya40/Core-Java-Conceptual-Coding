import java.util.concurrent.*;

class  Executor1 implements Runnable
{
    String name;
    Executor1(String name)
    {
        this.name=name;
    }
    @Override
    public void run() {

        System.out.println("hi");
        System.out.println(Thread.currentThread().getName()+"...."+name);

    }
}
public class ExecutorFrameworkByImplementingRunnableInterface {
    public static void main(String[] args) {

        Executor1[] execute = {
                new Executor1("Kanhaiya"),
                new Executor1("Ramesh"),
                new Executor1("Suresh"),
                new Executor1("Jayesh"),
                new Executor1("Ramya"),
                new Executor1("Klyani")
        };


        ExecutorService sevice=Executors.newFixedThreadPool(3);
        for (Executor1 exe:execute
        ) {

            sevice.submit(exe);
        }
        sevice.shutdown();

    }

}
