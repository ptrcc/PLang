package org.plang.ast

import org.plang.PLangContext

class StringLiteral(private var value: String) : AST() {

    override fun evaluate(ctx: PLangContext): Any {
        return removeQuotes(value)
    }

    private fun removeQuotes(value: String): String {
        return value.removePrefix("\"").removeSuffix("\"")
    }

}
