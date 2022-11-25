package org.plang

abstract class AST {

    abstract fun evaluate(ctx: PLangContext): Any

}