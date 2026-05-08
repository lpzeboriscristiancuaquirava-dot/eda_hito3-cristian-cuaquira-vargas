package eda_hito3.controller;

import eda_hito3.service.CalificacionesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notas")
public class CalificacionesController {

    private final CalificacionesService service;

    public CalificacionesController(CalificacionesService service) {
        this.service = service;
    }

    @GetMapping("/agregar")
    public String agregar(@RequestParam int valor) {
        return service.agregarNota(valor);
    }

    @GetMapping
    public int[] mostrar() {
        return service.mostrarNotas();
    }

    @GetMapping("/promedio")
    public double promedio() {
        return service.promedio();
    }

    @GetMapping("/max")
    public int maximo() {
        return service.maximo();
    }

    @GetMapping("/min")
    public int minimo() {
        return service.minimo();
    }
}