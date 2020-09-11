package com.gsm.exception.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExceptionResult {

    private LocalDateTime timestamp = LocalDateTime.now();
    private int status = 500;
    private String error = "Internal Server Error";
    private String message;
    private String path;
}
