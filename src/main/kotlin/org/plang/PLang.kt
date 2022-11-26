package org.plang

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.plang.ast.AST
import java.io.InputStream


class PLang {

    private fun evaluateAST(inputStream: InputStream): List<AST> {
        val input = CharStreams.fromStream(inputStream)
        val lexer = PLangLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = PLangParser(tokens)
        val visitor = PLangASTVisitor()

        return visitor.visit(parser.program())
    }

    fun evaluate(input: String, ctx: PLangContext = PLangContext()): List<Any> {
        return evaluate(input.byteInputStream(), ctx)
    }

    fun evaluate(inputStream: InputStream, ctx: PLangContext = PLangContext()): List<Any> {
        val ast = evaluateAST(inputStream)
        return ast.map {
            it.evaluate(ctx)
        }
    }


}