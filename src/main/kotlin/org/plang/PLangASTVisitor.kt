package org.plang

import org.plang.ast.*
import org.plang.ast.Number


class PLangASTVisitor : PLangBaseVisitor<List<AST>>() {

    override fun visitProgram(ctx: PLangParser.ProgramContext): List<AST> {
        val statements = ctx.block().statement()
        val asts = mutableListOf<AST>()
        for (statement in statements) {
            val visited = visit(statement)
            if (visited != null) {
                asts.addAll(visited)
            } else {
                println("Ignored statement: $statement of type ${statement.javaClass}")
            }
        }
        return asts
    }

    override fun visitStringLiteral(ctx: PLangParser.StringLiteralContext?): List<AST> {
        return listOf(StringLiteral(ctx!!.text))
    }

    override fun visitNumber(ctx: PLangParser.NumberContext?): List<AST> {
        return listOf(Number(ctx!!.text))
    }

    override fun visitBool(ctx: PLangParser.BoolContext?): List<AST> {
        return listOf(Bool(ctx!!.text))
    }

    override fun visitExpr(ctx: PLangParser.ExprContext?): List<AST> {
        if (ctx!!.children.count() == 1) {
            return ctx.children.map { visit(it) }.flatten()
        }

        val left = visit(ctx.left)[0]
        val right = visit(ctx.right)[0]

        return listOf(Expr(left, right, ctx.op.text))
    }

    override fun visitId(ctx: PLangParser.IdContext?): List<AST> {
        return listOf(ID(ctx!!.text))
    }

    override fun visitVariable(ctx: PLangParser.VariableContext?): List<AST> {
        return listOf(Variable(ctx!!.id().text))
    }

    override fun visitNewVariableAssignment(ctx: PLangParser.NewVariableAssignmentContext?): List<AST> {
        val value = visit(ctx!!.expr())[0]
        return listOf(VariableAssignment(ctx.id().text, value))
    }

    override fun visitVariableAssignment(ctx: PLangParser.VariableAssignmentContext?): List<AST> {
        val value = visit(ctx!!.expr())[0]
        return listOf(VariableAssignment(ctx.id().text, value))
    }

    override fun visitFunctionCall(ctx: PLangParser.FunctionCallContext?): List<AST> {
        val args = ctx!!.expr().map { visit(it)[0] }
        return listOf(FunctionCall(ctx.id().text, args))
    }

}