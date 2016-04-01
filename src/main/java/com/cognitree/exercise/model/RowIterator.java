package com.cognitree.exercise.model;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * An iterator over a Row.
 */
public class RowIterator implements Iterator<Row> {
    private static final String FIELD_SEPARATOR = ",";
    private int traceRow = 0;
    private String next = null;

    private final Scanner scanner;

    public RowIterator(Scanner scanner) {
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
        if (next == null) {
            next = getNext();
        }
        return next != null;
    }

    private String getNext() {
        String next = null;
        while (scanner.hasNext()) {
            next = scanner.nextLine();
            if(!next.isEmpty()){
                break;
            }else {
                next = null;
            }
        }
        return next;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Row next() {
        traceRow++;
        if (next != null && !next.isEmpty()) {
            String line = next;
            next = null;
            return getRow(line);
        } else {
            final String line = getNext();
            if (line != null) {
                return getRow(line);
            } else
                throw new NoSuchElementException();
        }
    }

    private Row getRow(String line) {
        final String[] parts = line.split(FIELD_SEPARATOR);
        final String rowName = parts[0];
        Scanner lineScanner = new Scanner(line.substring(rowName.length() + 1));
        return new Row(rowName, new ColumnIterator(lineScanner, traceRow));
    }
}