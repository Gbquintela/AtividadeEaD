package com.atividadeEad.atividadeEad.librarian.controller;


import com.atividadeEad.atividadeEad.librarian.dto.LibrarianRequest.LibrarianRequest;
import com.atividadeEad.atividadeEad.librarian.service.ReportAllLibrarianService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/librarian")
@Tag(name = "Bibliotecario")
public class ReportAllLibrarianController {

    private final ReportAllLibrarianService reportAllLibrarianService;


    public ReportAllLibrarianController(ReportAllLibrarianService reportAllLibrarianService) {
        this.reportAllLibrarianService = reportAllLibrarianService;
    }


    @GetMapping("/report/all")
    public ResponseEntity<?> reportAll(
            ){



        return ResponseEntity.ok().body(reportAllLibrarianService.reportAllLibrarian());

    }
}
