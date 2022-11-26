package org.plang.ast

import org.plang.PLangContext

class Variable(
    private val name: String,
    private val value: AST? = null
) : AST() {

    override fun evaluate(ctx: PLangContext): Any {
        if (value != null) {
            ctx.setVariable(name, value.evaluate(ctx))
        } else {
            ctx.setVariable(name, null)
        }
        return Unit
    }

}