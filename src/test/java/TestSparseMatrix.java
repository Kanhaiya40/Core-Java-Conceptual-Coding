import com.cognitree.exercise.core.SparseMatrix;
import com.cognitree.exercise.core.exceptions.InvalidOperationException;
import com.cognitree.exercise.core.exceptions.ParseException;
import com.cognitree.exercise.model.Column;
import com.cognitree.exercise.model.ColumnIterator;
import com.cognitree.exercise.model.Row;
import com.cognitree.exercise.model.RowIterator;
import com.cognitree.exercise.samples.Average;
import com.cognitree.exercise.samples.StdDeviation;
import com.cognitree.exercise.samples.Sum;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class TestSparseMatrix {
    private static SparseMatrix matrix;

    @BeforeClass
    public static void init() throws IOException {
        matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/sandbox/src/main/resources/matrix.txt");
    }

    @Test
    public void testIterator() throws IOException {
        final RowIterator rowIterator = matrix.rowIterator();
        while (rowIterator.hasNext()) {
            final Row row = rowIterator.next();
            final ColumnIterator columnIterator = row.iterator();
            while (columnIterator.hasNext()) {
                columnIterator.next();
            }
        }
    }

    @Test
    public void testRowIterator() throws IOException {
        final RowIterator rowIterator = matrix.rowIterator();
        Assert.assertEquals(rowIterator.next().getName(), "r1");
        Assert.assertEquals(rowIterator.next().getName(), "v3");
        Assert.assertEquals(rowIterator.next().getName(), "r3");
        Assert.assertEquals(rowIterator.next().getName(), "r4");
        Assert.assertEquals(rowIterator.next().getName(), "r5");
    }

    @Test
    public void testColumnIterator() throws IOException {
        final RowIterator rowIterator = matrix.rowIterator();
        final Row row = rowIterator.next();
        final ColumnIterator columnIterator = row.iterator();
        Column column = columnIterator.next();
        Assert.assertEquals(column.getKey(), "c2");
        Assert.assertEquals(column.getStringValue(), "1");
        column = columnIterator.next();
        Assert.assertEquals(column.getKey(), "c3");
        Assert.assertEquals(column.getStringValue(), "2");
    }

    @Test(expected = ParseException.class)
    public void validateParseExceptions() throws Exception {
        SparseMatrix matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/sandbox/src/test/resources/matrix-error.txt");
        final RowIterator rowIterator = matrix.rowIterator();
        final Row row = rowIterator.next();
        final ColumnIterator columnIterator = row.iterator();
        while (columnIterator.hasNext()) {
            columnIterator.next();
        }
    }

    @Test(expected = InvalidOperationException.class)
    public void validateInvalidOperationException() throws Exception {
        Sum sum = new Sum();
        matrix.evaluate("c3", false, sum);
    }

    @Test
    public void testSum() throws Exception {
        Sum sum = new Sum();
        matrix.evaluate("c2", true, sum);
        Assert.assertEquals(sum.getResult(), 655d, 2);
    }

    @Test
    public void testAvg() throws Exception {
        Average avg = new Average();
        matrix.evaluate("c2", true, avg);
        Assert.assertEquals(avg.getResult(), 163.75d, 2);
    }

    @Test
    public void multiFunctionTest() throws Exception {
        Average avg = new Average();
        Sum sum = new Sum();
        matrix.evaluate("c2", true, sum, avg);
        Assert.assertEquals(avg.getResult(), 163.75d, 2);
        Assert.assertEquals(sum.getResult(), 655d, 2);

    }

    @Test
    public void testStdDev() throws Exception {
        StdDeviation stdDeviation = new StdDeviation();
        matrix.evaluate("c2", true, stdDeviation);
        Assert.assertEquals(stdDeviation.getResult(), 217.03d, 2);
    }
}
