package com.atividadeEad.atividadeEad.librarian.controller;


import com.atividadeEad.atividadeEad.librarian.dto.LibrarianRequest.LibrarianRequest;
import com.atividadeEad.atividadeEad.librarian.service.DeleteLibrarianByIdService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/librarian")
@Tag(name = "Bibliotecario")
public class DeleteLibrarianController {

private final DeleteLibrarianByIdService deleteLibrarianByIdService;

    public DeleteLibrarianController(DeleteLibrarianByIdService deleteLibrarianByIdService) {
        this.deleteLibrarianByIdService = deleteLibrarianByIdService;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(
            @PathVariable int id
            ){

                deleteLibrarianByIdService.deleteById(id);
                return ResponseEntity.ok().build();
    }
}
