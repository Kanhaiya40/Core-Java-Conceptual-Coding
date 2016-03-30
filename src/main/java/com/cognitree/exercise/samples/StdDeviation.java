package com.cognitree.exercise.samples;

import com.cognitree.exercise.core.Function;
import com.cognitree.exercise.util.Math;

public class StdDeviation implements Function<Double> {
    public double result = 0;
    private com.cognitree.exercise.util.Math math = new Math();

    @Override
    public void compute(Double value) {
        result = math.stdDev(value);
    }

    @Override
    public Double getResult() {
        return result;
    }
}
