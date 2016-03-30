package com.cognitree.exercise.samples;

import com.cognitree.exercise.core.Function;

public class Sum implements Function<Double> {
    public double result = 0;

    @Override
    public void compute(Double value) {
        result += value;
    }

    @Override
    public Double getResult() {
        return result;
    }
}
