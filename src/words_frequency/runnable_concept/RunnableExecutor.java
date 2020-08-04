package words_frequency.runnable_concept;

import words_frequency.WordParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RunnableExecutor {

    public static void main(String[] args) throws IOException {
        WordParser wordParser = new WordParser("/home/shubh/Desktop/rough.txt");
        List<String> lines = wordParser.getLines();
        int noOfThreads = 3;
        int startFrom = 0;
        int lengthUpTo = lines.size() / noOfThreads;
        int remainingLinesIndex = lines.size() % noOfThreads;
        Map<String, Integer> wordFrequency = new ConcurrentHashMap<>();
        for (int i = 0; i < noOfThreads; i++) {
            new Thread(new MultipleThreadExecutor(lines, startFrom, lengthUpTo, wordFrequency)).start();
            startFrom = startFrom + lengthUpTo;
        }
        if (remainingLinesIndex != 0) {
            for (int i = startFrom; i < lines.size(); i++) {
                String[] words = lines.get(startFrom).split(" ");
                for (String word : words) {
                    if (wordFrequency.containsKey(word)) {
                        wordFrequency.put(word, wordFrequency.get(word) + 1);
                    } else {
                        wordFrequency.put(word, 1);
                    }
                }
            }
        }
        System.out.println(wordFrequency);
    }
}
