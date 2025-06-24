package com.atividadeEad.atividadeEad.book.service;


import com.atividadeEad.atividadeEad.book.dto.request.BookRequest;
import com.atividadeEad.atividadeEad.book.dto.response.BookResponse;
import com.atividadeEad.atividadeEad.book.exception.NoBooksFoundByIdException;
import com.atividadeEad.atividadeEad.book.repository.BookRepository;
import com.atividadeEad.atividadeEad.librarian.Librarian;
import com.atividadeEad.atividadeEad.librarian.repository.LibrarianRepository;
import org.springframework.stereotype.Service;

@Service
public class BookCreateService {

    private final BookRepository bookRepository;
    private final LibrarianRepository librarianRepository;

    public BookCreateService(BookRepository bookRepository, LibrarianRepository librarianRepository) {
        this.bookRepository = bookRepository;
        this.librarianRepository = librarianRepository;
    }


    public BookResponse createBook(
            BookRequest request
    ){
        int librarianId = request.librarianId();
        Librarian librarianFound = librarianRepository.findById(librarianId)
                .orElseThrow(() -> new NoBooksFoundByIdException("Biblotecario(a) com ID " + librarianId + " Não foi encontrado!"));


            bookRepository.save(request.toBook(librarianFound));

                    return new BookResponse(
                            request.title(),
                            request.author(),
                            request.gender(),
                            request.status(),
                            request.librarianId());
    }
}
