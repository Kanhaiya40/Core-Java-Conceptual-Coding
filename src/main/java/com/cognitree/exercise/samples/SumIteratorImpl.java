package com.cognitree.exercise.samples;

import com.cognitree.exercise.core.IteratorFunction;
import com.cognitree.exercise.model.FieldIterator;

public class SumIteratorImpl implements IteratorFunction<Double> {

    public Double compute(FieldIterator fieldIterator) throws Exception {
        double sum = 0;
        while (fieldIterator.hasNext()) {
            final String value = fieldIterator.next();
            sum += Double.parseDouble(value);
        }
        return sum;
    }
}
