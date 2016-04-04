package com.cognitree.exercise.core.exceptions;

public class ParseException extends RuntimeException {
    public ParseException() {
        super();
    }

    public ParseException(String message) {
        super(message);
    }

    public ParseException(int row, int column) {
        super("Error parsing field at line number " + row + " column " + column);
    }
}
