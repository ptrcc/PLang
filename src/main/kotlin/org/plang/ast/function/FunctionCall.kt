package org.plang.ast.function

import org.plang.PLangContext
import org.plang.api.AST

class FunctionCall(
    private val name: String,
    private val args: List<AST>
) : AST {

    override fun evaluate(ctx: PLangContext): Any {
        return ctx.callFunction(name, args.map { it.evaluate(ctx) })
    }

}