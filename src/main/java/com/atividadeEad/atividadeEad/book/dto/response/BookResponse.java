package com.atividadeEad.atividadeEad.book.dto.response;

import com.atividadeEad.atividadeEad.book.enums.Status;
import com.atividadeEad.atividadeEad.librarian.Librarian;

public record BookResponse(
        String title,
        String author,
        String gender,
        Status status,
        int librarian) {
}
