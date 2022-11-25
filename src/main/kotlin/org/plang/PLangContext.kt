package org.plang

class PLangContext(initialVariables: Map<String, Any?> = mapOf()) {

    private val variables = mutableMapOf<String, Any?>()
    private val functionRegistry = FunctionRegistry()

    init {
        variables.putAll(initialVariables)
        defaultFunctions()
    }

    private fun defaultFunctions() {
        functionRegistry.registerFunction("out") { arg ->
            println(arg)
        }
    }

    fun addFunction(name: String, function: (Any) -> Any?) {
        functionRegistry.registerFunction(name, function)
    }

    fun addFunction(name: String, function: () -> Any?) {
        functionRegistry.registerFunction(name, function)
    }

    fun addFunction(name: String, function: (Any, Any) -> Any?) {
        functionRegistry.registerFunction(name, function)
    }

    fun callFunction(name: String, args: List<Any?>): Any {
        return functionRegistry.callFunction(name, args)
    }

    fun getFunction(name: String): Any {
        return functionRegistry.getFunction(name)
    }

    fun setVariable(name: String, value: Any?) {
        variables[name] = value
    }

    fun getVariable(name: String): Any {
        return variables[name] ?: throw RuntimeException("Variable $name not found")
    }

    fun getVariables(): Map<String, Any?> {
        return variables
    }

}

