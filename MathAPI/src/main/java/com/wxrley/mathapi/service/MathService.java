package com.wxrley.mathapi.service;

import org.springframework.stereotype.Service;

/**
 * Contém a lógica de negócio da aplicação.
 * Chamado pelo Controller para processar operações.
 */
@Service
public class MathService {

    public double sum(Double n1, Double n2) {
        return n1 + n2;
    }

    public double subtraction(Double n1, Double n2) {
        return n1 - n2;
    }

    public double multiplication(Double n1, Double n2) {
        return n1 * n2;
    }

    public double division(Double n1, Double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return n1 / n2;
    }

    public double squareRoot(Double n) {
        if (n < 0) {
            throw new ArithmeticException("Raiz quadrada de número negativo não permitida");
        }
        return Math.sqrt(n);
    }

    public double cubeRoot(Double n) {
        return Math.cbrt(n);
    }

    public double power(Double base, Double exponent) {
        return Math.pow(base, exponent);
    }

    public double powerOfTen(Double exponent) {
        return Math.pow(10, exponent);
    }

    public String binary(Double n) {
        return Integer.toBinaryString(n.intValue());
    }

    public double factorial(Double n) {
        int num = n.intValue();

        if (num < 0) {
            throw new ArithmeticException("Fatorial de número negativo não existe");
        }

        double result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public double piValue() {
        return Math.PI;
    }
}