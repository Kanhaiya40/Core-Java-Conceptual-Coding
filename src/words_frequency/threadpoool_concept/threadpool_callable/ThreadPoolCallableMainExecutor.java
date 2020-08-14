package words_frequency.threadpoool_concept.threadpool_callable;

import words_frequency.LineParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class ThreadPoolCallableMainExecutor {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        String filePath="/home/kanhaiya/Desktop/samp.txt";
        LineParser lineParser = new LineParser(filePath);
        List<String> lines = lineParser.parse();
        int sizeOfBuffer = 100;
        ThreadPoolCallableExecutor threadPoolExecutorCallable = new ThreadPoolCallableExecutor(lines, sizeOfBuffer);
        Map<String, Integer> wordFrequenciesThreadPoolCallable = threadPoolExecutorCallable.calculateFrequency();
        System.out.println("ThreadPoolCallable Concept :" + wordFrequenciesThreadPoolCallable);
    }
}
