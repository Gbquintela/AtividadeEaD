package com.atividadeEad.atividadeEad.librarian.service;


import com.atividadeEad.atividadeEad.librarian.Librarian;
import com.atividadeEad.atividadeEad.librarian.dto.LibrarianRequest.LibrarianRequest;
import com.atividadeEad.atividadeEad.librarian.dto.LibrarianResponse.LibrarianResponse;
import com.atividadeEad.atividadeEad.librarian.exception.PasswordNotTheSameException;
import com.atividadeEad.atividadeEad.librarian.repository.LibrarianRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateLibrarianService {

    private final LibrarianRepository librarianRepository;

    public CreateLibrarianService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }


    public LibrarianResponse registerLibrarian(
            LibrarianRequest request
    ){
        if(!request.password().equals(request.ConfirmPassword())){
           throw new PasswordNotTheSameException();
        }


        Librarian librarian = request.toLibrarian();
        librarianRepository.save(librarian);

        return new LibrarianResponse(
                request.name(),
                request.email(),
                request.password(),
                request.toLibrarian().getLibrarianId()


        );
    }

}
