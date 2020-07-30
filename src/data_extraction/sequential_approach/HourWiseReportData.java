package data_extraction.sequential_approach;

import java.util.Objects;

public class HourWiseReportData {

    public String hourOfDay;
    public double avgNumOfActiveSessions;
    public double avgNumOfItemPurchased;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourWiseReportData that = (HourWiseReportData) o;
        return hourOfDay.equals(that.hourOfDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourOfDay);
    }

    public String getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(String hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public double getAvgNumOfActiveSession() {
        return avgNumOfActiveSessions;
    }

    public void setAvgNumOfActiveSession(double avgNumOfActiveSession) {
        this.avgNumOfActiveSessions = avgNumOfActiveSession;
    }

    @Override
    public String toString() {
        return "HourWiseReportData{" +
                "hourOfPurchaseEvents=" + hourOfDay +
                ", avgNumOfActiveSession=" + avgNumOfActiveSessions +
                ", avgNumOfItemPurchased=" + avgNumOfItemPurchased +
                '}';
    }

    public double getAvgNumOfItemPurchased() {
        return avgNumOfItemPurchased;
    }

    public void setAvgNumOfItemPurchased(double avgNumOfItemPurchased) {
        this.avgNumOfItemPurchased = avgNumOfItemPurchased;
    }
}
