package Northeastern.model;

import java.io.File;

/**
 * A submission (any number of file uploaded as one submission)
 */
public class Submission implements ISubmission {
  private File file;
  private int id;

  /**
   * Submission constructor
   */
  //TODO ensure that instead of keeping File we have a single representation of the whole project
  //which might consist of multiple files
  public Submission(int id, File file) {
    this.id = id;
    this.file = file;
  }

  /**
   * Returns the ID of this submission
   *
   * @return int ID of submission
   */
  @Override
  public int getID() {
    return this.id;
  }

  /**
   * Returns the file this submission represents
   *
   * @return file
   */
  @Override
  public File getFile() {
    return this.file;
  }
}
