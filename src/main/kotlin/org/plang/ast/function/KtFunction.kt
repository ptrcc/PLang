package org.plang.ast.function

import org.plang.PLangContext
import org.plang.api.IFunction

class KtFunction(
    private val function: Any
) : IFunction {

    override fun run(args: List<Any>, ctx: PLangContext): Any {
        return when (args.size) {
            0 -> (function as () -> Any)()
            1 -> (function as (arg1: Any) -> Any)(args[0])
            2 -> (function as (arg1: Any, arg2: Any) -> Any)(args[0], args[1])
            else -> throw RuntimeException("argument size not matching")
        }
    }

}