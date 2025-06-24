package com.atividadeEad.atividadeEad.book.controller;

import com.atividadeEad.atividadeEad.book.service.ReportAllBookService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@Tag(name = "Livro")
public class BookReportAllController {

    private final ReportAllBookService reportAllBookService;

    public BookReportAllController(ReportAllBookService reportAllBookService) {
        this.reportAllBookService = reportAllBookService;
    }


    @GetMapping("/report/all")

    public ResponseEntity<?> reportAll(){

        return ResponseEntity.ok().body(reportAllBookService.reportaAll());

    }
}
