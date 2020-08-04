package words_frequency.thread_concept;

import words_frequency.WordParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ThreadExecutor {

    public static void main(String[] args) throws IOException {
        List<String> buffer = new ArrayList<>();
        int sizeOfBuffer = 2;
        WordParser wordParser = new WordParser();
        Stream<String> lines = wordParser.parse();
        Map<String, Integer> wordFrequency = new HashMap<>();
        lines.forEach(eachLine -> {
                if (buffer.size() >= sizeOfBuffer) {
                    new Thread(new MultipleThreadExecutor(buffer, wordFrequency)).start();
                    buffer.clear();
                }
                buffer.add(eachLine);
        });
        synchronized (wordFrequency) {
            System.out.println(wordFrequency);
        }
    }
}
