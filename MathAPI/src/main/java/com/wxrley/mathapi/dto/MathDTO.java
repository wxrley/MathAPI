package com.wxrley.mathapi.dto;

/**
 *
 * DTO de transferência entre Controller e Cliente.
 * Padroniza estrutura de respostas da API.
 */
public class MathDTO {
    private double result;
    private String operation;

    public MathDTO(double result, String operation) {
        this.result = result;
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public String getOperation() {
        return operation;
    }
}