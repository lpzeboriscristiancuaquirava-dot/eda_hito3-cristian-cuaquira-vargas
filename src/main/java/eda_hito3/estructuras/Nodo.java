package eda_hito3.estructuras;

import eda_hito3.model.Estudiante;

public class Nodo {

    public Estudiante estudiante;
    public Nodo siguiente;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.siguiente = null;
    }
}
