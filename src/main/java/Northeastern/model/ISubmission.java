package Northeastern.model;

import java.io.File;
import java.util.HashMap;
import java.util.List;

/**
 * A submission (any number of files uploaded as one submission)
 */
public interface ISubmission {

  /**
   * Returns the ID of this submission
   *
   * @return int ID of submission
   */
  int getID();

  /**
   * Returns the file this submission represents
   *
   * @return file
   */
  File getFile();

}
