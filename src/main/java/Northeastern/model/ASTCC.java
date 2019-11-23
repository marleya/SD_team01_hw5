package Northeastern.model;

import Python.Python3Lexer;
import Python.Python3Parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import static org.antlr.v4.runtime.CharStreams.fromPath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * A strategy for detecting plagiarism between two {@code Submission}s: this strategy involves
 * applying the Abstract Syntax Tree Code Comparison (ASTCC) algorithm to two projects to
 * determine the code in each project that is potentially plagiarized.
 * TODO link to the ASTCC algo paper here
 */
public class ASTCC implements IPlagiarismDetectionAlgorithm{

  /**
   * Constructor for the ASTCC strategy for plagiarism detection
   */
  public ASTCC() { }

  /**
   * Compares the two given submissions and returns a {@code SubmissionComparison} object
   * representing the potential plagiarism or lack thereof between the two submissions
   *
   * @param sub1 first submission to compare
   * @param sub2 second submission to compare
   *
   * @return SubmissionComparison
   */
  @Override
  public ISubmissionComparison getSubmissionComparison(ISubmission sub1, ISubmission sub2) {
    ISubmissionComparison comparison = new SubmissionComparison(sub1, sub2);
    //create hashMap for each submission
    Map map1 = getHashMap(sub1);
    Map map2 = getHashMap(sub2);
    //TODO compare hashMaps of two submissions to build array of similar nodes
    //TODO determine similarity score for each submission according to the array of its similar nodes
    //TODO store similarity scores in SubmissionComparison object
    return comparison;
  }

  /**
   * Returns HashMap of nodes in the AST representation of the given submission where the HashMap
   * keys are the number of child nodes of the given node and the values are that node's hashvalue
   * which is based on the hashvalue of all of its children
   *
   * @param sub
   *
   * @return HashMap representation of the given submission
   * @throws IllegalArgumentException if an invalid input file is given
   */
  private Map<Integer, List<Integer>> getHashMap(ISubmission sub) {
    try {
      CharStream cs = streamFromPath(sub.getFile());
      Python3Lexer lexer = new Python3Lexer(cs);  //instantiate a lexer
      CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
      Python3Parser parser = new Python3Parser(tokens);  //parse the tokens
      Python3Parser.File_inputContext tree = parser.file_input();
      Python3TrimmedHashListener listener = new Python3TrimmedHashListener();
      ParseTreeWalker walker = new ParseTreeWalker();

      walker.walk(listener, tree);
      return listener.getHashtable();

    } catch (IOException e) {
      throw new IllegalArgumentException("Bad file given");
    }
  }

  /**
   * Helper function to read files into ASTs
   *
   * @param f file being turned into a charstream
   * @throws IOException
   */
  private static CharStream streamFromPath(File f) throws IOException {
    try {
      CharStream stream = fromPath(f.toPath());
      return stream;
    } catch (IOException e) {
      System.out.println(e.getMessage());
      throw new IOException("This file path is wrong");
    }
  }
}
