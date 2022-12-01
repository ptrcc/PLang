package org.plang

import org.plang.ast.function.*

class PLangContext(
    initialVariables: Map<String, Any?> = mapOf(),
    val functionRegistry: FunctionRegistry = FunctionRegistry()
) {

    val variables = mutableMapOf<String, Any?>()

    init {
        variables.putAll(initialVariables)
        defaultFunctions()
    }

    private fun defaultFunctions() {
        functionRegistry.register("out", KtFunction({ arg: String ->
            println(arg)
        }))
    }

    fun addFunction(name: String, function: PLangFunction) = functionRegistry.register(name, function)
    fun addFunction(name: String, function: fun0) = functionRegistry.register(name, KtFunction(function))
    fun addFunction(name: String, function: fun1) = functionRegistry.register(name, KtFunction(function))
    fun addFunction(name: String, function: fun2) = functionRegistry.register(name, KtFunction(function))
    fun callFunction(name: String, args: List<Any>) = functionRegistry.callFunction(name, args, this)

    fun addVariable(name: String, value: Any?) {
        variables[name] = value
    }

    fun getVariable(name: String) =
        variables[name] ?: throw RuntimeException("Variable $name not found")

}

