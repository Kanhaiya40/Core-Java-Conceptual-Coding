package words_frequency.forkjoin_concept.recursive_action;

import java.util.List;
import java.util.Map;
import java.util.concurrent.RecursiveAction;

public class RecursiveActionWorker extends RecursiveAction {

    private final List<String> lines;
    private final Map<String, Integer> wordFrequencies;

    RecursiveActionWorker(List<String> lines, Map<String, Integer> wordFrequencies) {
        this.lines = lines;
        this.wordFrequencies = wordFrequencies;
    }

    @Override
    protected void compute() {
        int sizeOfBuffer = 100;
            if (lines.size() <= sizeOfBuffer) {
                for (String eachLine : lines) {
                    String[] words = eachLine.split(" ");
                    synchronized (wordFrequencies) {
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
                RecursiveActionWorker firstDivisionTask = new RecursiveActionWorker(lines.subList(0, divisionPoint), wordFrequencies);
                RecursiveActionWorker secondDivisionTask = new RecursiveActionWorker(lines.subList(divisionPoint, lines.size()), wordFrequencies);
                firstDivisionTask.fork();
                secondDivisionTask.compute();
                firstDivisionTask.join();
            }
        }
}
