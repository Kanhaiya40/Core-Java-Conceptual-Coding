package com.cognitree.exercise.model;

import com.cognitree.exercise.core.exceptions.ParseException;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * An iterator over a field in a file.
 */
public class FieldIterator implements Iterator<String> {
    public static final String FIELD_SEPARATOR = ",";
    public static final String COLUMN_KEY_VALUE_SEPARATOR = "=";
    private final String fieldName;
    private int traceRow = 0;
    private int traceColumn = 1;
    private String next = null;

    private final Scanner scanner;

    public FieldIterator(Scanner scanner, String fieldName) {
        this.fieldName = fieldName;
        this.scanner = scanner;
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
        if (next != null) {
            return true;
        }
        next = getNext();
        return next != null;
    }

    private String getNext() {
        traceRow++;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            while (line.isEmpty()) {
                if (scanner.hasNext()) {
                    line = scanner.nextLine();
                } else {
                    return null;
                }
            }
            final String[] parts = line.split(FIELD_SEPARATOR);
            for (int i = 1; i < parts.length; i++) {
                traceColumn++;
                final String[] keyValue = parts[i].split(COLUMN_KEY_VALUE_SEPARATOR);
                if (keyValue.length != 2) {
                    throw new ParseException(traceRow, traceColumn);
                }
                if (keyValue[0].trim().equals(fieldName)) {
                    return keyValue[1];
                }
            }
        }
        return null;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public String next() {
        if (next != null) {
            String value = next;
            next = null;
            return value;
        } else {
            next = getNext();
            if (next != null) {
                String value = next;
                next = null;
                return value;
            } else
                throw new NoSuchElementException();
        }
    }
}
