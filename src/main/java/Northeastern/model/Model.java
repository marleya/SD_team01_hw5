package Northeastern.model;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Northeastern.controller.Controller;

/**
 * The Plagiarism Detector Model that allows for upload of an indefinite number of submissions and
 * for comparison of any two uploaded submissions. Produces similarity scores for compared
 * submissions and pointers to the potentially plagiarized sourcecode.
 */
public class Model implements IModel {
    private Map<ISubmission, List<ISubmissionComparison>> masterMap;
    private IPlagiarismDetectionAlgorithm algo;
    private int submissionIDCounter;

    /**
     * Constructor for the model
     *
     * @param
     * @param algo the plagiarism detection algorithm (strategy) being used in this model
     */
    public Model(IPlagiarismDetectionAlgorithm algo) {
        this.algo = algo;
        this.masterMap = new HashMap<ISubmission, List<ISubmissionComparison>>();
        this.submissionIDCounter = 0;
    }

    /**
     * Takes in two submissions and creates a submission comparison for the two, and adds that
     * submission comparison to this Model's comparisons list
     *
     * @param submission1 name of submission 1
     * @param submission2 name of submission 2
     * @return ISubmissionComparison of the two submissions given
     */
    //TODO test
    public ISubmissionComparison compareTwoFiles(int submission1, int submission2) {
        //translate submission IDs into submissions
        ISubmission sub1 = this.getSubmission(submission1);
        ISubmission sub2 = this.getSubmission(submission2);

        //does this comparison already exist? if so return the existing SubmissionComparison
        //TODO test if comparison exists it's not duplicated
        for (ISubmissionComparison sc : masterMap.get(sub1)) {
            if (sc.getSubmissions().contains(sub2)) {
                return sc;
            }
        }

        //make the comparison by delegating to the plagiarism detection strategy of this model
        ISubmissionComparison comparison = this.algo.getSubmissionComparison(sub1, sub2);

        //TODO test comparison added to map properly
        //add comparison to hashmap twice: once for each involved Submission
        this.masterMap.get(sub1).add(comparison);
        this.masterMap.get(sub2).add(comparison);

        //TODO test proper comparison returned
        return comparison;
    }

    /**
     * Adds a new submission to the model
     *
     * @param file uploaded to the Plagiarism Detector
     */
    @Override
    //TODO test
    public void addSubmission(File file) {
        //TODO what happens if they try to upload a file that's already been uploaded?
        ISubmission newSub = new Submission(this.getNextSubmissionID(), file);
        masterMap.put(newSub, new ArrayList<ISubmissionComparison>());
    }

  /**
   * Helper function to return a submission ID
   * (Extracted so if the means of creating IDs changes we have localized the method that needs to change
   * with it)
   *
   * @return int ID for added submission
   */
    private int getNextSubmissionID() {
        int nextID = submissionIDCounter;
        submissionIDCounter++;
        return nextID;
    }

    /**
     * Getter method for this Model's submission of the given ID
     *
     * @param submissionID
     *
     * @return ISubmission represented by the given ID
     * @throws IllegalArgumentException if the submission asked for doesn't exist
     */
    private ISubmission getSubmission(int submissionID) {
      //TODO implicitly test via testing compareTwoFiles() method
        for (ISubmission s : masterMap.keySet()) {
            if (s.getID() == submissionID) {
                return s;
            }
        }
        //TODO test
        throw new IllegalArgumentException("The submission you are trying to access has not" +
                "been uploaded");
    }

}
