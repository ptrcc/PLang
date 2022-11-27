package org.plang

import java.io.File

fun main(args: Array<String>) {
    val plang = PLang()
    val file = File(args[0]).inputStream()
    plang.evaluate(file)
}