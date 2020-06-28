package moving_average;

import java.util.Scanner;

public class CalculateAverageMainClass {

    public static void main(String[] args) {
        System.out.println("Enter Window Size:");
        int windowSize;
        Scanner scanner = new Scanner(System.in);
        windowSize = scanner.nextInt();
        CalculateAverage calculateAverage = new CalculateAverage();
        CircularList<Integer> series = new CircularList<>();
        series.add(36);
        series.add(26);
        series.add(86);
        series.add(96);
        series.add(46);
        series.remove();
        series.add(56);
        series.add(39);
        series.add(43);
        series.add(94);
        System.out.println(series);
        calculateAverage.calculateMovingAverage(series, windowSize);
        System.out.println("If U Wanna Continue");
        System.out.println("1. For Yes");
        System.out.println("2. For No");
        int choice = scanner.nextInt();
        while (choice != 2) {
            System.out.println("Add Your Element Elements");
            series.extendElementOfSeries(scanner.nextInt());
            System.out.println(series);
            calculateAverage.calculateMovingAverage(series, windowSize);
            System.out.println("Enter Your Choice");
            choice = scanner.nextInt();
        }
        System.exit(0);
    }
}
