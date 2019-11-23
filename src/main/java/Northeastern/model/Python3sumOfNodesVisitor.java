package Northeastern.model;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import Python.Python3BaseVisitor;
import Python.Python3Parser;

public class Python3sumOfNodesVisitor extends Python3BaseVisitor<Integer>{

  private int numSubNodes;

  /**
   * constructor for a visitor that counts the number of subnodes of the accepting node and returns
   * the accepting node's hashvalue
   */
  public Python3sumOfNodesVisitor() {
    this.numSubNodes = 0;
  }

  /**
   * returns the number of sub nodes of the node this visitor was initially called on
   */
  public int returnNumSubNode() {
    return numSubNodes;
  }

  /**
   * temporary version of hash calculation that uses dynamic dispatch to return the hash of the node
   * this visit was called on
   * @return
   */
  // TODO: How do we create a good hash?
  private Integer getHash(ParserRuleContext ctx) {
    numSubNodes++;
    return ctx.getRuleIndex() + visitChildren(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitSingle_input(Python3Parser.Single_inputContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitFile_input(Python3Parser.File_inputContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitEval_input(Python3Parser.Eval_inputContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitDecorator(Python3Parser.DecoratorContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitDecorators(Python3Parser.DecoratorsContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitDecorated(Python3Parser.DecoratedContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitAsync_funcdef(Python3Parser.Async_funcdefContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitFuncdef(Python3Parser.FuncdefContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitParameters(Python3Parser.ParametersContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitTypedargslist(Python3Parser.TypedargslistContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitTfpdef(Python3Parser.TfpdefContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitVarargslist(Python3Parser.VarargslistContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitVfpdef(Python3Parser.VfpdefContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitStmt(Python3Parser.StmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitSimple_stmt(Python3Parser.Simple_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitSmall_stmt(Python3Parser.Small_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitExpr_stmt(Python3Parser.Expr_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitAnnassign(Python3Parser.AnnassignContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitAugassign(Python3Parser.AugassignContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitDel_stmt(Python3Parser.Del_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitPass_stmt(Python3Parser.Pass_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitFlow_stmt(Python3Parser.Flow_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitBreak_stmt(Python3Parser.Break_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitContinue_stmt(Python3Parser.Continue_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitReturn_stmt(Python3Parser.Return_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitYield_stmt(Python3Parser.Yield_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitRaise_stmt(Python3Parser.Raise_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitImport_stmt(Python3Parser.Import_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitImport_name(Python3Parser.Import_nameContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitImport_from(Python3Parser.Import_fromContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitImport_as_name(Python3Parser.Import_as_nameContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitImport_as_names(Python3Parser.Import_as_namesContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitDotted_name(Python3Parser.Dotted_nameContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitGlobal_stmt(Python3Parser.Global_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitAssert_stmt(Python3Parser.Assert_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitCompound_stmt(Python3Parser.Compound_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitAsync_stmt(Python3Parser.Async_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitIf_stmt(Python3Parser.If_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitWhile_stmt(Python3Parser.While_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitFor_stmt(Python3Parser.For_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitTry_stmt(Python3Parser.Try_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitWith_stmt(Python3Parser.With_stmtContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitWith_item(Python3Parser.With_itemContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitExcept_clause(Python3Parser.Except_clauseContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitSuite(Python3Parser.SuiteContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitTest(Python3Parser.TestContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitTest_nocond(Python3Parser.Test_nocondContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitLambdef(Python3Parser.LambdefContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitOr_test(Python3Parser.Or_testContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitAnd_test(Python3Parser.And_testContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitNot_test(Python3Parser.Not_testContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitComparison(Python3Parser.ComparisonContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitComp_op(Python3Parser.Comp_opContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitStar_expr(Python3Parser.Star_exprContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitExpr(Python3Parser.ExprContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitXor_expr(Python3Parser.Xor_exprContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitAnd_expr(Python3Parser.And_exprContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitShift_expr(Python3Parser.Shift_exprContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitArith_expr(Python3Parser.Arith_exprContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitTerm(Python3Parser.TermContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitFactor(Python3Parser.FactorContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitPower(Python3Parser.PowerContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitAtom_expr(Python3Parser.Atom_exprContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitAtom(Python3Parser.AtomContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitTestlist_comp(Python3Parser.Testlist_compContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitTrailer(Python3Parser.TrailerContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitSubscriptlist(Python3Parser.SubscriptlistContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitSubscript(Python3Parser.SubscriptContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitSliceop(Python3Parser.SliceopContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitExprlist(Python3Parser.ExprlistContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitTestlist(Python3Parser.TestlistContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitClassdef(Python3Parser.ClassdefContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitArglist(Python3Parser.ArglistContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitArgument(Python3Parser.ArgumentContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitComp_iter(Python3Parser.Comp_iterContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitComp_for(Python3Parser.Comp_forContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitComp_if(Python3Parser.Comp_ifContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitEncoding_decl(Python3Parser.Encoding_declContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitYield_expr(Python3Parser.Yield_exprContext ctx) {
    return getHash(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Integer visitYield_arg(Python3Parser.Yield_argContext ctx) {
    return getHash(ctx);
  }

  @Override
  public Integer visitTerminal(TerminalNode node){
    //TODO could make this a different number, maybe dependent on terminal node type.
    return 1;
  }
}
