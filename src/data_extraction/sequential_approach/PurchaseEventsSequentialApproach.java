package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PurchaseEventsSequentialApproach {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/shubh/Desktop/sample.txt";
        Parser parser = new Parser(filePath);
        PrintWriter printWriter = new PrintWriter("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/reports.txt");
        List<PurchaseEvent> purchaseEvents = parser.getPurchaseEvents();
        List<Report> reports = new ArrayList<>();
        reports.add(new ItemIdVsBuyCount());
        reports.add(new ItemIdVsNumberOfSessions());
        reports.add(new ItemIdVsAverageQuantityPerSession());
        reports.add(new DayWiseReport());
        reports.add(new HourWiseReport());
        for (Report report : reports) {
            report.process(purchaseEvents, printWriter);
        }
    }
}