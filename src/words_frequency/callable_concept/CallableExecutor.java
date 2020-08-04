package words_frequency.callable_concept;

import words_frequency.WordParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;

public class CallableExecutor {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        FutureTask<Map<String, Integer>> futureTask = null;
        List<String> buffer = new ArrayList<>();
        int sizeOfBuffer = 2;
        WordParser wordParser = new WordParser();
        Stream<String> lines = wordParser.parse();
        Map<String, Integer> wordFrequency = new HashMap<>();
        lines.forEach(eachLine -> {
            if (buffer.size() >= sizeOfBuffer) {
                new Thread(new FutureTask<>(new MultipleThreadExecutor(buffer, wordFrequency))).start();
                buffer.clear();
            }
            buffer.add(eachLine);
        });
    }
}
