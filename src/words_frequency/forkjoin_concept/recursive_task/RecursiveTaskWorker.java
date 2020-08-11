package words_frequency.forkjoin_concept.recursive_task;

import java.util.List;
import java.util.Map;
import java.util.concurrent.RecursiveTask;

public class RecursiveTaskWorker extends RecursiveTask<Map<String, Integer>> {

    private final List<String> lines;
    private final Map<String, Integer> wordFrequencies;

    RecursiveTaskWorker(List<String> lines, Map<String, Integer> wordFrequencies) {
        this.lines = lines;
        this.wordFrequencies = wordFrequencies;
    }

    @Override
    protected Map<String, Integer> compute() {
        int sizeOfBuffer = 100;

        if (lines.size() <= sizeOfBuffer) {
            synchronized (wordFrequencies) {
                for (String eachLine : lines) {
                    String[] words = eachLine.split("[,.;?()\\s]+");
                    for (String word : words) {
                        if (wordFrequencies.containsKey(word)) {
                            wordFrequencies.put(word, wordFrequencies.get(word) + 1);
                        } else {
                            wordFrequencies.put(word, 1);
                        }
                    }
                }
            }
        } else {
            int divisionPoint = lines.size() / 2;
            RecursiveTaskWorker firstDivisionTask = new RecursiveTaskWorker(lines.subList(0, divisionPoint), wordFrequencies);
            RecursiveTaskWorker secondDivisionTask = new RecursiveTaskWorker(lines.subList(divisionPoint, lines.size()), wordFrequencies);
            firstDivisionTask.fork();
            secondDivisionTask.compute();
            firstDivisionTask.join();
        }
        return wordFrequencies;
    }
}
