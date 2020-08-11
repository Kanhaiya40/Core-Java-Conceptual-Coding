package words_frequency.forkjoin_concept.recursive_task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;

public class RecursiveTaskExecutor {

    private final List<String> lines;

    RecursiveTaskExecutor(List<String> lines) {
        this.lines = lines;
    }

    public Map<String, Integer> calculateWordFrequency() {
        Map<String, Integer> wordFrequencies = new HashMap<>();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        RecursiveTaskWorker recursiveTaskWorker = new RecursiveTaskWorker(lines, wordFrequencies);
        return forkJoinPool.invoke(recursiveTaskWorker);
    }
}
