package com.cognitree.exercise.core;

/**
 * interface to define a function which will be evaluated using SparseMatrix.
 *
 * @param <T>
 */
public interface Function<T> {
    /**
     * function computation logic is defined here.
     * It accepts a value which is a value return by SparseMatrix and perform logic over that value.
     *
     * @param value over which to apply computation logic
     */
    public void compute(T value);

    /**
     * To get the result of Function
     *
     * @return
     */
    public T getResult();
}
