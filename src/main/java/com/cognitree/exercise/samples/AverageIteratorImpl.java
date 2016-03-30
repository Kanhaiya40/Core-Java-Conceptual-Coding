package com.cognitree.exercise.samples;

import com.cognitree.exercise.core.IteratorFunction;
import com.cognitree.exercise.model.FieldIterator;

public class AverageIteratorImpl implements IteratorFunction<Double> {

    public Double compute(FieldIterator fieldIterator) throws Exception {
        double avg = 0;
        int count=0;
        while (fieldIterator.hasNext()) {
            final String value = fieldIterator.next();
            avg += Double.parseDouble(value);
            count++;
        }
        return avg/count;
    }
}
