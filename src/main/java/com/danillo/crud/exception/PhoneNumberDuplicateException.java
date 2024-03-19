package com.danillo.crud.exception;

public class PhoneNumberDuplicateException extends RuntimeException {

    public PhoneNumberDuplicateException(){
        super("O número informado já foi cadastrado no sistema.");
    }
}
