package org.plang

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class PLangFunctionTest {

    private val plang = PLangEvaluator()
    private lateinit var ctx: PLangContext
    private var result: Any = "none"

    @BeforeEach
    fun setup() {
        ctx = PLangContext()
        result = "none"
        val returnFunction = { res: Any ->
            result = res
        }
        ctx.addFunction("return", returnFunction)
    }

    @Test
    fun `create function`() {
        plang.evaluate(
            """
            def function_1 (arg) {
                return(arg)
            }
            function_1("infunction")
        """.trimIndent(), ctx
        )
        assert(result == "infunction")
    }

    @Test
    fun `cannot access from global ctx to variable defined in function`() {
        plang.evaluate(
            """
            def outerVariable = "1"
            def function_1 () {
                def innerVariable = "2"
            }
            function_1()
        """.trimIndent(), ctx
        )
        assert(ctx.variables.size == 1)
        assert(ctx.variables["outerVariable"] == "1")
    }

    @Test
    fun `call function from other function`() {
        plang.evaluate(
            """
            def function_1 (arg) {
                function_2(arg)
            }
            def function_2 (arg) {
                return(arg)
            }
            function_1("1")
        """.trimIndent(), ctx
        )
        assert(result == "1")
    }

    @Test
    fun `inner function`() {
        plang.evaluate(
            """
            def function_1 (arg) {
                def inner_function(arg) {
                    return(arg)
                }
                inner_function(arg)
            }
            function_1("1")
        """.trimIndent(), ctx
        )
        assert(result == "1")
    }


}