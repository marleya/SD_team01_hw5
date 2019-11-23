package Northeastern.model;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedList;

import Python.Python3Listener;
import Python.Python3Parser;

public class Python3sumOfNodesListener implements Python3Listener {

  private HashMap<Integer, LinkedList<Integer>> hashtable;
  //TODO this will need to store the source code location in the Hashtable along with the hashvalue

  /**
   * constructor for a listener that logs the number of subnodes and hashvalue of each node in the
   * AST
   */
  public Python3sumOfNodesListener() {
    this.hashtable = new HashMap<>();
  }

  public HashMap getHashtable() {
    return this.hashtable;
  }

  private void enterNode(ParserRuleContext ctx) {

    //TODO not sure if this is all the criteria that fits filtering nodes to map ParseTree -> AST
    boolean toBeIgnored =  false;

    // ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;

    // If the node is of interest.
    if (!toBeIgnored) {
      Python3sumOfNodesVisitor visitor = new Python3sumOfNodesVisitor();
      Integer hashvalue = ctx.accept(visitor);
      int hashloc = visitor.returnNumSubNode();

      // if this is the first time we get this subnode amount
      if (!(hashtable.containsKey(hashloc))) {
        // Create new linked list to put in the map.
        LinkedList<Integer> list = new LinkedList<Integer>();
        // Add the hash to the new list
        list.add(hashvalue);
        // Put both in the table.
        hashtable.put(hashloc, list);
      } else {
        // Get linkedlist, append value at end
        hashtable.get(hashloc).add(hashvalue);
      }
    }
  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#single_input}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterSingle_input(Python3Parser.Single_inputContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#single_input}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitSingle_input(Python3Parser.Single_inputContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#file_input}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterFile_input(Python3Parser.File_inputContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#file_input}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitFile_input(Python3Parser.File_inputContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#eval_input}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterEval_input(Python3Parser.Eval_inputContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#eval_input}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitEval_input(Python3Parser.Eval_inputContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#decorator}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterDecorator(Python3Parser.DecoratorContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#decorator}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitDecorator(Python3Parser.DecoratorContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#decorators}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterDecorators(Python3Parser.DecoratorsContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#decorators}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitDecorators(Python3Parser.DecoratorsContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#decorated}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterDecorated(Python3Parser.DecoratedContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#decorated}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitDecorated(Python3Parser.DecoratedContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#async_funcdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterAsync_funcdef(Python3Parser.Async_funcdefContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#async_funcdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitAsync_funcdef(Python3Parser.Async_funcdefContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#funcdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterFuncdef(Python3Parser.FuncdefContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#funcdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitFuncdef(Python3Parser.FuncdefContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#parameters}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterParameters(Python3Parser.ParametersContext ctx) {

    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#parameters}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitParameters(Python3Parser.ParametersContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#typedargslist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterTypedargslist(Python3Parser.TypedargslistContext ctx) {
    enterNode(ctx);

  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#typedargslist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitTypedargslist(Python3Parser.TypedargslistContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#tfpdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterTfpdef(Python3Parser.TfpdefContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#tfpdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitTfpdef(Python3Parser.TfpdefContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#varargslist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterVarargslist(Python3Parser.VarargslistContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#varargslist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitVarargslist(Python3Parser.VarargslistContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#vfpdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterVfpdef(Python3Parser.VfpdefContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#vfpdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitVfpdef(Python3Parser.VfpdefContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterStmt(Python3Parser.StmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitStmt(Python3Parser.StmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#simple_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterSimple_stmt(Python3Parser.Simple_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#simple_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitSimple_stmt(Python3Parser.Simple_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#small_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterSmall_stmt(Python3Parser.Small_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#small_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitSmall_stmt(Python3Parser.Small_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#expr_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#expr_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitExpr_stmt(Python3Parser.Expr_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#annassign}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterAnnassign(Python3Parser.AnnassignContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#annassign}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitAnnassign(Python3Parser.AnnassignContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#testlist_star_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#testlist_star_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#augassign}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterAugassign(Python3Parser.AugassignContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#augassign}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitAugassign(Python3Parser.AugassignContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#del_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterDel_stmt(Python3Parser.Del_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#del_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitDel_stmt(Python3Parser.Del_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#pass_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterPass_stmt(Python3Parser.Pass_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#pass_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitPass_stmt(Python3Parser.Pass_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#flow_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterFlow_stmt(Python3Parser.Flow_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#flow_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitFlow_stmt(Python3Parser.Flow_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#break_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterBreak_stmt(Python3Parser.Break_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#break_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitBreak_stmt(Python3Parser.Break_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#continue_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterContinue_stmt(Python3Parser.Continue_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#continue_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitContinue_stmt(Python3Parser.Continue_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#return_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterReturn_stmt(Python3Parser.Return_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#return_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitReturn_stmt(Python3Parser.Return_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#yield_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterYield_stmt(Python3Parser.Yield_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#yield_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitYield_stmt(Python3Parser.Yield_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#raise_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterRaise_stmt(Python3Parser.Raise_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#raise_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitRaise_stmt(Python3Parser.Raise_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#import_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterImport_stmt(Python3Parser.Import_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#import_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitImport_stmt(Python3Parser.Import_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#import_name}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterImport_name(Python3Parser.Import_nameContext ctx) {

    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#import_name}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitImport_name(Python3Parser.Import_nameContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#import_from}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterImport_from(Python3Parser.Import_fromContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#import_from}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitImport_from(Python3Parser.Import_fromContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#import_as_name}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterImport_as_name(Python3Parser.Import_as_nameContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#import_as_name}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitImport_as_name(Python3Parser.Import_as_nameContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#dotted_as_name}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterDotted_as_name(Python3Parser.Dotted_as_nameContext ctx) {

    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#dotted_as_name}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#import_as_names}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterImport_as_names(Python3Parser.Import_as_namesContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#import_as_names}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitImport_as_names(Python3Parser.Import_as_namesContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#dotted_as_names}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterDotted_as_names(Python3Parser.Dotted_as_namesContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#dotted_as_names}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#dotted_name}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterDotted_name(Python3Parser.Dotted_nameContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#dotted_name}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitDotted_name(Python3Parser.Dotted_nameContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#global_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterGlobal_stmt(Python3Parser.Global_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#global_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitGlobal_stmt(Python3Parser.Global_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#nonlocal_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#nonlocal_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#assert_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterAssert_stmt(Python3Parser.Assert_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#assert_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitAssert_stmt(Python3Parser.Assert_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#compound_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterCompound_stmt(Python3Parser.Compound_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#compound_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitCompound_stmt(Python3Parser.Compound_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#async_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterAsync_stmt(Python3Parser.Async_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#async_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitAsync_stmt(Python3Parser.Async_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#if_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterIf_stmt(Python3Parser.If_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#if_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitIf_stmt(Python3Parser.If_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#while_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterWhile_stmt(Python3Parser.While_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#while_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitWhile_stmt(Python3Parser.While_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#for_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterFor_stmt(Python3Parser.For_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#for_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitFor_stmt(Python3Parser.For_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#try_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterTry_stmt(Python3Parser.Try_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#try_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitTry_stmt(Python3Parser.Try_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#with_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterWith_stmt(Python3Parser.With_stmtContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#with_stmt}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitWith_stmt(Python3Parser.With_stmtContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#with_item}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterWith_item(Python3Parser.With_itemContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#with_item}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitWith_item(Python3Parser.With_itemContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#except_clause}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterExcept_clause(Python3Parser.Except_clauseContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#except_clause}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitExcept_clause(Python3Parser.Except_clauseContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#suite}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterSuite(Python3Parser.SuiteContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#suite}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitSuite(Python3Parser.SuiteContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#test}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterTest(Python3Parser.TestContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#test}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitTest(Python3Parser.TestContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#test_nocond}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterTest_nocond(Python3Parser.Test_nocondContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#test_nocond}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitTest_nocond(Python3Parser.Test_nocondContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#lambdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterLambdef(Python3Parser.LambdefContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#lambdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitLambdef(Python3Parser.LambdefContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#lambdef_nocond}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#lambdef_nocond}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#or_test}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterOr_test(Python3Parser.Or_testContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#or_test}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitOr_test(Python3Parser.Or_testContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#and_test}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterAnd_test(Python3Parser.And_testContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#and_test}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitAnd_test(Python3Parser.And_testContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#not_test}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterNot_test(Python3Parser.Not_testContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#not_test}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitNot_test(Python3Parser.Not_testContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#comparison}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterComparison(Python3Parser.ComparisonContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#comparison}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitComparison(Python3Parser.ComparisonContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#comp_op}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterComp_op(Python3Parser.Comp_opContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#comp_op}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitComp_op(Python3Parser.Comp_opContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#star_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterStar_expr(Python3Parser.Star_exprContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#star_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitStar_expr(Python3Parser.Star_exprContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterExpr(Python3Parser.ExprContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitExpr(Python3Parser.ExprContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#xor_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterXor_expr(Python3Parser.Xor_exprContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#xor_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitXor_expr(Python3Parser.Xor_exprContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#and_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterAnd_expr(Python3Parser.And_exprContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#and_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitAnd_expr(Python3Parser.And_exprContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#shift_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterShift_expr(Python3Parser.Shift_exprContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#shift_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitShift_expr(Python3Parser.Shift_exprContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#arith_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterArith_expr(Python3Parser.Arith_exprContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#arith_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitArith_expr(Python3Parser.Arith_exprContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#term}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterTerm(Python3Parser.TermContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#term}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitTerm(Python3Parser.TermContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#factor}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterFactor(Python3Parser.FactorContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#factor}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitFactor(Python3Parser.FactorContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#power}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterPower(Python3Parser.PowerContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#power}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitPower(Python3Parser.PowerContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#atom_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterAtom_expr(Python3Parser.Atom_exprContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#atom_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitAtom_expr(Python3Parser.Atom_exprContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#atom}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterAtom(Python3Parser.AtomContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#atom}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitAtom(Python3Parser.AtomContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#testlist_comp}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterTestlist_comp(Python3Parser.Testlist_compContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#testlist_comp}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitTestlist_comp(Python3Parser.Testlist_compContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#trailer}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterTrailer(Python3Parser.TrailerContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#trailer}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitTrailer(Python3Parser.TrailerContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#subscriptlist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterSubscriptlist(Python3Parser.SubscriptlistContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#subscriptlist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitSubscriptlist(Python3Parser.SubscriptlistContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#subscript}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterSubscript(Python3Parser.SubscriptContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#subscript}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitSubscript(Python3Parser.SubscriptContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#sliceop}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterSliceop(Python3Parser.SliceopContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#sliceop}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitSliceop(Python3Parser.SliceopContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#exprlist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterExprlist(Python3Parser.ExprlistContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#exprlist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitExprlist(Python3Parser.ExprlistContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#testlist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterTestlist(Python3Parser.TestlistContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#testlist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitTestlist(Python3Parser.TestlistContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#dictorsetmaker}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterDictorsetmaker(Python3Parser.DictorsetmakerContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#dictorsetmaker}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#classdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterClassdef(Python3Parser.ClassdefContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#classdef}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitClassdef(Python3Parser.ClassdefContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#arglist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterArglist(Python3Parser.ArglistContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#arglist}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitArglist(Python3Parser.ArglistContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#argument}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterArgument(Python3Parser.ArgumentContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#argument}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitArgument(Python3Parser.ArgumentContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#comp_iter}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterComp_iter(Python3Parser.Comp_iterContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#comp_iter}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitComp_iter(Python3Parser.Comp_iterContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#comp_for}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterComp_for(Python3Parser.Comp_forContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#comp_for}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitComp_for(Python3Parser.Comp_forContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#comp_if}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterComp_if(Python3Parser.Comp_ifContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#comp_if}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitComp_if(Python3Parser.Comp_ifContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#encoding_decl}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterEncoding_decl(Python3Parser.Encoding_declContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#encoding_decl}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitEncoding_decl(Python3Parser.Encoding_declContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#yield_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterYield_expr(Python3Parser.Yield_exprContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#yield_expr}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitYield_expr(Python3Parser.Yield_exprContext ctx) {

  }

