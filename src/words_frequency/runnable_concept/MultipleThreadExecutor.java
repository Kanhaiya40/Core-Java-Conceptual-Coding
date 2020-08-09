package words_frequency.runnable_concept;

import java.util.List;
import java.util.Map;

public class MultipleThreadExecutor implements Runnable {
    private final List<String> buffer;
    private final Map<String, Integer> wordFrequency;

    public MultipleThreadExecutor(List<String> buffer, Map<String, Integer> wordFrequency) {
        this.buffer = buffer;
        this.wordFrequency = wordFrequency;
    }

    @Override
    public void run() {
        for (String s : buffer) {
            String[] words = s.split(" ");
            for (String word : words) {
                if (wordFrequency.containsKey(word)) {
                    wordFrequency.put(word, wordFrequency.get(word) + 1);
                } else {
                    wordFrequency.put(word, 1);
                }
            }
        }
    }
}
