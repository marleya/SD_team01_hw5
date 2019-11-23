package Northeastern.model;

import org.antlr.v4.runtime.ParserRuleContext;

import Python.Python3BaseVisitor;
import Python.Python3Parser;

public class Python3TrimmedHashVisitor extends Python3BaseVisitor<String> {
  private int numSubNodes;

  //Code that will live in the listener that calls this class:

  // Python3GetHasVistor visitor = new Python3GetHashVisitor();
  // int hashvalue = rootnode.accept(visitor).hashcode();
  // int hashspot = visitor.returnNumSubNode();
  // have logic that adds the hashvalue at the hashspot in an array that is initialized at the start
  //of the listener

  /**
   * constructor for a visitor that counts the number of subnodes of the accepting node and returns
   * the accepting node's hashvalue
   */
  public Python3TrimmedHashVisitor() {
    this.numSubNodes = 0;
  }

  /**
   * returns the number of sub nodes of the node this visitor was initially called on
   */
  public int returnNumSubNode() {
    return numSubNodes;
  }

  /**
   * returns the hash value of the node this visitor was initially called on
   */

  /**
   * temporary version of hash calculation that uses dynamic dispatch to return the hash of the
   * node this visit was called on
   */
  private String getHash(ParserRuleContext ctx) {

    numSubNodes++;
    return ctx.toString() + visitChildren(ctx); }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitSingle_input(Python3Parser.Single_inputContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitFile_input(Python3Parser.File_inputContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitEval_input(Python3Parser.Eval_inputContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitDecorator(Python3Parser.DecoratorContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitDecorators(Python3Parser.DecoratorsContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitDecorated(Python3Parser.DecoratedContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitAsync_funcdef(Python3Parser.Async_funcdefContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitFuncdef(Python3Parser.FuncdefContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitParameters(Python3Parser.ParametersContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitTypedargslist(Python3Parser.TypedargslistContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitTfpdef(Python3Parser.TfpdefContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitVarargslist(Python3Parser.VarargslistContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitVfpdef(Python3Parser.VfpdefContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitStmt(Python3Parser.StmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitSimple_stmt(Python3Parser.Simple_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitSmall_stmt(Python3Parser.Small_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitExpr_stmt(Python3Parser.Expr_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitAnnassign(Python3Parser.AnnassignContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitAugassign(Python3Parser.AugassignContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitDel_stmt(Python3Parser.Del_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitPass_stmt(Python3Parser.Pass_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitFlow_stmt(Python3Parser.Flow_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitBreak_stmt(Python3Parser.Break_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitContinue_stmt(Python3Parser.Continue_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitReturn_stmt(Python3Parser.Return_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitYield_stmt(Python3Parser.Yield_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitRaise_stmt(Python3Parser.Raise_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitImport_stmt(Python3Parser.Import_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitImport_name(Python3Parser.Import_nameContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitImport_from(Python3Parser.Import_fromContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitImport_as_name(Python3Parser.Import_as_nameContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitImport_as_names(Python3Parser.Import_as_namesContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitDotted_name(Python3Parser.Dotted_nameContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitGlobal_stmt(Python3Parser.Global_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitAssert_stmt(Python3Parser.Assert_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitCompound_stmt(Python3Parser.Compound_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitAsync_stmt(Python3Parser.Async_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitIf_stmt(Python3Parser.If_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitWhile_stmt(Python3Parser.While_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitFor_stmt(Python3Parser.For_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitTry_stmt(Python3Parser.Try_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitWith_stmt(Python3Parser.With_stmtContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitWith_item(Python3Parser.With_itemContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitExcept_clause(Python3Parser.Except_clauseContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitSuite(Python3Parser.SuiteContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitTest(Python3Parser.TestContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitTest_nocond(Python3Parser.Test_nocondContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitLambdef(Python3Parser.LambdefContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitOr_test(Python3Parser.Or_testContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitAnd_test(Python3Parser.And_testContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitNot_test(Python3Parser.Not_testContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitComparison(Python3Parser.ComparisonContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitComp_op(Python3Parser.Comp_opContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitStar_expr(Python3Parser.Star_exprContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitExpr(Python3Parser.ExprContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitXor_expr(Python3Parser.Xor_exprContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitAnd_expr(Python3Parser.And_exprContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitShift_expr(Python3Parser.Shift_exprContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitArith_expr(Python3Parser.Arith_exprContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitTerm(Python3Parser.TermContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitFactor(Python3Parser.FactorContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitPower(Python3Parser.PowerContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitAtom_expr(Python3Parser.Atom_exprContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitAtom(Python3Parser.AtomContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitTestlist_comp(Python3Parser.Testlist_compContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitTrailer(Python3Parser.TrailerContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitSubscriptlist(Python3Parser.SubscriptlistContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitSubscript(Python3Parser.SubscriptContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitSliceop(Python3Parser.SliceopContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitExprlist(Python3Parser.ExprlistContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitTestlist(Python3Parser.TestlistContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitClassdef(Python3Parser.ClassdefContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitArglist(Python3Parser.ArglistContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitArgument(Python3Parser.ArgumentContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitComp_iter(Python3Parser.Comp_iterContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitComp_for(Python3Parser.Comp_forContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitComp_if(Python3Parser.Comp_ifContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitEncoding_decl(Python3Parser.Encoding_declContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitYield_expr(Python3Parser.Yield_exprContext ctx) { return getHash(ctx); }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public String visitYield_arg(Python3Parser.Yield_argContext ctx) { return getHash(ctx); }

}
