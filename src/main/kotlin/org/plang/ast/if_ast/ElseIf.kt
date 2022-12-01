package org.plang.ast.if_ast

import org.plang.PLangContext
import org.plang.api.AST

class ElseIf(
    private val condition: AST,
    private val statements: List<AST>
) : AST {

    override fun evaluate(ctx: PLangContext) =
        if (condition.evaluate(ctx) as Boolean) {
            statements.forEach { it.evaluate(ctx) }
            true
        } else {
            false
        }

}
