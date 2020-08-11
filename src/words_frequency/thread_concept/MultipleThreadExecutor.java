package words_frequency.thread_concept;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleThreadExecutor extends Thread {

    private final List<String> buffer;
    private final Map<String, Integer> duplicateWordFrequencies = new HashMap<>();
    private final Map<String, Integer> wordFrequencies;

    MultipleThreadExecutor(List<String> buffer, Map<String, Integer> wordFrequencies) {
        this.buffer = buffer;
        this.wordFrequencies = wordFrequencies;
    }

    @Override
    public void run() {
        for (String eachLine : buffer) {
            String[] words = eachLine.split("[,.;?()\\s]+");
            for (String word : words) {
                if (duplicateWordFrequencies.containsKey(word)) {
                    duplicateWordFrequencies.put(word, duplicateWordFrequencies.get(word) + 1);
                } else {
                    duplicateWordFrequencies.put(word, 1);
                }
            }
        }
        synchronized (wordFrequencies) {
            for (String word : duplicateWordFrequencies.keySet()) {
                if (wordFrequencies.containsKey(word)) {
                    wordFrequencies.put(word, wordFrequencies.get(word) + duplicateWordFrequencies.get(word));
                } else {
                    wordFrequencies.put(word, duplicateWordFrequencies.get(word));
                }
            }
        }
    }
}
