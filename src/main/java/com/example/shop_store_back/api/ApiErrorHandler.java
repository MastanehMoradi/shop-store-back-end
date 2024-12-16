package com.example.shop_store_back.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiErrorHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ExceptionMessage notFoundException (RuntimeException ex){
        return new ExceptionMessage(ex.getMessage());
    }



    class ExceptionMessage {
        String message;
        String statusCode;

        public ExceptionMessage(String message) {
            this.message = message;
        }
    }
}
