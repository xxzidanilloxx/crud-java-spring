package com.danillo.crud.exception;

public class CpfDuplicateException extends RuntimeException {

    public CpfDuplicateException(){
        super("O CPF informado já foi cadastrado no sistema.");
    }
}
