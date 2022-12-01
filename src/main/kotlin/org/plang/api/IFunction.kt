package org.plang.api

import org.plang.PLangContext

interface IFunction {

    fun run(args: List<Any>, ctx: PLangContext): Any

}