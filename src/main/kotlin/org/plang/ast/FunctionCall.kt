package org.plang.ast

import org.plang.AST
import org.plang.PLangContext

class FunctionCall(
    private val name: String,
    private val args: List<AST>
) : AST() {

    override fun evaluate(ctx: PLangContext): Any {
        return ctx.callFunction(name, args.map { it.evaluate(ctx) })
    }

}