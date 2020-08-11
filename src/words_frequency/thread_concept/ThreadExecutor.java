package words_frequency.thread_concept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadExecutor {

    private final List<Thread> threads = new ArrayList<>();
    private final Map<String, Integer> wordFrequencies = new HashMap<>();
    private final List<String> lines;
    private final int sizeOfBuffer;

    public ThreadExecutor(List<String> lines, int sizeOfBuffer) {
        this.lines = lines;
        this.sizeOfBuffer = sizeOfBuffer;
    }

    public Map<String, Integer> calculateWordFrequency() throws InterruptedException {
        int i = 0;
        while (i != lines.size()) {
            List<String> buffer = new ArrayList<>();
            while (buffer.size() != sizeOfBuffer && i != lines.size()) {
                buffer.add(lines.get(i));
                i++;
            }
            Thread tempThread = new Thread(new MultipleThreadExecutor(buffer, wordFrequencies));
            tempThread.start();
            threads.add(tempThread);
            for (Thread thread : threads) {
                thread.join();
            }
        }
        return wordFrequencies;
    }
}
