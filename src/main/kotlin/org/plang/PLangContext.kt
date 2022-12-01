package org.plang

import org.plang.ast.function.KtFunction
import org.plang.ast.function.PLangFunction

class PLangContext(initialVariables: Map<String, Any?> = mapOf(), val functionRegistry: FunctionRegistry = FunctionRegistry()) {

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

    fun addFunction(name: String, function: PLangFunction) {
        functionRegistry.register(name, function)
    }

    fun addFunction(name: String, function: (Any) -> Any?) {
        functionRegistry.register(name, KtFunction(function))
    }

    fun addFunction(name: String, function: () -> Any?) {
        functionRegistry.register(name, KtFunction(function))
    }

    fun addFunction(name: String, function: (Any, Any) -> Any?) {
        functionRegistry.register(name, KtFunction(function))
    }

    fun callFunction(name: String, args: List<Any>): Any {
        return functionRegistry.callFunction(name, args, this)
    }

    fun addVariable(name: String, value: Any?) {
        variables[name] = value
    }

    fun getVariable(name: String): Any {
        return variables[name] ?: throw RuntimeException("Variable $name not found")
    }

}

