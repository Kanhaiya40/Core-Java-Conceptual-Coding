package com.cognitree.exercise.core;

import com.cognitree.exercise.core.exceptions.InvalidOperationException;
import com.cognitree.exercise.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Scanner;

/**
 * SparseMatrix class provides an iterator to iterate row by row over a file.
 */
public class SparseMatrix {
    public static final Logger logger = LoggerFactory.getLogger(SparseMatrix.class);
    public final String fileName;

    public SparseMatrix(String fileName) {
        logger.info("Initializing file {}. ", fileName);
        this.fileName = fileName;
    }

    /**
     * provides RowIterator object to iterate over a file row by row
     *
     * @return RowIterator object
     * @throws IOException
     */
    public RowIterator rowIterator() throws IOException {
        return new RowIterator(new Scanner(new File(fileName)));
    }

    /**
     * provides FieldIterator to iterate over a field in a file.
     *
     * @param fieldName over which you want an iterator
     * @return FieldIterator
     * @throws IOException
     */
    public FieldIterator fieldIterator(String fieldName) throws IOException {
        return new FieldIterator(new Scanner(new File(fileName)), fieldName);
    }

    /**
     * Accepts a function and evaluate it over specified columnName.
     *
     * @param columnName       over which you want to evaluate the function
     * @param ignoreParseError true if you want to ignore error value in specified column
     * @param functions        which you want to evaluate given columnName
     * @throws Exception
     */
    public void evaluate(String columnName, boolean ignoreParseError, Function... functions) throws Exception {
        final Type type = getType(functions[0]);
        final RowIterator rowIterator = this.rowIterator();
        while (rowIterator.hasNext()) {
            final Row row = rowIterator.next();
            final ColumnIterator columnIterator = row.iterator();
            while (columnIterator.hasNext()) {
                final Column column = columnIterator.next();
                if (column.getKey().equals(columnName)) {
                    try {
                        if (type.getTypeName().equals("java.lang.Double")) {
                            for (Function function : functions) {
                                function.compute(column.getDoubleValue());
                            }
                        }
                        break;
                    } catch (NumberFormatException e) {
                        if (!ignoreParseError) {
                            throw new InvalidOperationException(row.getName(), columnName);
                        }
                    }
                }
            }
        }
    }

    private Type getType(Function function) {
        final Type[] genericInterfaces = function.getClass().getGenericInterfaces();
        for (Type genericInterface : genericInterfaces) {
            if (genericInterface.getTypeName().startsWith(Function.class.getCanonicalName()))
                return ((ParameterizedType) genericInterface).getActualTypeArguments()[0];
        }
        return null;
    }

}