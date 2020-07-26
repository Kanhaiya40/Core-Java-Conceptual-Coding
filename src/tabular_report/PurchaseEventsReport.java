package tabular_report;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PurchaseEventsReport {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/shubh/Desktop/sample.txt";
        Parser parser = new Parser(filePath);
        List<PurchaseEvent> purchaseEvents = parser.getPurchaseEvents();
        PrintWriter printWriter = new PrintWriter("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/tabular_report");
        List<TabularReport> tabularReports = new ArrayList<>();
        TabularReport firstReport = new DayWiseReport();
        TabularReport secondReport = new HourWiseReport();
        tabularReports.add(firstReport);
        tabularReports.add(secondReport);
        for (TabularReport tabularReport : tabularReports) {
            tabularReport.generate(purchaseEvents, printWriter);
        }
    }
}