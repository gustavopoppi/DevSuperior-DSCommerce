package com.devsuperior.dscommerce.services.exceptions;

@SuppressWarnings("serial")
public class ForbidenException extends RuntimeException {

    public ForbidenException(String msg) {
        super(msg);
    }
}