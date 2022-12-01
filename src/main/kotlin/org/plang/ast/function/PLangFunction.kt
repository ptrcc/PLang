package org.plang.ast.function

import org.plang.PLangContext
import org.plang.api.AST
import org.plang.api.IFunction

class PLangFunction(
    private val name: String,
    private val argNames: List<String>,
    private val statements: List<AST>
) : AST, IFunction {

    override fun evaluate(ctx: PLangContext) {
        ctx.addFunction(this.name, this)
    }

    override fun run(args: List<Any>, ctx: PLangContext): Any {
        val localCtx = PLangContext(ctx.variables, ctx.functionRegistry)
        argNames.forEachIndexed { index, argName ->
            localCtx.addVariable(argName, args[index])
        }
        statements.forEach { it.evaluate(localCtx) }
        return Unit
    }

}