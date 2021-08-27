package com.kosho.ssql.core.dsl.parser;

import com.kosho.ssql.core.exception.SsqlException;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Ssql异常监听器
 *
 * @author Kosho
 * @since 2021-7-10
 */
public class SsqlErrorListener extends BaseErrorListener {
    public static final SsqlErrorListener INSTANCE = new SsqlErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        throw new SsqlException("line " + line + ":" + charPositionInLine + " " + msg);
    }
}
