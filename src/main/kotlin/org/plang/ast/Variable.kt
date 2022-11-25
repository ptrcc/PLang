package org.plang.ast

import org.plang.AST
import org.plang.PLangContext

class Variable(
    private val name: String
) : AST() {

    override fun evaluate(ctx: PLangContext): Any {
        ctx.setVariable(name, null)
        return Unit
    }

}