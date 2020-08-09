package words_frequency;

import words_frequency.callable_concept.CallableExecutor;
import words_frequency.runnable_concept.RunnableExecutor;
import words_frequency.thread_concept.ThreadExecutor;
import words_frequency.threadpoool_concept.ThreadPoolExecutor;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class Task {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        String filePath = "/home/shubh/IdeaProjects/Java_Conceptual_code/resources/sample.txt";
        LineParser lineParser = new LineParser(filePath);
        List<String> lines = lineParser.parse();
        int sizeOfBuffer = 2;
        WordFrequencyCalculator wordFrequencyCalculator = new WordFrequencyCalculator(lines);
        Map<String, Integer> wordFrequencySequential = wordFrequencyCalculator.wordVsCount();
        System.out.println("Sequential Approach :" + wordFrequencySequential);
        ThreadExecutor threadExecutor = new ThreadExecutor(lines, sizeOfBuffer);
        Map<String, Integer> wordFrequency = threadExecutor.calculateWordFrequency();
        System.out.println("Thread Concept :" + wordFrequency);
        RunnableExecutor runnableExecutor = new RunnableExecutor(lines, sizeOfBuffer);
        Map<String, Integer> wordFrequencyRunnable = runnableExecutor.calculateWordFrequency();
        System.out.println("Runnable Concept :" + wordFrequencyRunnable);
        CallableExecutor callableExecutor = new CallableExecutor(lines, sizeOfBuffer);
        Map<String, Integer> wordFrequencyCallable = callableExecutor.getCount();
        System.out.println("Callable Concept :" + wordFrequencyCallable);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(lines, sizeOfBuffer);
        Map<String, Integer> wordFrequencyThreadPool = threadPoolExecutor.calculateFrequency();
        System.out.println("ThreadPool Concept :" + wordFrequencyThreadPool);
    }
}
