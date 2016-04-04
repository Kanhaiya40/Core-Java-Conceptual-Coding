package com.cognitree.exercise.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * An iterator over a field in a file.
 */
public class FieldIterator implements Iterator<String> {
    public static final String COLUMN_KEY_VALUE_SEPARATOR = "=";
    private String line;

    private final Scanner scanner;

    public FieldIterator(String fieldName, String path) throws FileNotFoundException {
        this.scanner = new Scanner(new File(getFileName(fieldName, path)));
    }

    private String getFileName(String fieldName, String path) {
        return path + "/" + fieldName;
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
        if (line == null || line.isEmpty()) {
            line = getNextElement();
        }
        return line != null && !line.isEmpty();
    }

    private String getNextElement() {
        while (scanner.hasNext()) {
            final String next = scanner.next();
            if (next != null && !next.isEmpty()) {
                return next;
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
        if (line != null) {
            String next = line;
            line = null;
            return next.split(COLUMN_KEY_VALUE_SEPARATOR)[1];
        } else {
            throw new NoSuchElementException();
        }
    }
}
