package com.cognitree.exercise.model;

import com.cognitree.exercise.core.exceptions.ParseException;

import java.util.*;

/**
 * An iterator over a column for a given row.
 */
public class ColumnIterator implements Iterator<Column> {
    public static final String FIELD_SEPARATOR = ",";
    public static final String COLUMN_KEY_VALUE_SEPARATOR = "=";
    private final Scanner scanner;
    private final int traceRow;
    private int traceColumn= 1;

    public ColumnIterator(Scanner scanner, int rowNumber) {
        this.scanner = scanner;
        this.scanner.useDelimiter(FIELD_SEPARATOR);
        traceRow = rowNumber;
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        return scanner.hasNext();
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     * @throws ParseException if the iterator fails to parse column elements
     */
    @Override
    public Column next() {
        traceColumn++;
        final String part = scanner.next();
        final String[] keyValue = part.split(COLUMN_KEY_VALUE_SEPARATOR);
        if (keyValue.length != 2) {
            throw new ParseException(traceRow, traceColumn);
        }
        return new Column(keyValue[0], keyValue[1]);
    }
}
