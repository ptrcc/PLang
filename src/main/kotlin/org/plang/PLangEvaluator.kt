package org.plang

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.plang.api.AST
import org.plang.api.LangEvaluator
import java.io.InputStream


class PLangEvaluator: LangEvaluator {

    private fun createAST(inputStream: InputStream): List<AST> {
        val input = CharStreams.fromStream(inputStream)
        val lexer = org.plang.PLangLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = org.plang.PLangParser(tokens)
        val visitor = PLangASTVisitor()

        return visitor.visit(parser.program())
    }

    private fun evaluateAST(ast: List<AST>, ctx: PLangContext): List<Any> {
        return ast.map {
            it.evaluate(ctx)
        }
    }

    override fun evaluate(input: String, ctx: PLangContext): List<Any> {
        return evaluate(input.byteInputStream(), ctx)
    }

    override fun evaluate(inputStream: InputStream, ctx: PLangContext): List<Any> {
        return evaluateAST(createAST(inputStream), ctx)
    }


}