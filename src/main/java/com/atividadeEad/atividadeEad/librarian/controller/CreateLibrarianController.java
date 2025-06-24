package com.atividadeEad.atividadeEad.librarian.controller;

import com.atividadeEad.atividadeEad.librarian.dto.LibrarianRequest.LibrarianRequest;
import com.atividadeEad.atividadeEad.librarian.service.CreateLibrarianService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/librarian")
@Tag(name = "Bibliotecario")
public class CreateLibrarianController {

    private final CreateLibrarianService createLibrarianService;

    public CreateLibrarianController(CreateLibrarianService createLibrarianService) {
        this.createLibrarianService = createLibrarianService;
    }

    @PostMapping("/create")
    public ResponseEntity<?>  register(
            @RequestBody @Valid LibrarianRequest request
            ){

        return ResponseEntity.ok().body(createLibrarianService.registerLibrarian(request));

    }
}
