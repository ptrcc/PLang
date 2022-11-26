package org.plang.ast.if_ast

import org.plang.PLangContext
import org.plang.ast.AST

class If(
    private val condition: AST,
    private val statements: List<AST>,
    private val elseIf: List<AST>? = null,
    private val else_: List<AST>? = null
) : AST() {

    override fun evaluate(ctx: PLangContext) {
        if (condition.evaluate(ctx) as Boolean) {
            statements.forEach { it.evaluate(ctx) }
            return
        } else if (!elseIf.isNullOrEmpty()) {
            elseIf.forEach {
                if(it.evaluate(ctx) as Boolean) {
                    return
                }
            }
        }
        callElse(ctx)
    }

    private fun callElse(ctx: PLangContext) {
        else_?.forEach { it.evaluate(ctx) }
    }

}
