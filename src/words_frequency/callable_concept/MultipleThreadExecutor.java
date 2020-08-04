package words_frequency.callable_concept;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class MultipleThreadExecutor implements Callable<Map<String, Integer>> {
    private final List<String> lines;
    private final int startFrom;
    private final int lengthUpTo;

    MultipleThreadExecutor(List<String> lines, int startFrom, int lengthUpTo) {
        this.lines = lines;
        this.startFrom = startFrom;
        this.lengthUpTo = lengthUpTo;
    }


    @Override
    public Map<String, Integer> call() {
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (int i = startFrom; i < (startFrom + lengthUpTo); i++) {
            String[] words = lines.get(i).split(" ");
            for (String word : words) {
                if (wordFrequency.containsKey(word)) {
                    wordFrequency.put(word, wordFrequency.get(word) + 1);
                } else {
                    wordFrequency.put(word, 1);
                }
            }
        }
        return wordFrequency;
    }
}
