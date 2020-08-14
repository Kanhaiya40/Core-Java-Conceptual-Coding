package words_frequency.threadpoool_concept.threadpool_runable;

import words_frequency.LineParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ThreadPoolRunnableMainExecutor {

    public static void main(String[] args) throws IOException {
        String filePath="/home/kanhaiya/Desktop/samp.txt";
        LineParser lineParser = new LineParser(filePath);
        List<String> lines = lineParser.parse();
        int sizeOfBuffer = 100;
        ThreadPoolRunnableExecutor threadPoolExecutor = new ThreadPoolRunnableExecutor(lines, sizeOfBuffer);
        Map<String, Integer> wordFrequenciesThreadPool = threadPoolExecutor.calculateFrequency();
        System.out.println("ThreadPool Concept :" + wordFrequenciesThreadPool);

    }
}
