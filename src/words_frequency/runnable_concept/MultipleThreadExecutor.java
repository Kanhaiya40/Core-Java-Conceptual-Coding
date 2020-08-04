package words_frequency.runnable_concept;

import java.util.List;
import java.util.Map;

public class MultipleThreadExecutor implements Runnable {
    private final List<String> lines;
    private final int startFrom;
    private final int lengthUpTo;
    private final Map<String, Integer> wordFrequency;

    MultipleThreadExecutor(List<String> lines, int startFrom, int lengthUpTo, Map<String, Integer> wordFrequency) {
        this.lines = lines;
        this.startFrom = startFrom;
        this.lengthUpTo = lengthUpTo;
        this.wordFrequency = wordFrequency;
    }

    @Override
    public void run() {
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
    }
}
