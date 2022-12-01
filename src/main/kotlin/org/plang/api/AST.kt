package org.plang.api

import org.plang.PLangContext

interface AST {

    fun evaluate(ctx: PLangContext): Any

}