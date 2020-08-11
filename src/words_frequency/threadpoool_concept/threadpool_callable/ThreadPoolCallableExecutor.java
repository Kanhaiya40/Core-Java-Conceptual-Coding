package words_frequency.threadpoool_concept.threadpool_callable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class ThreadPoolCallableExecutor {

    private final List<String> lines;
    private final int sizeOfBuffer;
    private final List<FutureTask<Map<String, Integer>>> futureTasks = new ArrayList<>();

    public ThreadPoolCallableExecutor(List<String> lines, int sizeOfBuffer) {
        this.lines = lines;
        this.sizeOfBuffer = sizeOfBuffer;
    }

    public Map<String, Integer> calculateFrequency() throws ExecutionException, InterruptedException {
        FutureTask<Map<String, Integer>> futureTask;
        ExecutorService executorService = Executors.newCachedThreadPool();
        int i = 0;
        while (i != lines.size()) {
            List<String> buffer = new ArrayList<>();
            while (buffer.size() != sizeOfBuffer && i != lines.size()) {
                buffer.add(lines.get(i));
                i++;
            }
            Callable<Map<String, Integer>> callable = new MultipleThreadCallableExecutor(buffer);
            futureTask = new FutureTask<>(callable);
            futureTasks.add(futureTask);
            executorService.submit(futureTask);
        }
        executorService.shutdown();
        return getCount();
    }

    private Map<String,Integer> getCount() throws ExecutionException, InterruptedException {
        Map<String,Integer> wordFrequencies=new HashMap<>();
        for (FutureTask<Map<String, Integer>> futureTask : futureTasks) {
            Map<String, Integer> word = futureTask.get();
            for (String key : word.keySet()) {
                if (wordFrequencies.containsKey(key)) {
                    wordFrequencies.put(key, wordFrequencies.get(key) + word.get(key));
                } else {
                    wordFrequencies.put(key, word.get(key));
                }
            }
        }
        return wordFrequencies;
    }
}
