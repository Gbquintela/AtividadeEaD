package com.atividadeEad.atividadeEad.book.controller;

import com.atividadeEad.atividadeEad.book.dto.request.BookRequest;
import com.atividadeEad.atividadeEad.book.service.BookCreateService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@Tag(name = "Livro")
public class CreateBookController {

    private final BookCreateService bookCreateService;

    public CreateBookController(BookCreateService bookCreateService) {
        this.bookCreateService = bookCreateService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createBook(
            @RequestBody @Valid BookRequest bookRequest
            ){

           return ResponseEntity.ok().body(bookCreateService.createBook(bookRequest));
    }

}
