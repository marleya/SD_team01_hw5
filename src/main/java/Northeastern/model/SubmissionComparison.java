package Northeastern.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A comparison of two (@code Submission)s to determine their similarity / potential plagarized
 * content
 */
public class SubmissionComparison implements ISubmissionComparison {
  //map submission ids to the similarity score for that submission
  private Map<Integer, Float> similarityScores;
  //TODO also need to store other data like the list of nodes that are similar
  //private List<DataType> similarNodes;

  /**
   * SubmissionComparison constructor
   */
  public SubmissionComparison(ISubmission sub1, ISubmission sub2) {
    similarityScores = new HashMap<>();
    //TODO in constructor call make similarity score method and then instead of null, get rid of
    //"getSimilarityScore" method and instead use hashmap to get the scores
    similarityScores.put(sub1.getID(), null);
    similarityScores.put(sub2.getID(), null);

  }

  /**
   * Returns a numerical representation of the similarity of the given submission to the other
   * submission in this SubmissionComparison
   *
   * @param submissionID name of the submission you want to see the similarity score of
   *
   * @return float numerical representation of the similarity of the given submission to the other
   * submission in this SubmissionComparison
   * @throws IllegalArgumentException
   */
  @Override
  public float getSimilarityScore(int submissionID) {
    for (int s : similarityScores.keySet()) {
      if(s == submissionID) {
        return similarityScores.get(s);
      }
    }
    throw new IllegalArgumentException("The submission whose score you're looking for is not" +
            "a part of this comparison.");
  }

  /**
   * Sets the similarity score of the first submission in this SubmissionComparison submission in
   * this SubmissionComparison
   *
   * @param score
   */
  @Override
  public void setSimilarityScore(int id, float score) {
    for (int s : similarityScores.keySet()) {
      if(s == id) {
        similarityScores.put(s, score);
      } else {
        throw new IllegalArgumentException("The submission whose score you're looking to set is not"
                + "a part of this comparison.");
      }
    }
  }

  /**
   * Returns the submission IDs of the submissions compared in this SubmissionComparison
   *
   * @return set of two submission IDs
   */
  @Override
  public Set<Integer> getSubmissions() {
    return this.similarityScores.keySet();
  }
}
