// Generated from java-escape by ANTLR 4.11.1
package org.plang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLangParser}.
 */
public interface PLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#funcBlock}.
	 * @param ctx the parse tree
	 */
	void enterFuncBlock(PLangParser.FuncBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#funcBlock}.
	 * @param ctx the parse tree
	 */
	void exitFuncBlock(PLangParser.FuncBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(PLangParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(PLangParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PLangParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PLangParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PLangParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PLangParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(PLangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(PLangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PLangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PLangParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#newVariableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterNewVariableAssignment(PLangParser.NewVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#newVariableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitNewVariableAssignment(PLangParser.NewVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(PLangParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(PLangParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(PLangParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(PLangParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(PLangParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(PLangParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(PLangParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(PLangParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(PLangParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(PLangParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PLangParser.ExprContext ctx);
}