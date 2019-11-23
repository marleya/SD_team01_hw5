package Northeastern.model;

/**
 * A strategy for detecting plagiarism between two {@code Submission}
 */
public interface IPlagiarismDetectionAlgorithm {

  /**
   * Compares the two given submissions and returns a {@code SubmissionComparison} object
   * representing the potential plagiarism or lack thereof between the two submissions
   *
   * @param sub1 first submission to compare
   * @param sub2 second submission to compare
   *
   * @return SubmissionComparison
   */
  ISubmissionComparison getSubmissionComparison(ISubmission sub1, ISubmission sub2);
}
