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
            for (int i=0;i<buffer.size();i++) {
                String[] words = buffer.get(i).split(" ");
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
