package com.atividadeEad.atividadeEad.librarian.exception;

import com.atividadeEad.atividadeEad.librarian.Librarian;

import java.util.Optional;

public class NoLibrarianFoundByIdException extends RuntimeException{

    public NoLibrarianFoundByIdException(){super("Nenhum bibliotecario(a) encontrado por esse id!");}

    public NoLibrarianFoundByIdException(String message){super(message);}


    public NoLibrarianFoundByIdException(Optional<Librarian> librarianFound) {
    }
}
