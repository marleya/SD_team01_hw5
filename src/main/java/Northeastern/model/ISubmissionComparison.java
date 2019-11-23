package Northeastern.model;

import java.util.Set;

/**
 * A comparison of two (@code Submission)s to determine their similarity / potential plagarized
 * content
 */
public interface ISubmissionComparison {

  /**
   * Returns a numerical representation of the similarity of the given submission to the other
   * submission in this SubmissionComparison
   *
   * @param id of the submission you ant to find the similarity score for
   *
   * @return float numerical representation of the similarity of the given submission to the other
   *    submission in this SubmissionComparison
   * @throws IllegalArgumentException
   */
  float getSimilarityScore(int id);

  /**
   * Sets the similarity score of the given submission in this SubmissionComparison
   *
   * @param score
   * @param id
   */
  void setSimilarityScore(int id, float score);

  /**
   * Returns a set of the two submission IDs of the submissions compared in this SubmissionComparison
   *
   * @return set of two submission IDs
   */
  Set<Integer> getSubmissions();

  /**
   * Sets the similarity score of the second submission in this SubmissionComparison
   * submission in this SubmissionComparison
   *
   * @param score
   */
  //void setSimilarityScoreSub2(float score);

}
