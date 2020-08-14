package words_frequency.callable_concept;


import words_frequency.runnable_concept.MultipleThreadExecutor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class CallableExecutor {

    private final List<String> lines;
    private final int sizeOfBuffer;
    private final List<Thread> threads=new ArrayList<>();

    CallableExecutor(List<String> lines, int sizeOfBuffer) {
        this.lines = lines;
        this.sizeOfBuffer = sizeOfBuffer;
    }

    public Map<String, Integer> calculateFrequency() throws InterruptedException {
        Map<String, Integer> wordFrequencies = new HashMap<>();
        Future<Map<String,Integer>> futureTask;
        int i = 0;
        while (i != lines.size()) {
            List<String> buffer = new ArrayList<>();
            while (buffer.size() != sizeOfBuffer && i != lines.size()) {
                buffer.add(lines.get(i));
                i++;
            }
            Callable<Map<String,Integer>> callable=new words_frequency.callable_concept.MultipleThreadExecutor(buffer);
            Thread thread = new Thread(new MultipleThreadExecutor(buffer, wordFrequencies));
            thread.start();

        }
        for (Thread thread : threads) {
            thread.join();
        }
        return wordFrequencies;
    }
}
