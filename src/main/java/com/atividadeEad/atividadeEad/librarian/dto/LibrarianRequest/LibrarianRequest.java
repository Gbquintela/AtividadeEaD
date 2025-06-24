package com.atividadeEad.atividadeEad.librarian.dto.LibrarianRequest;

import com.atividadeEad.atividadeEad.librarian.Librarian;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LibrarianRequest(
        @NotBlank(message = "Nome não pode ser vazio!")
        @Size(min = 3, max = 50)
        String name,

        @Email(message = "Email invalido!")
        @NotBlank(message = "Campo Email não pode ser vazio!")
        String email,

        @NotBlank(message = "Senha não pode fica vazia!")
        @Size(min = 8)
        String password,

        @NotBlank(message = "Confirmação de senha não pode fica vazia!")
        @Size(min = 8)
        String ConfirmPassword
) {

    public Librarian toLibrarian(){
        Librarian librarian = new Librarian();

        librarian.setName(name);
        librarian.setEmail(email);
        if (password.equals(ConfirmPassword)) {
            librarian.setPassword(password);
        }

        return librarian;

        }
    }



