package org.plang.ast

import org.plang.PLangContext
import org.plang.api.AST

class Bool(private var value: String) : AST {

    override fun evaluate(ctx: PLangContext): Boolean {
        return value.toBoolean()
    }

}
