package com.atividadeEad.atividadeEad.book.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;


public class NoBooksFoundByIdException  extends RuntimeException{
    public NoBooksFoundByIdException(){super("Nenhum livro encontrado por esse id!");}
    public NoBooksFoundByIdException(String message){super(message);}
}
