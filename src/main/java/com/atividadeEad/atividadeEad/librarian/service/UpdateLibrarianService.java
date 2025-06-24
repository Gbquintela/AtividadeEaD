package com.atividadeEad.atividadeEad.librarian.service;

import com.atividadeEad.atividadeEad.librarian.Librarian;
import com.atividadeEad.atividadeEad.librarian.dto.LibrarianRequest.LibrarianRequest;
import com.atividadeEad.atividadeEad.librarian.dto.LibrarianResponse.LibrarianResponse;
import com.atividadeEad.atividadeEad.librarian.exception.PasswordNotTheSameException;
import com.atividadeEad.atividadeEad.librarian.repository.LibrarianRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateLibrarianService {

    private final LibrarianRepository librarianRepository;

    public UpdateLibrarianService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }

    public LibrarianResponse updateLibrarian(
            LibrarianRequest request,
            int librarianId
    ){
        Librarian librarianFound = librarianRepository.findById(librarianId)
                .orElseThrow();

        librarianFound.setName(request.name());
        librarianFound.setEmail(request.email());
        if(!request.password().equals(request.ConfirmPassword())){
            throw new PasswordNotTheSameException();
            }
        librarianFound.setPassword(request.password());
            Librarian librarianUpdate = librarianRepository.save(librarianFound);

        return new LibrarianResponse(
                request.name(),
                request.email(),
                request.password(),
                request.toLibrarian().getLibrarianId()
        );
    }

}
