import java.util.concurrent.*;
import java.lang.Exception;

class Call implements Callable
{
    int n;
    Call(int n)
    {
        this.n=n;
    }
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"sum of First "+n+"Numbers");
        int sum=0;
        for (int i = 0; i <n ; i++) {

            sum+=i;

        }

        return  sum;

    }
}
public class ExecutorFrameworkByImplementingCallableInterface {
    public static void main(String[] args)  throws Exception {
        Call[] c1={
                new Call(10),
                new Call(12),
                new Call(15),
                new Call(18),
                new Call(20),
                new Call(25),
                new Call(100)

        };
        ExecutorService service= Executors.newFixedThreadPool(3);
        for (Call c2:c1
             ) {

            Future f=service.submit(c2);
            try {
                System.out.println(f.get());
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }

        }
        service.shutdown();
    }
}
