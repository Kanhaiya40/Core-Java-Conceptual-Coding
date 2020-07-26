package tabular_report;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Problem Statement-1:Print a tabular report of (hour of day, avg no of active sessions, avg no of unique items purchased)
 * <p>
 * Sample Input:
 * 420374,2014-04-06T18:44:58.314Z,214537888,12462,3
 * 420374,2014-04-06T18:44:58.325Z,214537888,10471,2
 * 281626,2014-04-06T09:40:13.032Z,214535653,1883,2
 * 420368,2014-04-04T06:13:28.848Z,214537888,6073,1
 * 420368,2014-04-04T06:13:28.858Z,214535653,2617,3
 * <p>
 * Sample Output:
 * HourOfDay	AvgNumOfActiveSession	AvgItemPurchased
 * 6				1							2
 * 9				1							1
 * 18				1							1
 */
public class HourWiseReport implements TabularReport {

    @Override
    public void generate(List<PurchaseEvent> purchaseEvents, PrintWriter printWriter) {
        Set<HourWiseReportData> hourWiseReportData = new CopyOnWriteArraySet<>();
        purchaseEvents.sort((purchaseEvent, t1) -> {
            int lhs = purchaseEvent.getHourOfPurchaseEvent();
            int rhs = t1.getHourOfPurchaseEvent();
            return Integer.compare(lhs, rhs);
        });
        Set<Integer> uniqueSessions = new HashSet<>();
        Set<Integer> uniItemId = new HashSet<>();
        printWriter.println("\n");
        printWriter.println("HourOfDay\t" + "AvgNumOfActiveSession\t" + "AvgItemPurchased");
        purchaseEvents.forEach(purchaseEvent -> {
            if (hourWiseReportData.size() > 0) {
                for (HourWiseReportData currentHourWiseReportData : hourWiseReportData) {
                    if (currentHourWiseReportData.getHourOfPurchaseEvents() == purchaseEvent.getHourOfPurchaseEvent()) {
                        if (!uniqueSessions.contains(purchaseEvent.getSessionId())) {
                            uniqueSessions.add(purchaseEvent.getSessionId());
                            currentHourWiseReportData.setAvgNumOfActiveSession(currentHourWiseReportData.getAvgNumOfActiveSession() + 1);
                        }
                        if (!uniItemId.contains(purchaseEvent.getItemId())) {
                            uniItemId.add(purchaseEvent.getItemId());
                            currentHourWiseReportData.setAvgNumOfItemPurchased(currentHourWiseReportData.getAvgNumOfItemPurchased() + 1);
                        }
                    } else {
                        uniItemId.clear();
                        uniqueSessions.clear();
                        HourWiseReportData newHourWiseReportData = new HourWiseReportData();
                        newHourWiseReportData.setHourOfPurchaseEvents(purchaseEvent.getHourOfPurchaseEvent());
                        uniqueSessions.add(purchaseEvent.getSessionId());
                        newHourWiseReportData.setAvgNumOfActiveSession(1);
                        uniItemId.add(purchaseEvent.getItemId());
                        newHourWiseReportData.setAvgNumOfItemPurchased(1);
                        hourWiseReportData.add(newHourWiseReportData);
                    }
                }
            } else {
                HourWiseReportData newHourWiseReportData = new HourWiseReportData();
                newHourWiseReportData.setHourOfPurchaseEvents(purchaseEvent.getHourOfPurchaseEvent());
                uniqueSessions.add(purchaseEvent.getSessionId());
                newHourWiseReportData.setAvgNumOfActiveSession(1);
                newHourWiseReportData.setAvgNumOfItemPurchased(1);
                uniItemId.add(purchaseEvent.getItemId());
                hourWiseReportData.add(newHourWiseReportData);
            }
        });
        for (HourWiseReportData eachHourWiseReportData : hourWiseReportData) {
            printWriter.println(eachHourWiseReportData.getHourOfPurchaseEvents() + "\t\t\t\t"
                    + eachHourWiseReportData.getAvgNumOfActiveSession() + "\t\t\t\t\t\t\t"
                    + eachHourWiseReportData.getAvgNumOfItemPurchased());
            printWriter.flush();
        }
    }
}
