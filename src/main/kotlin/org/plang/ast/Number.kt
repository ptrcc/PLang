package org.plang.ast

import org.plang.PLangContext
import org.plang.api.AST

class Number(private var value: String) : AST {

    override fun evaluate(ctx: PLangContext): Double {
        return value.toDouble()
    }

}
