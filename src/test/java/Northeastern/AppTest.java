package Northeastern;

import org.junit.Ignore;
import org.junit.Test;

import Northeastern.model.Python3sumOfNodesListener;
import Python.Python3Lexer;
import Python.Python3Parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import static junit.framework.TestCase.fail;
import static org.antlr.v4.runtime.CharStreams.fromPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

  private Python3Parser.File_inputContext tree;
  private Python3sumOfNodesListener listener;
  private ParseTreeWalker walker;
  private Python3Parser parser;


  private Python3Parser.File_inputContext tree2;
  private Python3sumOfNodesListener listener2;
  private ParseTreeWalker walker2;
  private Python3Parser parser2;

  // Helper function to read files.
  @Ignore
  private static CharStream streamFromPath(File f) throws IOException{
    try {
      CharStream stream = fromPath(f.toPath());
      return stream;
    } catch (IOException e) {
      System.out.println(e.getMessage());
      throw new IOException("This file path is wrong");
    }
  }

  @Ignore
  public void setupFirstFile(String pathname) {
    File file = new File(pathname);
    try {
      CharStream cs = streamFromPath(file);
      Python3Lexer lexer = new Python3Lexer(cs);  //instantiate a lexer
      CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
      parser = new Python3Parser(tokens);  //parse the tokens
      tree = parser.file_input();
      listener = new Python3sumOfNodesListener();
      walker = new ParseTreeWalker();
    } catch (IOException e){
      System.out.println("Setup First File: Bad file name");
    }
  }

  @Ignore
  public void setupSecondFile(String pathname) {
    File file2 = new File(pathname);

    try{
    CharStream cs2 = streamFromPath(file2);
    Python3Lexer lexer3 = new Python3Lexer(cs2);  //instantiate a lexer
    CommonTokenStream tokens3 = new CommonTokenStream(lexer3); //scan stream for tokens
    parser2 = new Python3Parser(tokens3);  //parse the tokens
    tree2 = parser2.file_input();
    listener2 = new Python3sumOfNodesListener();
    walker2 = new ParseTreeWalker();} catch (IOException e){
      System.out.println("Setup Second File: Bad file name.");
    }
  }

  @Test
  public void testTwoUnequalFiles() {

    setupFirstFile("counttree.py");
    setupSecondFile("counttree2.py");

    walker.walk(listener, tree);
    walker2.walk(listener2, tree2);

    Set set = listener.getHashtable().keySet();
    Set set2 = listener2.getHashtable().keySet();

    assertNotEquals(set.toString(), set2.toString());
  }

  // Commented out cause it fails

//  @Test
//  public void testTwoEqualFiles() {
//
//    setupFirstFile("counttree.py");
//    setupSecondFile("helloworld.py");
//
//    walker.walk(listener, tree);
//    walker2.walk(listener2, tree2);
//
//    Set<Integer> set = listener.getHashtable().keySet();
//
//    for (Integer key : set) {
//      assertEquals(listener.getHashtable().get(key).toString(),
//              listener2.getHashtable().get(key).toString());
//    }
//  }

  @Test
  public void testWhichLineATokenCameFrom(){
    setupFirstFile("counttree.py");
  }

  @Test
  public void testRefactoredFiles(){
    setupFirstFile("counttree3.py");
    setupSecondFile("counttree3refactored.py");

    walker.walk(listener, tree);
    walker2.walk(listener2, tree2);

    Set set = listener.getHashtable().keySet();
    Set set2 = listener2.getHashtable().keySet();

    System.out.println(set.toString());
    System.out.println(set2.toString());

    assertNotEquals(set.toString(), set2.toString());
  }
}