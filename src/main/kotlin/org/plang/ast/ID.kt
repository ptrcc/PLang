package org.plang.ast

import org.plang.PLangContext

class ID(private var id: String) : AST() {

    override fun evaluate(ctx: PLangContext): Any {
        return ctx.getVariable(id)
    }

}
