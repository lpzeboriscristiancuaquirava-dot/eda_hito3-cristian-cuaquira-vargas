package eda_hito3.estructuras;

import eda_hito3.model.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class ListaEstudiantes {

    private Nodo cabeza;

    public void insertar(Estudiante estudiante) {

        Nodo nuevo = new Nodo(estudiante);

        if(cabeza == null) {
            cabeza = nuevo;
        } else {

            Nodo actual = cabeza;

            while(actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    public List<Estudiante> mostrar() {

        List<Estudiante> lista = new ArrayList<>();

        Nodo actual = cabeza;

        while(actual != null) {

            lista.add(actual.estudiante);
            actual = actual.siguiente;
        }

        return lista;
    }

    public Estudiante buscar(String nombre) {

        Nodo actual = cabeza;

        while(actual != null) {

            if(actual.estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return actual.estudiante;
            }

            actual = actual.siguiente;
        }

        return null;
    }

    public List<Estudiante> ordenados() {

        List<Estudiante> lista = mostrar();

        for(int i = 0; i < lista.size(); i++) {

            for(int j = 0; j < lista.size() - 1; j++) {

                if(lista.get(j).getPuntaje()
                        < lista.get(j + 1).getPuntaje()) {

                    Estudiante aux = lista.get(j);

                    lista.set(j, lista.get(j + 1));

                    lista.set(j + 1, aux);
                }
            }
        }

        return lista;
    }
}
