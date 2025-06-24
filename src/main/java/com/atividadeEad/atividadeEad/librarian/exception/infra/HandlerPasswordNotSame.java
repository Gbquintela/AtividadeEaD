package com.atividadeEad.atividadeEad.librarian.exception.infra;

import com.atividadeEad.atividadeEad.core.exception.RestErrorMessage;
import com.atividadeEad.atividadeEad.librarian.exception.PasswordNotTheSameException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerPasswordNotSame {

    @ExceptionHandler(PasswordNotTheSameException.class)
    private ResponseEntity<RestErrorMessage> passwordNotSame(
            PasswordNotTheSameException exception
    ){
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.BAD_REQUEST,
                exception.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(treatResponse);
    }


}
