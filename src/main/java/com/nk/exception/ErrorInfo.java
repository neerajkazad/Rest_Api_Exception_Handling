package com.nk.exception;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class ErrorInfo {
    private String code;

    private String message;

    private LocalDateTime when;

}
