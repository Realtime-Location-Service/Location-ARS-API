package com.rls.ars.exceptions;

public class MissingHeaderException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public MissingHeaderException(String message) {
        super(message);
    }
}

