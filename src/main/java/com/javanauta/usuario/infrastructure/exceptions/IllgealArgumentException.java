package com.javanauta.usuario.infrastructure.exceptions;

public class IllgealArgumentException extends RuntimeException {

    public IllgealArgumentException(String mensagem) {
        super(mensagem);
    }

    public IllgealArgumentException(String mensagem, Throwable throwable) {
        super(mensagem, throwable);
    }
}
