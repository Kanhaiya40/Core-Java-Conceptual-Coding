import com.cognitree.exercise.core.SparseMatrix;
import com.cognitree.exercise.core.exceptions.InvalidOperationException;
import com.cognitree.exercise.samples.Average;
import com.cognitree.exercise.samples.StdDeviation;
import com.cognitree.exercise.samples.Sum;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestSparseMatrixV2 {
    private static SparseMatrix matrix;
    private static String fileName;

    @BeforeClass
    public static void init() throws IOException {
        fileName = "/Users/ankitnanglia/workspace/cognitree/sandbox/src/test/parsed-file/";
        matrix = new SparseMatrix("/Users/ankitnanglia/workspace/cognitree/sandbox/src/test/resources/matrix.txt", fileName);
    }

    @Test(expected = InvalidOperationException.class)
    public void validateInvalidOperationException() throws Exception {
        Sum sum = new Sum();
        matrix.evaluateValue("c3", false, sum);
    }

    @Test
    public void testSum() throws Exception {
        Sum sum = new Sum();
        matrix.evaluateValue("c2", true, sum);
        Assert.assertEquals(sum.getResult(), 655d, 2);
    }

    @Test
    public void testAvg() throws Exception {
        Average avg = new Average();
        matrix.evaluateValue("c2", true, avg);
        Assert.assertEquals(avg.getResult(), 163.75d, 2);
    }

    @Test
    public void multiFunctionTest() throws Exception {
        Average avg = new Average();
        Sum sum = new Sum();
        matrix.evaluateValue("c2", true, sum, avg);
        Assert.assertEquals(avg.getResult(), 163.75d, 2);
        Assert.assertEquals(sum.getResult(), 655d, 2);

    }

    @Test
    public void testStdDev() throws Exception {
        StdDeviation stdDeviation = new StdDeviation();
        matrix.evaluateValue("c2", true, stdDeviation);
        Assert.assertEquals(stdDeviation.getResult(), 217.03d, 2);
    }

    @AfterClass
    public static void deleteParsedFiles() throws IOException {
        FileUtils.cleanDirectory(new File(fileName));
    }
}
