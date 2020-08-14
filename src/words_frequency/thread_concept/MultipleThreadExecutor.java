package words_frequency.thread_concept;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleThreadExecutor extends Thread {
    private final List<String> buffer;
    private final Map<String,Integer> duplicateFrequencies=new HashMap<>();
    private final Map<String, Integer> wordFrequencies;

    MultipleThreadExecutor(List<String> buffer, Map<String, Integer> wordFrequencies) {
       this.buffer=buffer;
        this.wordFrequencies = wordFrequencies;
    }

    @Override
    public void run() {
        for (String s : buffer) {
            String[] words = s.split(" ");
            for (String word : words) {
                synchronized (duplicateFrequencies) {
                    if (duplicateFrequencies.containsKey(word)) {
                        duplicateFrequencies.put(word, duplicateFrequencies.get(word) + 1);
                    } else {
                        duplicateFrequencies.put(word, 1);
                    }
                }
            }
        }
        synchronized (wordFrequencies){
            for (String word:duplicateFrequencies.keySet()) {
                if (wordFrequencies.containsKey(word)){
                    wordFrequencies.put(word,wordFrequencies.get(word)+duplicateFrequencies.get(word));
                }
                else {
                    wordFrequencies.put(word,1);
                }
            }
        }
    }
}
