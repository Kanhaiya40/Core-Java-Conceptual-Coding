package moving_average;

public class CalculateAverage {

    public void calculateMovingAverage(CircularList<Integer> series, int windowSize) {
        double summationOfSeries;
        int slidingWindowSize = windowSize;
        for (int i = 0; i < series.size(); i++) {
            summationOfSeries = 0;
            for (int j = i; j < slidingWindowSize; j++) {
                summationOfSeries = summationOfSeries + series.getElement(j);
            }
            System.out.println(summationOfSeries / windowSize);
            slidingWindowSize++;
        }
    }
}
