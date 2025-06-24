package com.atividadeEad.atividadeEad.librarian.controller;

import com.atividadeEad.atividadeEad.librarian.dto.LibrarianRequest.LibrarianRequest;
import com.atividadeEad.atividadeEad.librarian.service.UpdateLibrarianService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/librarian")
@Tag(name = "Bibliotecario")
public class UpdateLibrarianController {

    private final UpdateLibrarianService updateLibrarianService;

    public UpdateLibrarianController(UpdateLibrarianService updateLibrarianService) {
        this.updateLibrarianService = updateLibrarianService;
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateLibrarian(
            @RequestBody @Valid LibrarianRequest request,
            @PathVariable int id
            ){

        updateLibrarianService.updateLibrarian(request,id);
        return ResponseEntity.ok().build();
    }
}
