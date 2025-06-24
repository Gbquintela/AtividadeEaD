package com.atividadeEad.atividadeEad.book.service;

import com.atividadeEad.atividadeEad.book.Book;
import com.atividadeEad.atividadeEad.book.dto.response.BookResponse;
import com.atividadeEad.atividadeEad.book.exception.NoBooksFoundException;
import com.atividadeEad.atividadeEad.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportAllBookService {

private final BookRepository bookRepository;

    public ReportAllBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public List<BookResponse> reportaAll(){

        List<Book>booksFound = bookRepository.findAll();

            if(booksFound.isEmpty()){
                    throw new NoBooksFoundException();
            }

            return booksFound
                    .stream()
                    .map(book -> new BookResponse(
                            book.getTitle(),
                            book.getAuthor(),
                            book.getGender(),
                            book.getStatus(),
                            book.getBookId()))
                    .toList();

    }
}
