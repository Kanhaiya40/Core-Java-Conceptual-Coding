package custom_executorservice;

public class ThreadPoolExecutor {

    public static void main(String[] args) {
        RunnableTask runnableTask = new RunnableTask();
        ThreadPool threadPool = new ThreadPool(5);
        for (int i = 0; i < 10; i++) {
            threadPool.submit(runnableTask);
        }
    }
}
