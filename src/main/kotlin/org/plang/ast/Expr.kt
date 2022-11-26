package org.plang.ast

import org.plang.PLangContext

class Expr(
    private val left: AST,
    private val right: AST,
    private val op: String
) : AST() {

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
        }
        return Unit
    }

}