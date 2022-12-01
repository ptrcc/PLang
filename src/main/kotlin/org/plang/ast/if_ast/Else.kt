package org.plang.ast.if_ast

import org.plang.PLangContext
import org.plang.api.AST

class Else(
    private val statements: List<AST>
) : AST {

    override fun evaluate(ctx: PLangContext) =
        statements.forEach { it.evaluate(ctx) }

}
