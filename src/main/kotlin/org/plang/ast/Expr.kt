package org.plang.ast

import org.plang.PLangContext
import org.plang.api.AST

class Expr(
    private val left: AST,
    private val right: AST,
    private val op: String
) : AST {

    override fun evaluate(ctx: PLangContext): Any {
        when (op) {
            "+" -> return left.evaluate(ctx) as Double + right.evaluate(ctx) as Double
            "-" -> return left.evaluate(ctx) as Double - right.evaluate(ctx) as Double
            "*" -> return left.evaluate(ctx) as Double * right.evaluate(ctx) as Double
            "/" -> return left.evaluate(ctx) as Double / right.evaluate(ctx) as Double

            "==" -> return left.evaluate(ctx) == right.evaluate(ctx)
            "<>" -> return left.evaluate(ctx) != right.evaluate(ctx)
            ">" -> return left.evaluate(ctx) as Double > right.evaluate(ctx) as Double
            ">=" -> return left.evaluate(ctx) as Double >= right.evaluate(ctx) as Double
            "<" -> return (left.evaluate(ctx) as Double) < right.evaluate(ctx) as Double
            "<=" -> return left.evaluate(ctx) as Double <= right.evaluate(ctx) as Double

            "&&" -> return left.evaluate(ctx) as Boolean && right.evaluate(ctx) as Boolean
            "and" -> return left.evaluate(ctx) as Boolean && right.evaluate(ctx) as Boolean
            "||" -> return left.evaluate(ctx) as Boolean || right.evaluate(ctx) as Boolean
            "or" -> return left.evaluate(ctx) as Boolean && right.evaluate(ctx) as Boolean
        }
        return Unit
    }

}