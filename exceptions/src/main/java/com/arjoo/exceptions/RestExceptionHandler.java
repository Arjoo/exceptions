package com.arjoo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<ApiError> userNotFoundException(UserNotFoundException userException) {
        ApiError error = new ApiError("400", userException.getMessage(), new Date());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
