package words_frequency.threadpoool_concept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor {

    private final Map<String, Integer> wordFrequency = new HashMap<>();
    private final List<String> lines;
    private final int sizeOfBuffer;

    public ThreadPoolExecutor(List<String> lines, int sizeOfBuffer) {
        this.lines = lines;
        this.sizeOfBuffer = sizeOfBuffer;
    }

    public Map<String, Integer> calculateFrequency() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        int i = 0;
            while (i != lines.size()) {
                List<String> buffer = new ArrayList<>();
                while (buffer.size() != sizeOfBuffer && i != lines.size()) {
                    buffer.add(lines.get(i));
                    i++;
                }
                executorService.execute(new MultiThreadExecutor(buffer, wordFrequency));
        }
        executorService.shutdown();
        return wordFrequency;
    }
}
