package com.seguradora.multicalculo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import java.nio.charset.Charset;

public class MultiCalculationException extends RuntimeException {

    private static final long serialVersionUID = -3338125523245584585L;

    private final HttpStatus status;

    private final String statusText;

    private final String message;

    private final HttpHeaders httpHeaders;

    private final byte[] body;
    private final transient Charset charset;

    public MultiCalculationException(HttpStatus status, String statusText, String message, HttpHeaders httpHeaders,
            byte[] body, Charset charset) {
        this.status = status;
        this.statusText = statusText;
        this.message = message;
        this.httpHeaders = httpHeaders;
        this.body = body;
        this.charset = charset;
    }
}
