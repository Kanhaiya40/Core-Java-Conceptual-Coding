package words_frequency.threadpoool_concept.threadpool_runable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolRunnableExecutor {

    private final List<String> lines;
    private final int sizeOfBuffer;

    public ThreadPoolRunnableExecutor(List<String> lines, int sizeOfBuffer) {
        this.lines = lines;
        this.sizeOfBuffer = sizeOfBuffer;
    }

    public Map<String, Integer> calculateFrequency() {
        Map<String, Integer> wordFrequencies = new HashMap<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        int i = 0;
        while (i != lines.size()) {
            List<String> buffer = new ArrayList<>();
            while (buffer.size() != sizeOfBuffer && i != lines.size()) {
                buffer.add(lines.get(i));
                i++;
            }
            executorService.execute(new MultipleThreadRunnableExecutor(buffer, wordFrequencies));
        }
        executorService.shutdown();
        return wordFrequencies;
    }
}
