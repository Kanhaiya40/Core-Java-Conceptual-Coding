package custom_executorservice;

import java.util.LinkedList;

public class TaskExecutor implements Runnable {

    private final LinkedList<Runnable> linkedList;

    TaskExecutor(LinkedList<Runnable> linkedList) {
        this.linkedList = linkedList;
    }

    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        Runnable task = null;
        while (true) {
            synchronized (linkedList) {
                while (linkedList.isEmpty()) {
                    try {
                        linkedList.wait();
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    task = linkedList.poll();
                }
                try {
                    if( task != null) {
                        task.run();
                    }
                }catch (RuntimeException runtimeException){
                    runtimeException.printStackTrace();
                }
            }
        }
    }
}
