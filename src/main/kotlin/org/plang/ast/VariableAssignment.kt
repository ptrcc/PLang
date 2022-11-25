package org.plang.ast

import org.plang.AST
import org.plang.PLangContext

class VariableAssignment(
    private val name: String,
    private val value: AST
) : AST() {

    override fun evaluate(ctx: PLangContext): Any {
        ctx.setVariable(name, value.evaluate(ctx))
        return Unit
    }

}