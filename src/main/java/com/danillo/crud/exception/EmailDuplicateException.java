package com.danillo.crud.exception;

public class EmailDuplicateException extends RuntimeException {

    public EmailDuplicateException() {
        super("O email informado já foi cadastrado no sistema.");
    }
}
