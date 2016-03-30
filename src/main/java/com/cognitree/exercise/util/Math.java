package com.cognitree.exercise.util;

public class Math {
    int n = 0;
    double sum = 0;
    double sum2 = 0;

    public double stdDev(double x) {
        n++;
        sum += x;
        sum2 += x*x;
        return java.lang.Math.sqrt(sum2/n - sum*sum/n/n);
    }
}
