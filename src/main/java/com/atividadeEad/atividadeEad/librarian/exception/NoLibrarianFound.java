package com.atividadeEad.atividadeEad.librarian.exception;


public class NoLibrarianFound extends RuntimeException {
    public NoLibrarianFound(){super("Nenhum bibliotecario(a) encontrado!");}

    public NoLibrarianFound(String message){super(message);}
}
