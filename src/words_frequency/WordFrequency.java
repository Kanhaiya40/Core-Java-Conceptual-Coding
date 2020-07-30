package words_frequency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WordFrequency {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadApproach threadApproach = new ThreadApproach();
        threadApproach.start();
        RunnableApproach runnableApproach = new RunnableApproach();
        Thread thread = new Thread(runnableApproach);
        thread.start();
        CallableApproach callableApproach = new CallableApproach();
        ExecutorService service = Executors.newFixedThreadPool(1);
        Future<Integer> future = service.submit(callableApproach);
        System.out.println(future.get());
    }
}
