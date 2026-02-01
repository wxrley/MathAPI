package com.wxrley.mathapi.dto;

import java.time.LocalDateTime;

/**
 * DTO de resposta para erros da API.
 * Utilizado por GlobalExceptionHandler para padronizar mensagens de erro.
 */
public class ErrorDTO {

    private String message;
    private int status;
    private LocalDateTime timestamp;

    public ErrorDTO(String message, int status) {
        this.message = message;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}