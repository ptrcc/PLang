package org.plang

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class FunctionTest {

    private val plang = PLangEvaluator()
    private lateinit var ctx: PLangContext

    @BeforeEach
    fun setup() {
        ctx = PLangContext()
    }

    @Test
    fun `test function with no parameters`() {
        var isCalled = false

        val function = { isCalled = true }
        ctx.addFunction("caller", function)
        plang.evaluate("caller()", ctx)
        assert(isCalled)
    }

    @Test
    fun `test function with one parameter`() {
        var variable: Any? = null

        val function = { argument: Any ->
            variable = argument
        }

        ctx.addFunction("setter", function)
        plang.evaluate("setter(1)", ctx)
        assert(variable == 1.0)
    }

    @Test
    fun `test function with two parameters`() {
        var variable: Any? = null

        val function = { d1: Any, d2: Any ->
            variable = d1 as Double + d2 as Double
        }

        ctx.addFunction("adder", function)
        plang.evaluate("adder(5, 6)", ctx)
        assert(variable == 11.0)
    }

}