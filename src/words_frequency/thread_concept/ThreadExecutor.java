package words_frequency.thread_concept;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadExecutor {
    private final List<String> lines;
    private final int sizeOfBuffer;
    private List<Thread> threads=new ArrayList<>();

    ThreadExecutor(List<String> lines, int sizeOfBuffer) {
        this.lines = lines;
        this.sizeOfBuffer = sizeOfBuffer;
    }

    public Map<String, Integer> calculateFrequency() throws InterruptedException {
        Map<String, Integer> wordFrequencies = new HashMap<>();
        int i = 0;
        while (i != lines.size()) {
            List<String> buffer = new ArrayList<>();
            while (buffer.size() != sizeOfBuffer && i != lines.size()) {
                buffer.add(lines.get(i));
                i++;
            }
            Thread thread = new Thread(new MultipleThreadExecutor(buffer, wordFrequencies));
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }
        return wordFrequencies;
    }
}
