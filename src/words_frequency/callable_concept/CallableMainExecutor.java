package words_frequency.callable_concept;

import words_frequency.LineParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class CallableMainExecutor {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        String filePath="/home/kanhaiya/Desktop/samp.txt";
        LineParser lineParser = new LineParser(filePath);
        List<String> lines = lineParser.parse();
        int sizeOfBuffer = 100;
        CallableExecutor callableExecutor = new CallableExecutor(lines, sizeOfBuffer);
        Map<String, Integer> wordFrequenciesCallable = callableExecutor.calculateFrequency();
        System.out.println("Callable Concept :" + wordFrequenciesCallable);
    }
}
