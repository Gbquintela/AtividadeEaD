package com.atividadeEad.atividadeEad.book.controller;


import com.atividadeEad.atividadeEad.book.dto.request.BookRequest;
import com.atividadeEad.atividadeEad.book.service.UpdateBookService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@Tag(name = "Livro")
public class BookUpdateController {

    private final UpdateBookService updateBookService;

    public BookUpdateController(UpdateBookService updateBookService) {
        this.updateBookService = updateBookService;
    }



    @PutMapping("update/{id}")
    public ResponseEntity<?> updateBook(
            @RequestBody @Valid BookRequest request,
            @PathVariable int id
            ){

            return  ResponseEntity.ok().body(updateBookService.updateBook(request,id));

    }

}
