package org.plang.ast

import org.plang.AST
import org.plang.PLangContext

class Number(private var value: String) : AST() {

    override fun evaluate(ctx: PLangContext): Double {
        return value.toDouble()
    }

}
