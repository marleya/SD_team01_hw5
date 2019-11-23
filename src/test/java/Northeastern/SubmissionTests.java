package Northeastern;


import Northeastern.model.Submission;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.File;

/**
 * Tests for the {@code Submission} class
 */
public class SubmissionTests {
    //TODO should ultimately be a submission representation, not a file
    static private File file0;
    static private File file1;
    static private Submission submission;

    /**
     * Creates all the objects needed for the following Submission tests
     */
    @BeforeClass
    public static void setupVariables() {
        file0 = new File("counttree.py");
        file1 = new File("counttree3.py");
        submission = new Submission(5, file0);
    }

    /**
     * Tests the getID() method of the {@code Submission} class
     */
    @Test
    public void testGetID() {
        assertEquals(submission.getID(), 5);
    }

    /**
     * Tests the getID() method of the {@code Submission} class
     */
    @Test
    public void testGetIDNegative() {
        assertNotEquals(submission.getID(), 0);
    }

    /**
     * Tests the getFile() method of the {@code Submission} class
     */
    //TODO should ultimately be a submission representation, not a file
    @Test
    public void testGetFile() {
        assertEquals(submission.getFile(), file0);
    }

    /**
     * Tests the getFile() method of the {@code Submission} class
     */
    //TODO should ultimately be a submission representation, not a file
    @Test
    public void testGetFileNegative() {
        assertNotEquals(submission.getFile(), file1);
    }
}
