package com.atividadeEad.atividadeEad.book.exception.infra;

import com.atividadeEad.atividadeEad.book.exception.NoBooksFoundException;
import com.atividadeEad.atividadeEad.core.exception.RestErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerNoBooksFound {

    @ExceptionHandler(NoBooksFoundException.class)
    private ResponseEntity<RestErrorMessage> noBookFound(NoBooksFoundException exception){
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(treatResponse);
    }


}
