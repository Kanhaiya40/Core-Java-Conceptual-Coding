package com.cognitree.exercise.core.exceptions;

public class InvalidOperationException extends Exception {
    public InvalidOperationException() {
        super();
    }

    public InvalidOperationException(String message) {
        super(message);
    }

    public InvalidOperationException(String row, String column) {
        super("Operation not permitted for row " + row + " column " + column);
    }

    public InvalidOperationException(int row, String column) {
        super("Operation not permitted for row " + row + " column " + column);
    }
}
