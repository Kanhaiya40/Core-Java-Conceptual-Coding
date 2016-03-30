package com.cognitree.exercise.core;

import com.cognitree.exercise.model.FieldIterator;

/**
 * interface to define a function which will be evaluated using SparseMatrix.
 * @param <T>
 */
public interface IteratorFunction<T> {
    /**
     * computation logic is defined here.
     * It takes an FieldIterator from SparseMatrix and perform computation by iterating over the value returned by FieldIterator.
     * @param fieldIterator
     * @return
     * @throws Exception
     */
    public T compute(FieldIterator fieldIterator) throws Exception;
}
