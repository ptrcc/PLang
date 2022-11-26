package org.plang.ast

import org.plang.PLangContext

abstract class AST {

    abstract fun evaluate(ctx: PLangContext): Any

}