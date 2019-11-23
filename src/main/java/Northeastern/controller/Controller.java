package Northeastern.controller;

import java.io.File;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import Northeastern.model.ASTCC;
import Northeastern.model.IModel;
import Northeastern.model.Model;
import Northeastern.view.IView;


/**
 * This class represents a controller. A controller contains a model and a view, controls the flow
 * of data into the model, and determines what operations to perform when. The controller also
 * updates the view whenever there is a change of data.
 */
public class Controller implements IController {
  private IModel model;
  private IView view;

  /**
   * Constructs a controller object, creates instance variables for a
   * model and a view, and instantiates a IController implementation class for
   * abstraction purposes.
   */
  public Controller(IModel model, IView view) {
    this.model = new Model(new ASTCC());
    this.view = view;
    //view.setFeatures(new PrivateController(model, view));
  }


    /**
     * Opens the Jfilechooser window to access and load a local stored image. Upon selecting an
     * image, the image is stored in the Model, and the view is updated to display the new image.
     */
    //TODO ensure that instead of keeping File we have a single representation of the whole project
    //which might consist of multiple files
    @Override
    public void loadSubmission() {
      final JFileChooser fileChooser = new JFileChooser(".");

      FileNameExtensionFilter filter = new FileNameExtensionFilter(
              "JavaScript or Python projects only", "js", "py");
      fileChooser.setFileFilter(filter);

//    int returnValue = fileChooser.showOpenDialog(view);
//    if (returnValue == JFileChooser.APPROVE_OPTION) {
      File file = fileChooser.getSelectedFile();
      model.addSubmission(file); //TODO
//      updateDisplay();
//      view.setAllInvisible();
//    }
      //TODO change view accordingly
    }

    /**
     * Allows the user to choose two loaded submissions and compare their similarity.
     *
     * @param sub1 name of submission 1
     * @param sub2 name of submission 2
     */
    @Override
    public void compareSubmissions(int sub1, int sub2) {
      //TODO how/where do we handle whether those are already uploaded submissions? view should
      //handle this but model should also have a safety handling of this faulty input
      model.compareTwoFiles(sub1, sub2).getSimilarityScore(sub1);
      model.compareTwoFiles(sub1, sub2).getSimilarityScore(sub2);
      //TODO change the view accordingly: must call additional get comparison on model
    }

    /**
     * Allow the user to remove uploaded submissions.
     */
    @Override
    public void deleteSubmission(String submissionName) {
      //TODO
    }

    /**
     * Undoes the most recent operation performed, and updates the view. If there is no operation to
     * undo, an error pops up.
     */
    @Override
    public void undo() {
      //TODO
    }
  }

