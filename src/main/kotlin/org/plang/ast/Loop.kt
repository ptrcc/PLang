package org.plang.ast

import org.plang.PLangContext
import org.plang.api.AST

class Loop(
    private val condition: AST,
    private val statements: List<AST>
) : AST {

    override fun evaluate(ctx: PLangContext) {
        while (condition.evaluate(ctx) as Boolean) {
            statements.forEach { it.evaluate(ctx) }
        }
    }
}
