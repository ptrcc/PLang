// Generated from java-escape by ANTLR 4.11.1
package org.plang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#funcBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBlock(PLangParser.FuncBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(PLangParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PLangParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(PLangParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(PLangParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PLangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#newVariableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewVariableAssignment(PLangParser.NewVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(PLangParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(PLangParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(PLangParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_(PLangParser.Else_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(PLangParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PLangParser.ExprContext ctx);
}