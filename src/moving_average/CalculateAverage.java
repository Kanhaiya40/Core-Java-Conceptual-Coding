package moving_average;

import java.util.Iterator;

public class CalculateAverage {

    public void calculateMovingAverage(CircularList<Double> series) {
        System.out.println(series);
        double summationOfSeries = 0;
        for (Double aDouble : series) {
            summationOfSeries = summationOfSeries + aDouble;
        }
        System.out.println("Moving Average=" + Math.round(summationOfSeries / series.size()));
    }
}
