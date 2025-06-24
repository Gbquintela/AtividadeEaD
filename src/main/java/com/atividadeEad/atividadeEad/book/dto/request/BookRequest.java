package com.atividadeEad.atividadeEad.book.dto.request;

import com.atividadeEad.atividadeEad.book.Book;
import com.atividadeEad.atividadeEad.book.enums.Status;
import com.atividadeEad.atividadeEad.librarian.Librarian;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public record BookRequest(

        @NotBlank(message = "Titulo não pode ser vazio")
        @Size(min = 3, max = 70)
        String title,

        @NotBlank(message = "Autor não pode ser vazio")
        @Size(min = 2, max = 50)
        String author,

        @NotBlank(message = "Gênero não pode ser vazio")
        String gender,

        @NotNull(message = "Status não pode ser vazio ")
        Status status,

        int librarianId

) {

    public Book toBook(
            Librarian librarian
    ){

        Book book = new Book();

        book.setTitle(title);
        book.setAuthor(author);
        book.setGender(gender);
        book.setStatus(status);


        book.setLibrarian(librarian);

        return book;

    }

}
