package moving_average;

import java.util.Iterator;

public class CalculateAverage {

    public void calculateMovingAverage(CircularList<Double> series) {
        System.out.println(series);
        double summationOfSeries = 0;
        Iterator<Double> iterator = series.iterator();
        while (iterator.hasNext()) {
            summationOfSeries = summationOfSeries + iterator.next();
        }
        System.out.println("Moving Average=" + Math.round(summationOfSeries / series.size()));
    }
}
