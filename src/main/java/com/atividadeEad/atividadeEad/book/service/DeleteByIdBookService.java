package com.atividadeEad.atividadeEad.book.service;


import com.atividadeEad.atividadeEad.book.Book;
import com.atividadeEad.atividadeEad.book.dto.response.BookResponse;
import com.atividadeEad.atividadeEad.book.exception.NoBooksFoundByIdException;
import com.atividadeEad.atividadeEad.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteByIdBookService {

    private final BookRepository bookRepository;

    public DeleteByIdBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookResponse deleteById(
            int id
    ){
        Optional<Book> bookFound = bookRepository.findById(id);

        if(bookFound.isEmpty()){
            throw  new NoBooksFoundByIdException();
        }

        bookRepository.deleteById(id);

        return new BookResponse(
                bookFound.get().getTitle(),
                bookFound.get().getAuthor(),
                bookFound.get().getGender(),
                bookFound.get().getStatus(),
                bookFound.get().getBookId());
    }
}
