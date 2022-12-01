package org.plang.ast

import org.plang.PLangContext
import org.plang.api.AST

class ID(private var id: String) : AST {

    override fun evaluate(ctx: PLangContext): Any {
        return ctx.getVariable(id)
    }

}
