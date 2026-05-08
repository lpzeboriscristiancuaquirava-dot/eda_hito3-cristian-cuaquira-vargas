package eda_hito3.controller;

import eda_hito3.model.Estudiante;
import eda_hito3.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    @GetMapping("/agregar")
    public String agregar(
            @RequestParam int id,
            @RequestParam String nombre,
            @RequestParam int puntaje) {

        return service.agregar(id, nombre, puntaje);
    }

    @GetMapping
    public List<Estudiante> mostrar() {
        return service.mostrar();
    }

    @GetMapping("/ordenados")
    public List<Estudiante> ordenados() {
        return service.ordenados();
    }

    @GetMapping("/buscar/{nombre}")
    public Estudiante buscar(@PathVariable String nombre) {
        return service.buscar(nombre);
    }
}