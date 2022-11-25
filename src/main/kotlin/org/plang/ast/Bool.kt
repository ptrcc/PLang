package org.plang.ast

import org.plang.AST
import org.plang.PLangContext

class Bool(private var value: String) : AST() {

    override fun evaluate(ctx: PLangContext): Boolean {
        return value.toBoolean()
    }

}
