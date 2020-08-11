package words_frequency.threadpoool_concept.threadpool_runable;

import java.util.List;
import java.util.Map;

public class MultipleThreadRunnableExecutor implements Runnable {

    private final List<String> buffer;
    private final Map<String, Integer> wordFrequencies;


    MultipleThreadRunnableExecutor(List<String> buffer, Map<String, Integer> wordFrequency) {
        this.buffer = buffer;
        this.wordFrequencies = wordFrequency;
    }

    @Override
    public void run() {
        for (String eachLine : buffer) {
            String[] words = eachLine.split("[,.;?()\\s]+");
            for (String word : words) {
                synchronized (wordFrequencies) {
                    if (wordFrequencies.containsKey(word)) {
                        wordFrequencies.put(word, wordFrequencies.get(word) + 1);
                    } else {
                        wordFrequencies.put(word, 1);
                    }
                }
            }
        }
    }
}
