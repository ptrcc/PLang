package org.plang

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class LoopTest {

    private val plang = PLang()
    lateinit var ctx: PLangContext
    private var counter: Int = 0

    @BeforeEach
    fun setup() {
        counter = 0
        ctx = PLangContext()
        val counterFunc = { counter++ }
        ctx.addFunction("count", counterFunc)
    }

    @Test
    fun `test loop`() {
        plang.evaluate(
            """
             def i = 0
             loop i < 10 {
                i = i + 1
                count()
             }
        """.trimIndent(), ctx
        )

        assert(counter == 10)
    }

}