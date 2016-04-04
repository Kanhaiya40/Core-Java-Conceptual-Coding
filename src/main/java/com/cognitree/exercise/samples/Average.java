package com.cognitree.exercise.samples;

import com.cognitree.exercise.core.Function;

public class Average implements Function<Double> {
    public double result = 0;
    private int count = 0;

    @Override
    public void compute(Double value) {
        result += value;
        count++;
    }

    @Override
    public Double getResult() {
        return result / count;
    }
}
