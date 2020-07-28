package data_extraction.streaming_concept;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class HourWiseReport implements StreamReport {

    Set<HourWiseReportData> hourWiseReports = new HashSet<>();
    Set<Integer> uniqueSessions = new HashSet<>();
    Set<Integer> uniqueItemId = new HashSet<>();
    int hourOccurrenceCount = 0;

    @Override
    public void process(PurchaseEvent purchaseEvent) {
        if (hourWiseReports.isEmpty()) {
            hourOccurrenceCount++;
            HourWiseReportData newHourWiseReportData = new HourWiseReportData();
            newHourWiseReportData.setHourOfDay(purchaseEvent.getHourOfPurchaseEvent());
            uniqueSessions.add(purchaseEvent.getSessionId());
            newHourWiseReportData.setAvgActiveSessionId((double) uniqueSessions.size() / hourOccurrenceCount);
            uniqueItemId.add(purchaseEvent.getItemId());
            newHourWiseReportData.setAvgItemIdPurchased((double) uniqueItemId.size() / hourOccurrenceCount);
            hourWiseReports.add(newHourWiseReportData);
        } else {
            HourWiseReportData tempHourWiseReport = new HourWiseReportData();
            tempHourWiseReport.setHourOfDay(purchaseEvent.getHourOfPurchaseEvent());
            tempHourWiseReport.setAvgActiveSessionId(1);
            tempHourWiseReport.setAvgItemIdPurchased(1);
            if (hourWiseReports.contains(tempHourWiseReport)) {
                hourOccurrenceCount++;
                double avgActiveSession = (double) uniqueSessions.size() / hourOccurrenceCount;
                double avgItemPurchased = (double) uniqueItemId.size() / hourOccurrenceCount;
                if (!uniqueSessions.contains(purchaseEvent.getSessionId())) {
                    uniqueSessions.add(purchaseEvent.getSessionId());
                    double avg = (double) uniqueSessions.size() / hourOccurrenceCount;
                    tempHourWiseReport.setAvgActiveSessionId(avg);
                }
                if (!uniqueItemId.contains(purchaseEvent.getItemId())) {
                    uniqueItemId.add(purchaseEvent.getItemId());
                    double avgPurchased = (double) uniqueItemId.size() / hourOccurrenceCount;
                    tempHourWiseReport.setAvgItemIdPurchased(avgPurchased);
                } else {
                    tempHourWiseReport.setAvgItemIdPurchased(avgActiveSession);
                    tempHourWiseReport.setAvgItemIdPurchased(avgItemPurchased);
                }
                hourWiseReports.add(tempHourWiseReport);
            } else {
                hourWiseReports.add(tempHourWiseReport);
                hourOccurrenceCount++;
            }
        }
    }

    @Override
    public void printReport(PrintWriter printWriter) {
        printWriter.println("");
        printWriter.println("HourOfDay\t" + "AvgActiveSession\t" + "AvgItemPurchased\t");
        for (HourWiseReportData hourWiseReport : hourWiseReports) {
            printWriter.println(hourWiseReport.getHourOfDay() + "\t" + hourWiseReport.getAvgActiveSessionId() + "\t\t\t\t" + hourWiseReport.getAvgItemIdPurchased());
            printWriter.flush();
        }
    }
}
