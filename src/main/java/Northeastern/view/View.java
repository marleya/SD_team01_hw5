package Northeastern.view;
import javax.swing.*;

import Northeastern.controller.IController;

public class View extends JFrame implements IView {

  private JPanel mainPanel;
  private JScrollPane mainScrollPane;

  private JMenuBar menuBar;
  private JMenu fileMenu;
  private JMenuItem loadMenuButton;

  public View(String caption) {
    super(caption);


    // Set up window
    setSize(800, 600);
    setLocation(100, 100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    // Set up main panel
    mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
    mainScrollPane = new JScrollPane(mainPanel);
    this.add(mainScrollPane);


    // Set up menu bar
    menuBar = new JMenuBar();
    fileMenu = new JMenu("File");


    // Set up menu items
    loadMenuButton = new JMenuItem("New Submission");


    // Add menu items to menu bar
    fileMenu.add(loadMenuButton);
    menuBar.add(fileMenu);
    this.setJMenuBar(menuBar);


    pack();
    setVisible(true);
  }

  void setActions(IController f) {
    loadMenuButton.addActionListener(l -> f.loadSubmission());
  }

}
