package org.cap.apps.customerrest.exceptions;

import org.cap.apps.customerrest.exceptions.InvalidAgeException;
import org.cap.apps.customerrest.exceptions.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {
	

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CustomerNotFoundException.class)
    public String handleStudentNotFound(CustomerNotFoundException e){
         return e.getMessage();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidAgeException.class)
    public String handleInvalidAge(InvalidAgeException e){
        return e.getMessage();

}

}