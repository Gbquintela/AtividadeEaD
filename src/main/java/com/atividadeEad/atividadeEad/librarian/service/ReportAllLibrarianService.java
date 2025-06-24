package com.atividadeEad.atividadeEad.librarian.service;

import com.atividadeEad.atividadeEad.librarian.Librarian;
import com.atividadeEad.atividadeEad.librarian.dto.LibrarianResponse.LibrarianResponse;
import com.atividadeEad.atividadeEad.librarian.exception.NoLibrarianFound;
import com.atividadeEad.atividadeEad.librarian.repository.LibrarianRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportAllLibrarianService {

    private final LibrarianRepository librarianRepository;

    public ReportAllLibrarianService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }


    public List<LibrarianResponse> reportAllLibrarian(

    ){
        List<Librarian> librarianFound = librarianRepository.findAll();

        if(librarianFound.isEmpty()){
            throw new NoLibrarianFound();
        }

        return librarianFound
                .stream()
                .map(librarian -> new LibrarianResponse(
                        librarian.getName(),
                        librarian.getEmail(),
                        librarian.getPassword(),
                        librarian.getLibrarianId()))
                .toList();

    }
}
