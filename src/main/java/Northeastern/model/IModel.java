package Northeastern.model;

import java.io.File;

/**
 * The Plagiarism Detector Model that allows for upload of an indefinite number of submissions and
 * for comparison of any two uploaded submissions. Produces similarity scores for compared
 * submissions and pointers to the potentially plagiarized sourcecode.
 */
public interface IModel {
  /**
   * takes in two submissions and creates a submission comparison for the two, and adds that
   * submission comparison to this Model's comparisons list
   *
   * @param submission1 name of submission 1
   * @param submission2 name of submission 2
   *
   * @return ISubmissionComparison
   */
  ISubmissionComparison compareTwoFiles(int submission1, int submission2);

  /**
   * Adds a new submission to the model
   *
   * @param file uploaded to the Plagiarism Detector
   */
  void addSubmission(File file);

  /*  *//**
   * Returns the SubmissionComparisons for all the other Submissions that have been compared to
   * the given submission
   *
   * @return list of all the comparisons that have involved the given submission
   *//*
  List<SubmissionComparison> getComparisons(int id);*/
}
