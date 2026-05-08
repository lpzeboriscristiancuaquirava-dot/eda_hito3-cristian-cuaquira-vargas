package eda_hito3.controller;

import eda_hito3.service.AulaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aula")
public class AulaController {

    private final AulaService service;

    public AulaController(AulaService service) {
        this.service = service;
    }

    @GetMapping
    public int[][] mostrar() {
        return service.mostrar();
    }

    @GetMapping("/ocupados")
    public int ocupados() {
        return service.ocupados();
    }

    @GetMapping("/ocupar")
    public String ocupar(
            @RequestParam int fila,
            @RequestParam int columna) {

        return service.ocupar(fila, columna);
    }

    @GetMapping("/liberar")
    public String liberar(
            @RequestParam int fila,
            @RequestParam int columna) {

        return service.liberar(fila, columna);
    }
}