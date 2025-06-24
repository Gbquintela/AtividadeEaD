package com.atividadeEad.atividadeEad.librarian.exception;

public class PasswordNotTheSameException extends RuntimeException{

    public PasswordNotTheSameException(){super("Senhas não são iguais!");}

    public PasswordNotTheSameException(String message){super(message);}
}
