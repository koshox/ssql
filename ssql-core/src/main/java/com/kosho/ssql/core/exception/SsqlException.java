package com.kosho.ssql.core.exception;

/**
 * Ssql异常
 *
 * @author Kosho
 * @since 2021-7-10
 */
public class SsqlException extends RuntimeException {
    public SsqlException() {
    }

    public SsqlException(String message) {
        super(message);
    }

    public SsqlException(Throwable cause) {
        super(cause);
    }

    public SsqlException(String message, Throwable cause) {
        super(message, cause);
    }
}
