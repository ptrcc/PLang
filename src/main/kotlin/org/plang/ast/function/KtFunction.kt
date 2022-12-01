package org.plang.ast.function

import org.plang.PLangContext
import org.plang.api.IFunction


typealias fun0 = () -> Any
typealias fun1 = (arg1: Any) -> Any
typealias fun2 = (arg1: Any, arg2: Any) -> Any

@Suppress("UNCHECKED_CAST")
class KtFunction(
    private val function: Any
) : IFunction {

    override fun run(args: List<Any>, ctx: PLangContext): Any {
        return when (args.size) {
            0 -> (function as fun0)()
            1 -> (function as fun1)(args[0])
            2 -> (function as fun2)(args[0], args[1])
            else -> throw RuntimeException("argument size not matching")
        }
    }

}