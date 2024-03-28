package com.seguradora.multicalculo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class dataNotFoundException extends MultiCalculationException {
    private static final long serialVersionUID = -8130663504365147192L;

    public dataNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND,HttpStatus.NOT_FOUND.getReasonPhrase(),message,new HttpHeaders(),"".getBytes(StandardCharsets.UTF_8), Charset.defaultCharset());
    }
}
