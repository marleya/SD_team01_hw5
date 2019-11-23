import Northeastern.controller.Controller;
import Northeastern.controller.IController;
import Northeastern.model.ASTCC;
import Northeastern.model.IModel;
import Northeastern.model.Model;
import Northeastern.view.IView;
import Northeastern.view.View;

public class Driver {

  public static void main(String[] args) {
    ASTCC algorithm;
    IModel model;
    IView view;
    IController controller;

    algorithm = new ASTCC();
    model = new Model(algorithm);
    view = new View("Plagiarism Detector");

    controller = new Controller(model, view);

  }

}
