package moving_average;

public class CalculateAverageMainClass {

    public static void main(String[] args) throws ArrayStoreException {
        CalculateAverage calculateAverage = new CalculateAverage();
        CircularList<Double> series = new CircularList<>(3);
        series.add(34.67);
        series.add(98.43);
        series.add(21.67);
        calculateAverage.calculateMovingAverage(series);
        series.add(52.23);
        calculateAverage.calculateMovingAverage(series);
        series.add(67.0);
        series.add(39.98);
        series.add(29.0);
        calculateAverage.calculateMovingAverage(series);
        series.add(52.23);
        series.add(71.42);
        calculateAverage.calculateMovingAverage(series);
    }
}
