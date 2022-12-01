package org.plang.ast

import org.plang.PLangContext
import org.plang.api.AST

class Variable(
    private val name: String,
    private val value: AST? = null
) : AST {

    override fun evaluate(ctx: PLangContext) {
        if (value != null) {
            ctx.addVariable(name, value.evaluate(ctx))
        } else {
            ctx.addVariable(name, null)
        }
    }

}