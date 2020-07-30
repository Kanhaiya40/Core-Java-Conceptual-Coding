package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
 * HourOfDay	AvgNumOfActiveSession	AvgNumOfItemPurchased
 * SUNDAY_9-10  		1.0							1.0
 * SUNDAY_18-19  		0.5							0.5
 * FRIDAY_6-7  		    0.5							1.0
 */
public class HourWiseReport implements Report {

    @Override
    public void process(List<PurchaseEvent> purchaseEvents, PrintWriter printWriter) {
        printWriter.println("");
        Set<HourWiseReportData> hourWiseReportData = new HashSet<>();
        printWriter.println("HourOfDay\t" + "AvgNumOfActiveSession\t" + "AvgNumOfItemPurchased");
        Map<String, Set<Integer>> uniqueSessionId = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getHourOfPurchaseEvent,
                        Collectors.mapping(PurchaseEvent::getSessionId, Collectors.toSet())));
        Map<String, Set<Integer>> uniqueItemId = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getHourOfPurchaseEvent,
                        Collectors.mapping(PurchaseEvent::getItemId, Collectors.toSet())));
        Map<String, Long> hourCount = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getHourOfPurchaseEvent,
                        Collectors.counting()));
        purchaseEvents.forEach(purchaseEvent -> {
            HourWiseReportData newHourWiseReport = new HourWiseReportData();
            newHourWiseReport.setHourOfDay(purchaseEvent.getHourOfPurchaseEvent());
            newHourWiseReport.setAvgNumOfActiveSession((double) (uniqueSessionId.get(purchaseEvent.getHourOfPurchaseEvent()).size()) / hourCount.get(purchaseEvent.getHourOfPurchaseEvent()).intValue());
            newHourWiseReport.setAvgNumOfItemPurchased((double) (uniqueItemId.get(purchaseEvent.getHourOfPurchaseEvent()).size()) / hourCount.get(purchaseEvent.getHourOfPurchaseEvent()).intValue());
            hourWiseReportData.add(newHourWiseReport);
        });
        for (HourWiseReportData hourReportData : hourWiseReportData) {
            printWriter.println(hourReportData.getHourOfDay() + "\t\t"
                    + hourReportData.getAvgNumOfActiveSession() + "\t\t\t\t\t\t\t"
                    + hourReportData.getAvgNumOfItemPurchased());
            printWriter.flush();
        }
    }
}
