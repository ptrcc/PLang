package org.plang

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

internal class VariableTest {

    private val plang = PLangEvaluator()
    private lateinit var ctx: PLangContext

    @BeforeEach
    fun setup() {
        ctx = PLangContext()
    }

    @Test
    fun `variable declaration without value`() {
        plang.evaluate("def test_variable", ctx)
        assert(ctx.getVariables().size == 1)
    }

    @Test
    fun `variable assignment with string value`() {
        plang.evaluate("""def test_variable = "abc"""", ctx)
        assert(ctx.getVariables().size == 1)
        assert(ctx.getVariables()["test_variable"] == "abc")
    }

    @Test
    fun `variable assignment with number value`() {
        plang.evaluate("def test_variable = 1108", ctx)
        assert(ctx.getVariables().size == 1)
        assert(ctx.getVariables()["test_variable"] == 1108.0)
    }

    @Test
    fun `variable assignment with boolean value`() {
        plang.evaluate("def test_variable = false", ctx)
        assert(ctx.getVariables().size == 1)
        assert(ctx.getVariables()["test_variable"] == false)
    }

    @Test
    fun `variable assignment with math arithmetic expression value`() {
        plang.evaluate("""
            def test_variable_add = 1 + 3
            def test_variable_add_1 = 1 + 3 + 3
            def test_variable_sub = 1 - 3
            def test_variable_mul = 2 * 3
            def test_variable_mul_1 = test_variable_mul * 2
            def test_variable_div = 10 / 2
            def test_variable_brace = 3 * (5 + 4)
        """, ctx)
        assert(ctx.getVariables()["test_variable_add"] == 4.0)
        assert(ctx.getVariables()["test_variable_add_1"] == 7.0)
        assert(ctx.getVariables()["test_variable_sub"] == -2.0)
        assert(ctx.getVariables()["test_variable_mul"] == 6.0)
        assert(ctx.getVariables()["test_variable_mul_1"] == 12.0)
        assert(ctx.getVariables()["test_variable_div"] == 5.0)
        assert(ctx.getVariables()["test_variable_brace"] == 27.0)
    }

    @Test
    fun `variable assignment with exiting variable`() {
        plang.evaluate(
            """
           def test_variable_1 = "abc"
           def test_variable_2 = test_variable_1
        """, ctx
        )
        assert(ctx.getVariables().size == 2)
        assert(ctx.getVariables()["test_variable_1"] == "abc")
        assert(ctx.getVariables()["test_variable_2"] == "abc")
    }
    @Test
    fun `variable reassignment with exiting variable`() {
        plang.evaluate(
            """
           def test_variable_1 = "abc"
           def test_variable_2 = test_variable_1
           def test_variable_3 = 1108
           test_variable_1 = test_variable_3
        """, ctx
        )
        assert(ctx.getVariables().size == 3)
        assert(ctx.getVariables()["test_variable_1"] == 1108.0)
        assert(ctx.getVariables()["test_variable_2"] == "abc")
        assert(ctx.getVariables()["test_variable_3"] == 1108.0)
    }

    @Test
    fun `variable assignment with not exiting variable throws error`() {
        assertFailsWith<java.lang.RuntimeException> {
            plang.evaluate(
                """
                def test_variable_1 = "abc"
                def test_variable_2 = test_variable_3
           """, ctx
            )
        }

    }

    @Test
    fun `multiple variables`() {
        plang.evaluate(
            """
            def test_variable_1 = 1108
            def test_variable_2 = "abc"
        """, ctx
        )
        assert(ctx.getVariables().size == 2)
        assert(ctx.getVariables()["test_variable_1"] == 1108.0)
        assert(ctx.getVariables()["test_variable_2"] == "abc")
    }
}