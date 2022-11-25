package org.plang

class FunctionRegistry {

    private val functions = mutableMapOf<String, Any>()

    fun registerFunction(name: String, function: () -> Any?) {
        functions[name] = function
    }

    fun registerFunction(name: String, function: (arg1: Any) -> Any?) {
        functions[name] = function
    }

    fun registerFunction(name: String, function: (arg1: Any, arg2: Any) -> Any?) {
        functions[name] = function
    }

    fun getFunction(name: String): Any {
        return functions[name] ?: throw RuntimeException("Function $name not found")
    }

    fun callFunction(name: String, args: List<Any?>): Any {
        val function = getFunction(name)
        return when (args.size) {
            0 -> (function as () -> Any)()
            1 -> (function as (arg1: Any) -> Any)(args[0]!!)
            2 -> (function as (arg1: Any, arg2: Any) -> Any)(args[0]!!, args[1]!!)
            else -> throw RuntimeException("Function $name does not support ${args.size} arguments")
        }
    }

}
