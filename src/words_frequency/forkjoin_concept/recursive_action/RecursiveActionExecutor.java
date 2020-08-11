package words_frequency.forkjoin_concept.recursive_action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;

public class RecursiveActionExecutor {

    private final List<String> lines;

    RecursiveActionExecutor(List<String> lines) {
        this.lines = lines;
    }

    public Map<String, Integer> calculateWordFrequencies() {
        Map<String, Integer> wordFrequencies = new HashMap<>();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        RecursiveActionWorker task = new RecursiveActionWorker(lines, wordFrequencies);
        forkJoinPool.invoke(task);
        return wordFrequencies;
    }
}
