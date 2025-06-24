package com.atividadeEad.atividadeEad.book.controller;

import com.atividadeEad.atividadeEad.book.service.DeleteByIdBookService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/books")
@Tag(name = "Livro")
public class BookDeleteByIdController {

    private final DeleteByIdBookService deleteByIdBookService;

    public BookDeleteByIdController(DeleteByIdBookService deleteByIdBookService) {
        this.deleteByIdBookService = deleteByIdBookService;
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBookById(
            @PathVariable int id
    ){
        return  ResponseEntity.ok().body(deleteByIdBookService.deleteById(id));
    }
}
