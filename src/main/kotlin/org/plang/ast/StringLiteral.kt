package org.plang.ast

import org.plang.PLangContext
import org.plang.api.AST

class StringLiteral(private var value: String) : AST {

    override fun evaluate(ctx: PLangContext) =
        removeQuotes(value)

    private fun removeQuotes(value: String) =
        value.removePrefix("\"").removeSuffix("\"")

}
