package words_frequency.callable_concept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExecutor {
    private final List<Thread> threads = new ArrayList<>();
    private final List<String> lines;
    private final int sizeOfBuffer;
    private final List<FutureTask<Map<String, Integer>>> futureTasks = new ArrayList<>();

    public CallableExecutor(List<String> lines, int sizeOfBuffer) {
        this.lines = lines;
        this.sizeOfBuffer = sizeOfBuffer;
    }

    public Map<String,Integer> calculateWordFrequency() throws InterruptedException, ExecutionException {
        FutureTask<Map<String, Integer>> futureTask;
        int i = 0;
        while (i != lines.size()) {
            List<String> buffer = new ArrayList<>();
            while (buffer.size() != sizeOfBuffer && i != lines.size()) {
                buffer.add(lines.get(i));
                i++;
            }
            Callable<Map<String, Integer>> callable = new MultipleThreadExecutor(buffer);
            futureTask = new FutureTask<>(callable);
            futureTasks.add(futureTask);
            Thread tempThread = new Thread(futureTask);
            tempThread.start();
            threads.add(tempThread);
            for (Thread thread : threads
            ) {
                thread.join();
            }
        }
        return getCount();
    }

    public Map<String, Integer> getCount() throws ExecutionException, InterruptedException {
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (FutureTask<Map<String, Integer>> futureTask : futureTasks) {
            Map<String, Integer> word = futureTask.get();
            for (String key : word.keySet()) {
                if (wordFrequency.containsKey(key)) {
                    wordFrequency.put(key, wordFrequency.get(key) + word.get(key));
                } else {
                    wordFrequency.put(key, word.get(key));
                }
            }
        }
        return wordFrequency;
    }
}

