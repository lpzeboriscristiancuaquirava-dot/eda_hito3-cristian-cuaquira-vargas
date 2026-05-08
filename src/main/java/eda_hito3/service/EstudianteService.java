package eda_hito3.service;

import eda_hito3.estructuras.ListaEstudiantes;
import eda_hito3.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private ListaEstudiantes lista = new ListaEstudiantes();

    public String agregar(int id, String nombre, int puntaje) {

        lista.insertar(new Estudiante(id, nombre, puntaje));

        return "Estudiante agregado";
    }

    public List<Estudiante> mostrar() {
        return lista.mostrar();
    }

    public List<Estudiante> ordenados() {
        return lista.ordenados();
    }

    public Estudiante buscar(String nombre) {
        return lista.buscar(nombre);
    }
}
