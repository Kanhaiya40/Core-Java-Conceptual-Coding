package words_frequency.threadpoool_concept;

import java.util.List;
import java.util.Map;

public class MultiThreadExecutor implements Runnable {
    private final List<String> buffer;
    private final Map<String, Integer> wordFrequency;

    MultiThreadExecutor(List<String> buffer, Map<String, Integer> wordFrequency) {
        this.buffer = buffer;
        this.wordFrequency = wordFrequency;
    }

    @Override
    public void run() {
        for (String s : buffer) {
            String[] words = s.split("[,.;?()\\s]+");
            for (String word : words) {
                synchronized (wordFrequency) {
                    if (wordFrequency.containsKey(word)) {
                        wordFrequency.put(word, wordFrequency.get(word) + 1);
                    } else {
                        wordFrequency.put(word, 1);
                    }
                }
            }
        }
    }
}
