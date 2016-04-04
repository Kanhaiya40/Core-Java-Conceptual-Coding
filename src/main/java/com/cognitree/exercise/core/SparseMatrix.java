package com.cognitree.exercise.core;

import com.cognitree.exercise.core.exceptions.InvalidOperationException;
import com.cognitree.exercise.core.exceptions.ParseException;
import com.cognitree.exercise.model.*;
import com.cognitree.exercise.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;

/**
 * SparseMatrix class provides an iterator to iterate row by row over a file.
 */
public class SparseMatrix {
    private static final Logger logger = LoggerFactory.getLogger(SparseMatrix.class);
    private final String fileName;
    private static final String FIELD_SEPARATOR = ",";
    public static final String COLUMN_KEY_VALUE_SEPARATOR = "=";
    private final HashMap<String, BufferedWriter> columnWriterMap = new HashMap<>();
    private String path;

    public SparseMatrix(String fileName) throws IOException {
        logger.info("Initializing file {}. ", fileName);
        this.fileName = fileName;
    }

    public SparseMatrix(String fileName, String path) throws IOException {
        logger.info("Initializing file {}. ", fileName);
        this.fileName = fileName;
        this.path = path;
        init();
    }

    //for unit test case
    public void initPath(String path) {
        this.path = path;
    }


    private void init() throws IOException {
        int traceRow = 0, traceColumn = 0;
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            traceRow++;
            final String line = scanner.nextLine();
            final String[] parts = line.split(FIELD_SEPARATOR);
            for (int i = 1; i < parts.length; i++) {
                traceColumn++;
                final String[] columnKeyValuePair = parts[i].split(COLUMN_KEY_VALUE_SEPARATOR);
                if (columnKeyValuePair.length != 2) {
                    throw new ParseException(traceRow, traceColumn);
                }
                final String key = columnKeyValuePair[0];
                if (columnWriterMap.containsKey(key)) {
                    BufferedWriter writer = columnWriterMap.get(key);
                    FileUtil.writeToFile(writer, parts[i]);
                } else {
                    File file = new File(getFileName(key));
                    file.createNewFile();
                    final BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                    columnWriterMap.put(key, writer);
                    FileUtil.writeToFile(writer, parts[i]);
                }
            }
        }
    }

    private String getFileName(String key) {
        return path + "/" + key.trim();
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
        return new FieldIterator(fieldName, path);
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
        final RowIterator rowIterator = this.rowIterator();
        while (rowIterator.hasNext()) {
            final Row row = rowIterator.next();
            final ColumnIterator columnIterator = row.iterator();
            while (columnIterator.hasNext()) {
                final Column column = columnIterator.next();
                if (column.getKey().equals(columnName)) {
                    try {
                        for (Function function : functions) {
                            final Type type = getType(functions[0]);
                            if (type.getTypeName().equals("java.lang.Double")) {
                                function.compute(column.getDoubleValue());
                            } else if (type.getTypeName().equals("java.lang.String")) {
                                function.compute(column.getStringValue());
                            } else if (type.getTypeName().equals("java.lang.Float")) {
                                function.compute(column.getFloatValue());
                            } else if (type.getTypeName().equals("java.lang.Integer")) {
                                function.compute(column.getIntValue());
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

    /**
     * Accepts a function and evaluate it over specified columnName.
     *
     * @param columnName       over which you want to evaluate the function
     * @param ignoreParseError true if you want to ignore error value in specified column
     * @param functions        which you want to evaluate given columnName
     * @throws Exception
     */
    public void evaluateValue(String columnName, boolean ignoreParseError, Function... functions) throws Exception {
        int traceRow = 0;
        final FieldIterator fieldIterator = this.fieldIterator(columnName.trim());
        while (fieldIterator.hasNext()) {
            traceRow++;
            final String value = fieldIterator.next();
            try {
                for (Function function : functions) {
                    final Type type = getType(functions[0]);
                    if (type.getTypeName().equals("java.lang.Double")) {
                        function.compute(Double.parseDouble(value));
                    } else if (type.getTypeName().equals("java.lang.String")) {
                        function.compute(value);
                    } else if (type.getTypeName().equals("java.lang.Float")) {
                        function.compute(Float.parseFloat(value));
                    } else if (type.getTypeName().equals("java.lang.Integer")) {
                        function.compute(Integer.parseInt(value));
                    }
                }
            } catch (NumberFormatException e) {
                if (!ignoreParseError) {
                    throw new InvalidOperationException(traceRow, columnName);
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