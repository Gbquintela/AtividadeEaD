package com.atividadeEad.atividadeEad.librarian.dto.LibrarianResponse;

import com.atividadeEad.atividadeEad.librarian.Librarian;

public record LibrarianResponse(
        String name,
        String email,
        String password,
        int id
) {
    public static LibrarianResponse fromEntity(Librarian librarian){
        return new LibrarianResponse(
        librarian.getName(),
        librarian.getEmail(),
         librarian.getPassword(),
          librarian.getLibrarianId()
        );
    }
}
