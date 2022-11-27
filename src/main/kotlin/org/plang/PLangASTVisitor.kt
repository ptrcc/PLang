package org.plang

import org.plang.ast.*
import org.plang.ast.Number
import org.plang.ast.if_ast.Else
import org.plang.ast.if_ast.ElseIf
import org.plang.ast.if_ast.If


class PLangASTVisitor : PLangBaseVisitor<List<AST>>() {

    override fun visitBlock(ctx: PLangParser.BlockContext): List<AST> {
        val asts = mutableListOf<AST>()
        for (statement in ctx.statement()) {
            val visited = visit(statement)
            if (visited != null) {
                asts.addAll(visited)
            } else {
                println("Ignored statement: $statement of type ${statement.javaClass}")
            }
        }
        return asts
    }

    override fun visitFuncBlock(ctx: PLangParser.FuncBlockContext?): List<AST> {
        return visit(ctx!!.block())
    }

    override fun visitProgram(ctx: PLangParser.ProgramContext): List<AST> {
        return visit(ctx.block())
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
        return if (ctx!!.children.count() == 1) {
            ctx.children.map { visit(it) }.flatten()   // just one literal e.g. "string", 1108
        } else if (ctx.nested != null) {
            visit(ctx.nested)                          // nested expression e.g. (3 + 4)
        } else {
            val left = visit(ctx.left)[0]              // other expressions e.g. abc + 12
            val right = visit(ctx.right)[0]
            listOf(Expr(left, right, ctx.op.text))
        }
    }

    override fun visitId(ctx: PLangParser.IdContext?): List<AST> {
        return listOf(ID(ctx!!.text))
    }

    override fun visitVariable(ctx: PLangParser.VariableContext?): List<AST> {
        return listOf(Variable(ctx!!.id().text))
    }

    override fun visitNewVariableAssignment(ctx: PLangParser.NewVariableAssignmentContext?): List<AST> {
        val value = visit(ctx!!.expr())[0]
        return listOf(Variable(ctx.id().text, value))
    }

    override fun visitVariableAssignment(ctx: PLangParser.VariableAssignmentContext?): List<AST> {
        val value = visit(ctx!!.expr())[0]
        return listOf(Variable(ctx.id().text, value))
    }

    override fun visitFunctionCall(ctx: PLangParser.FunctionCallContext?): List<AST> {
        val args = ctx!!.expr().map { visit(it)[0] }
        return listOf(FunctionCall(ctx.id().text, args))
    }

    override fun visitIf_(ctx: PLangParser.If_Context?): List<AST> {
        val condition = visit(ctx!!.expr())[0]
        val asts = visit(ctx.funcBlock())
        val else_ = if (ctx.else_() != null) super.visitElse_(ctx.else_()) else null
        val elseIf = if (ctx.elseIf() != null) ctx.elseIf().map { visit(it) }.flatten() else null
        return listOf(If(condition, asts, elseIf, else_))
    }

    override fun visitElseIf(ctx: PLangParser.ElseIfContext?): List<AST> {
        val condition = visit(ctx!!.expr())[0]
        val asts = visit(ctx.funcBlock())
        return listOf(ElseIf(condition, asts))
    }

    override fun visitElse_(ctx: PLangParser.Else_Context?): List<AST> {
        val asts = visit(ctx!!.funcBlock())
        return listOf(Else(asts))
    }

    override fun visitLoop(ctx: PLangParser.LoopContext?): List<AST> {
        val asts = visit(ctx!!.funcBlock())
        val condition = visit(ctx.expr())[0]
        return listOf(Loop(condition, asts))
    }

}