package org.plang.api

import org.plang.PLangContext
import java.io.InputStream

interface LangEvaluator {

    fun evaluate(input: String, ctx: PLangContext = PLangContext()): List<Any>

    fun evaluate(inputStream: InputStream, ctx: PLangContext = PLangContext()): List<Any>

}