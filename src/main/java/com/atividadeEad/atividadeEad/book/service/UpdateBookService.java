package com.atividadeEad.atividadeEad.book.service;

import com.atividadeEad.atividadeEad.book.Book;
import com.atividadeEad.atividadeEad.book.dto.request.BookRequest;
import com.atividadeEad.atividadeEad.book.dto.response.BookResponse;
import com.atividadeEad.atividadeEad.book.exception.NoBooksFoundByIdException;
import com.atividadeEad.atividadeEad.book.repository.BookRepository;
import com.atividadeEad.atividadeEad.librarian.Librarian;
import org.springframework.stereotype.Service;

@Service
public class UpdateBookService {


    private final BookRepository bookRepository;



    public UpdateBookService(BookRepository bookRepository, ReportAllBookService reportAllBookService) {
        this.bookRepository = bookRepository;
    }


        public BookResponse updateBook(
                BookRequest request,
                int id
        ){

            Book booksFound = bookRepository.findById(id)
                    .orElseThrow(NoBooksFoundByIdException::new);

            booksFound.setTitle(request.title());
            booksFound.setAuthor(request.author());
            booksFound.setGender(request.gender());
            booksFound.setStatus(request.status());

            Book updateBook = bookRepository.save(booksFound);

            return new BookResponse(
                    updateBook.getTitle(),
                    updateBook.getAuthor(),
                    updateBook.getGender(),
                    updateBook.getStatus(),
                    updateBook.getBookId()
            );
        }

}
