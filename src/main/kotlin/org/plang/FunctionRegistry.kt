package org.plang

import org.plang.api.IFunction

class FunctionRegistry {

    private val functions = mutableMapOf<String, IFunction>()

    fun register(name: String, function: IFunction) {
        functions[name] = function
    }

    private fun resolve(name: String) =
        functions[name] ?: throw RuntimeException("Function $name not found")

    fun callFunction(name: String, args: List<Any>, ctx: PLangContext) =
        resolve(name)
            .run(args, ctx)

}
