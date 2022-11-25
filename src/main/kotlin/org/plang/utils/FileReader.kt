package org.plang.utils

import java.io.File

class FileReader {

    fun asStream(fileName: String) = File(fileName).inputStream()

}