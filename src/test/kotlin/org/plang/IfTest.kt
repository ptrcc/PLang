package org.plang

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class IfTest {

    private val plang = PLangEvaluator()
    private lateinit var ctx: PLangContext
    private lateinit var called: Any
    private var counter: Int = 0

    @BeforeEach
    fun setup() {
        called = "none"
        counter = 0
        ctx = PLangContext()
        val callerFunc = { arg: Any -> called = arg }
        val counterFunc = { counter++ }
        ctx.addFunction("caller", callerFunc)
        ctx.addFunction("count", counterFunc)
    }

    @Test
    fun `test if`() {
        plang.evaluate(
            """
            if true {
                count()
                caller("if")
            }
        """.trimIndent(), ctx
        )

        assert(counter == 1)
        assert(called == "if")
    }

    @Test
    fun `test if is not called`() {
        plang.evaluate(
            """
            if false {
                caller("if")
                count()
            }
        """.trimIndent(), ctx
        )

        assert(counter == 0)
        assert(called == "none")
    }


    @Test
    fun `test if else`() {
        plang.evaluate(
            """
            if true {
                caller("if")
                count()
            } else {
                caller("else")
                count()
            }
        """.trimIndent(), ctx
        )

        assert(called == "if")
        assert(counter == 1)
    }

    @Test
    fun `test if else - else is called`() {
        plang.evaluate(
            """
            if false {
                caller("if")
                count()
            } else {
                caller("else")
                count()
            }
        """.trimIndent(), ctx
        )

        assert(called == "else")
        assert(counter == 1)
    }


    @Test
    fun `test if elseif else`() {
        plang.evaluate(
            """
            if false {
                caller("if")
                count()
            } else if true {
                caller("elseif")
                count()
            } else {
                caller("else")
                count()
            }
        """.trimIndent(), ctx
        )

        assert(called == "elseif")
        assert(counter == 1)
    }

    @Test
    fun `test if elseif else - multiple elseif`() {
        plang.evaluate(
            """
            if false {
                caller("if")
                count()
            } else if false {
                caller("elseif false")
                count()
            } else if true {
                caller("elseif true")
                count()
            } else if false {
                caller("elseif false 1")
                count()
            } else {
                caller("else")
                count()
            }
        """.trimIndent(), ctx
        )

        assert(called == "elseif true")
        assert(counter == 1)
    }

    @Test
    fun `test if elseif else - else is called`() {
        plang.evaluate(
            """
            if false {
                caller("if")
                count()
            } else if false {
                caller("elseif false")
                count()
            } else if false {
                caller("elseif false")
                count()
            } else if false {
                caller("elseif false")
                count()
            } else {
                caller("else")
                count()
            }
        """.trimIndent(), ctx
        )

        assert(counter == 1)
        assert(called == "else")
    }

}