  /**
   * Enter a parse tree produced by {@link Python3Parser#yield_arg}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void enterYield_arg(Python3Parser.Yield_argContext ctx) {
    enterNode(ctx);
  }

  /**
   * Exit a parse tree produced by {@link Python3Parser#yield_arg}.
   *
   * @param ctx the parse tree
   */
  @Override
  public void exitYield_arg(Python3Parser.Yield_argContext ctx) {

  }

  @Override
  public void visitTerminal(TerminalNode node) {
  }

  @Override
  public void visitErrorNode(ErrorNode node) {

  }

  @Override
  public void enterEveryRule(ParserRuleContext ctx) {

  }

  @Override
  public void exitEveryRule(ParserRuleContext ctx) {

  }

 /* @Override
  public void visitTerminal(TerminalNode node) {
    String values = node.getParent().toString();
    String newValues = values.substring(1,values.length()-1);
    String[] stringArray = newValues.split(" ");
    for(String s : stringArray) {
      if(s.length() > 0) {
        hashValue += Integer.parseInt(s);
      }
    }

    System.out.println(hashValue);

//    System.out.println("Node: " + node.toString() + " has " + node.getChildCount() + " children, parent is: " + node.getParent().toString());
//    if (!(node.getText().equals("<EOF>"))) {
//      System.out.println(node.getText());
//      nodeCount++;
//    }
  }

//  getNodeCount() {
//    return this.nodeCount;
//  }*/

}
