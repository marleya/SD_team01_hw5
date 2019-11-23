package Northeastern.controller;

/**
 * This interface represents all methods that a features implementation is expected to support.
 * A private controller implementation is typically utilized by a controller, in between a model
 * and a view.
 */
public interface IController {

  /**
   * Opens the Jfilechooser window to access and load a local stored project. Upon selecting an
   * project, the project is stored in the Model, and the view is updated to display the new upload.
   */
  void loadSubmission();

  /**
   * Allows the user to choose two loaded submissions and compare their similarity.
   *
   * @param sub1
   * @param sub2
   */
  void compareSubmissions(int sub1, int sub2);

  /**
   * Allow the user to remove uploaded submissions.
   */
  void deleteSubmission(String submissionName);

  /**
   * Undoes the most recent operation performed, and updates the view. If there
   * is no operation to undo, an error pops up.
   */
  void undo();
}
