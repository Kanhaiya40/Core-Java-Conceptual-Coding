package words_frequency.callable_concept;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class MultipleThreadExecutor implements Callable<Map<String, Integer>> {
    private final List<String> buffer;
    private final Map<String, Integer> wordFrequency;

    MultipleThreadExecutor(List<String> buffer, Map<String, Integer> wordFrequency) {
        this.buffer = buffer;
        this.wordFrequency = wordFrequency;
    }


    @Override
    public Map<String, Integer> call() {
        for (String s : buffer) {
            String[] words = s.split(" ");
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
        return wordFrequency;
    }
}
