package words_frequency.sequential_concept;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCalculator {
    private final List<String> lines;

    WordFrequencyCalculator(List<String> lines) {
        this.lines = lines;
    }

    public Map<String, Integer> wordVsCount() {
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String eachLine : lines) {
            String[] words = eachLine.split(" ");
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
