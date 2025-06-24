package com.atividadeEad.atividadeEad.librarian.service;


import com.atividadeEad.atividadeEad.librarian.Librarian;
import com.atividadeEad.atividadeEad.librarian.dto.LibrarianResponse.LibrarianResponse;
import com.atividadeEad.atividadeEad.librarian.exception.NoLibrarianFoundByIdException;
import com.atividadeEad.atividadeEad.librarian.repository.LibrarianRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteLibrarianByIdService {


    private final LibrarianRepository librarianRepository;


    public DeleteLibrarianByIdService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }



    public LibrarianResponse deleteById(
            int librarianId
    ){
        Optional<Librarian> librarianFound = librarianRepository.findById(librarianId);

        if(librarianFound.isEmpty()){
            throw new NoLibrarianFoundByIdException(librarianFound);
        }

        librarianRepository.deleteById(librarianId);
        return new LibrarianResponse(
                librarianFound.get().getName(),
                librarianFound.get().getEmail(),
                librarianFound.get().getPassword(),
                librarianFound.get().getLibrarianId()
        );
    }


}
