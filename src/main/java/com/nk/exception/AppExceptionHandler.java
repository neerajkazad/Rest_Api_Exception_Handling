package com.nk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<ErrorInfo> handleUserNotFoundExcpetion(Exception e){
        String exceptionMsg = e.getMessage();

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode("SBIEX0001");
        errorInfo.setMessage(exceptionMsg);
        errorInfo.setWhen(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ErrorInfo> handleGenericException(Exception e){
        String exceptionMsg = e.getMessage();

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode("SBIEX0003");
        errorInfo.setMessage(exceptionMsg);
        errorInfo.setWhen(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
