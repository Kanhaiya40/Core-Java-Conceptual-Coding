package data_extraction.sequential_approach;

import data_extraction.Parser;
import data_extraction.PurchaseEvent;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PurchaseEventsSequentialApproach {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/shubh/Desktop/sample.txt";
        Parser parser = new Parser(filePath);
        List<PurchaseEvent> purchaseEvents = parser.getPurchaseEvents();
        List<Report> reports = new ArrayList<>();
        reports.add(new ItemIdVsBuyCount());
        reports.add(new ItemIdVsNumberOfSessions());
        reports.add(new ItemIdVsAverageQuantityPerSession());
        for (Report report : reports) {
            report.generate(purchaseEvents, new FileOutputStream("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/reports.txt",true));
        }
    }
}