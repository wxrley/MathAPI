package com.wxrley.mathapi.controller;

import com.wxrley.mathapi.dto.MathDTO;
import com.wxrley.mathapi.service.MathService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Recebe requisições HTTP da API.
 * Delega processamento ao Service e retorna respostas.
 * Swagger UI: http://localhost:8080/swagger-ui/index.html
 */
@Tag(name = "Math Operations", description = "Endpoints para cálculos matemáticos")
@RestController
@RequestMapping("/math")
public class MathController {

    private final MathService service;

    public MathController(MathService service) {
        this.service = service;
    }

    /**
     * Endpoint REST para soma de dois números.
     * Recebe n1 e n2 via query parameters, delega cálculo para MathService.sum().
     * Retorna ResponseEntity com Math contendo resultado e nome da operação.
     */
    @Operation(summary = "Soma")
    @GetMapping("/sum")
    public ResponseEntity<MathDTO> sum(@RequestParam Double n1, @RequestParam Double n2) {
        double result = service.sum(n1, n2);
        return ResponseEntity.ok(new MathDTO(result, "sum"));
    }

    @Operation(summary = "Subtração")
    @GetMapping("/subtraction")
    public ResponseEntity<MathDTO> subtraction(@RequestParam Double n1, @RequestParam Double n2) {
        double result = service.subtraction(n1, n2);
        return ResponseEntity.ok(new MathDTO(result, "subtraction"));
    }

    @Operation(summary = "Multiplicação")
    @GetMapping("/multiplication")
    public ResponseEntity<MathDTO> multiplication(@RequestParam Double n1, @RequestParam Double n2) {
        double result = service.multiplication(n1, n2);
        return ResponseEntity.ok(new MathDTO(result, "multiplication"));
    }

    @Operation(summary = "Divisão")
    @GetMapping("/division")
    public ResponseEntity<MathDTO> division(@RequestParam Double n1, @RequestParam Double n2) {
        double result = service.division(n1, n2);
        return ResponseEntity.ok(new MathDTO(result, "division"));
    }

    @Operation(summary = "Raiz Quadrada")
    @GetMapping("/square-root")
    public ResponseEntity<MathDTO> squareRoot(@RequestParam Double n) {
        double result = service.squareRoot(n);
        return ResponseEntity.ok(new MathDTO(result, "square-root"));
    }

    @Operation(summary = "Raiz Cúbica")
    @GetMapping("/cube-root")
    public ResponseEntity<MathDTO> cubeRoot(@RequestParam Double n) {
        double result = service.cubeRoot(n);
        return ResponseEntity.ok(new MathDTO(result, "cube-root"));
    }

    @Operation(summary = "Potência")
    @GetMapping("/power")
    public ResponseEntity<MathDTO> power(@RequestParam Double base, @RequestParam Double exponent) {
        double result = service.power(base, exponent);
        return ResponseEntity.ok(new MathDTO(result, "power"));
    }

    @Operation(summary = "Binário")
    @GetMapping("/binary")
    public ResponseEntity<String> binary(@RequestParam Double n) {
        String result = service.binary(n);
        return ResponseEntity.ok(result);
    }

    @Operation(summary = "Potência de Dez")
    @GetMapping("/power-of-ten")
    public ResponseEntity<MathDTO> powerOfTen(@RequestParam Double exponent) {
        double result = service.powerOfTen(exponent);
        return ResponseEntity.ok(new MathDTO(result, "power-of-ten"));
    }

    @Operation(summary = "Fatorial")
    @GetMapping("/factorial")
    public ResponseEntity<MathDTO> factorial(@RequestParam Double n) {
        double result = service.factorial(n);
        return ResponseEntity.ok(new MathDTO(result, "factorial"));
    }

    @Operation(summary = "Valor de PI")
    @GetMapping("/pi")
    public ResponseEntity<MathDTO> piValue() {
        double result = service.piValue();
        return ResponseEntity.ok(new MathDTO(result, "pi"));
    }
}