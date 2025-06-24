package com.atividadeEad.atividadeEad.book.exception;

public class NoBooksFoundException extends RuntimeException{
    public NoBooksFoundException(){super("Nenhum livro encontrado!");}
    public NoBooksFoundException(String message){super(message);}


}
