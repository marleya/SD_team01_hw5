package Northeastern;

import Northeastern.model.ASTCC;
import Northeastern.model.IModel;
import Northeastern.model.IPlagiarismDetectionAlgorithm;
import Northeastern.model.Model;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Tests for the {@code Model} class
 */
public class ModelTests {
    private static IModel model;
    private static IPlagiarismDetectionAlgorithm algo;

    /**
     * Creates all the objects needed for the following Model tests
     */
    @BeforeClass
    public static void setupVariables() {
        algo = new ASTCC();
        model = new Model(algo);
    }

    /**
     * Tests compareToFiles creation of an ISubmissionComparison: tests that if the comparison has already
     * been done, it's not duplicated
     */
    @Test
    public void testCompareTwoFilesAlreadyCompared() { }

    /**
     * Tests compareToFiles creation of an ISubmissionComparison: tests that the comparison is added to the
     * Model's mastermap properly
     */
    @Test
    public void testCompareTwoFilesMapAdd() { }

    /**
     * Tests compareToFiles creation of an ISubmissionComparison: tests that the proper comparison is returned
     */
    @Test
    public void testCompareTwoFilesReturn() { }

    /**
     * Tests the Model's addSubmission() method: tests that the proper submission has been created
     */
    @Test
    public void testAddSubmissionReturn() { }

    /**
     * Tests the Model's addSubmission() method: tests that the proper submission has been added to the
     * Model's mastermap
     */
    @Test
    public void testAddSubmissionToMap() { }

    /**
     * Tests the Model's getNextSubmsisionID() method: indirectly tests the incrementation of submission
     * ID numbers with each added submission
     */
    @Test
    public void testGetNextSubmission() { }

    /**
     * Tests the Model's getSubmission() method: indirectly tests the getter's error throwing by trying to
     * compare two files, one of which hasn't been uploaded
     */
    @Test
    public void testGetSubmissionInvalid() { }

    /**
     * Tests the Model's getSubmission() method: indirectly tests the getter by TODO
     */
    @Test
    public void testGetSubmissionValid() { }
}
