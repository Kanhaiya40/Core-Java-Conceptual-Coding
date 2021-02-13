package data_extraction.streaming_concept;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PurchaseEventStreamConcept {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/kanhaiya/Desktop/sample1.txt";
        Parser parser = new Parser(filePath);
        PrintWriter printWriter = new PrintWriter("/home/kanhaiya/Desktop/Spring/Java_Conceptual_code/resources/streamed_reports.txt");
        Stream<PurchaseEvent> purchaseEventStream = parser.parse();
        List<StreamReport> reports = new ArrayList<>();
        reports.add(new ItemIdVsAverageQuantityPerSession());
        reports.add(new ItemIdVsBuysCount());
        reports.add(new ItemIdVsNumberOfSessions());
        reports.add(new DayWiseReport());
        reports.add(new HourWiseReport());
        purchaseEventStream.forEach(purchaseEvent -> {
            for (StreamReport report : reports) {
                report.process(purchaseEvent);
            }
        });
        for (StreamReport report : reports) {
            report.printReport(printWriter);
        }
    }
}
