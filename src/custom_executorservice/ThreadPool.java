package custom_executorservice;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPool implements ExecutorService {

    static boolean flag;
    private final LinkedList<Runnable> linkedList;

    ThreadPool(int capacity) {
        TaskExecutor[] taskExecutor = new TaskExecutor[capacity];
        linkedList = new LinkedList<>();
        flag = false;
        for (int i = 0; i < capacity; i++) {
            taskExecutor[i] = new TaskExecutor(linkedList);
            Thread thread = new Thread(taskExecutor[i]);
            thread.start();
        }
    }

    @Override
    public void shutdown() {
        flag = true;
    }

    @Override
    public List<Runnable> shutdownNow() {
        return null;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long l, TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    @Override
    public <T> Future<T> submit(Callable<T> callable) {
        FutureTask<T> futureTask = new FutureTask<>(callable);
        execute((Runnable) callable);
        return futureTask;
    }


    @Override
    public <T> Future<T> submit(Runnable runnable, T t) {
        FutureTask<T> futureTask = new FutureTask<>(runnable, t);
        execute(runnable);
        return futureTask;
    }

    @Override
    public Future<?> submit(Runnable runnable) {
        FutureTask<Object> futureTask = new FutureTask<>(runnable, null);
        execute(futureTask);
        return futureTask;
    }


    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return null;
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long l, TimeUnit timeUnit) throws InterruptedException {
        return null;
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long l, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    @Override
    public void execute(Runnable runnableTask) {
            synchronized (linkedList) {
                    linkedList.add(runnableTask);
                    linkedList.notify();
        }
    }
}
