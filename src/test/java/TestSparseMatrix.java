import com.cognitree.exercise.core.SparseMatrix;
import com.cognitree.exercise.core.exceptions.InvalidOperationException;
import com.cognitree.exercise.core.exceptions.ParseException;
import com.cognitree.exercise.model.*;
import com.cognitree.exercise.samples.*;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSparseMatrix {

    @DataProvider(name = "files")
    public Object[][] files() {
        Object[][] files = new Object[3][1];
        files[0][0] = "/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix.txt";
        files[1][0] = "/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix1.txt";
        files[2][0] = "/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix.txt";
        return files;
    }

    @Test(dataProvider = "files")
    public void testIterator(String file) throws IOException {
        SparseMatrix matrix = new SparseMatrix(file);
        final RowIterator rowIterator = matrix.rowIterator();
        while (rowIterator.hasNext()) {
            final Row row = rowIterator.next();
            final ColumnIterator columnIterator = row.iterator();
            while (columnIterator.hasNext()) {
                columnIterator.next();
            }
        }
    }

    @Test(dataProvider = "files")
    public void testRowIterator(String files) throws IOException {
        SparseMatrix matrix = new SparseMatrix(files);
        final RowIterator rowIterator = matrix.rowIterator();
        Assert.assertEquals(rowIterator.next().getName(), "r1");
        Assert.assertEquals(rowIterator.next().getName(), "v3");
        Assert.assertEquals(rowIterator.next().getName(), "r3");
        Assert.assertEquals(rowIterator.next().getName(), "r4");
        Assert.assertEquals(rowIterator.next().getName(), "r5");
    }

    @Test
    public void testColumnIterator() throws IOException {
        SparseMatrix matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix.txt");
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

    @Test(expectedExceptions = ParseException.class)
    public void validateParseExceptions() throws Exception {
        SparseMatrix matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix-error.txt");
        final RowIterator rowIterator = matrix.rowIterator();
        final Row row = rowIterator.next();
        final ColumnIterator columnIterator = row.iterator();
        while (columnIterator.hasNext()) {
            columnIterator.next();
        }
    }

    @Test(expectedExceptions = InvalidOperationException.class)
    public void validateInvalidOperationException() throws Exception {
        SparseMatrix matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix.txt");
        Sum sum = new Sum();
        matrix.evaluate("c3", false, sum);
    }

    @Test
    public void testSum() throws Exception {
        SparseMatrix matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix.txt");
        Sum sum = new Sum();
        matrix.evaluate("c2", true, sum);
        Assert.assertEquals(sum.getResult(), 655d, 2);
    }

    @Test
    public void testSumIterator() throws Exception {
        SparseMatrix matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix.txt");
        SumIteratorImpl sum = new SumIteratorImpl();
        final FieldIterator fieldIterator = matrix.fieldIterator("c2");
        Assert.assertEquals(sum.compute(fieldIterator), 655d, 2);
    }

    @Test
    public void testAvg() throws Exception {
        SparseMatrix matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix.txt");
        Average avg = new Average();
        matrix.evaluate("c2", true, avg);
        Assert.assertEquals(avg.getResult(), 163.75d, 2);
    }

    @Test
    public void testAvgIterator() throws Exception {
        SparseMatrix matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix.txt");
        AverageIteratorImpl avg = new AverageIteratorImpl();
        final FieldIterator fieldIterator = matrix.fieldIterator("c2");
        Assert.assertEquals(avg.compute(fieldIterator), 163.75d, 2);
    }

    @Test
    public void multiFunctionTest() throws Exception {
        SparseMatrix matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix.txt");
        Average avg = new Average();
        Sum sum = new Sum();
        matrix.evaluate("c2", true, sum, avg);
        Assert.assertEquals(avg.getResult(), 163.75d, 2);
        Assert.assertEquals(sum.getResult(), 655d, 2);

    }

    @Test
    public void testStdDev() throws Exception {
        SparseMatrix matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/samples/ProgrammingExercise/src/test/resources/matrix.txt");
        StdDeviation stdDeviation = new StdDeviation();
        matrix.evaluate("c2", true, stdDeviation);
        Assert.assertEquals(stdDeviation.getResult(), 217.03d, 2);
    }
}
