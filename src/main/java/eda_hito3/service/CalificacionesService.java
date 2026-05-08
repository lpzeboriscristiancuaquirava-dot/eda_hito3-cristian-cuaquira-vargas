package eda_hito3.service;

import org.springframework.stereotype.Service;

@Service
public class CalificacionesService {

    private int[] notas = new int[110];
    private int indice = 0;

    public String agregarNota(int valor) {

        if(indice >= notas.length){
            return "Arreglo lleno";
        }

        notas[indice] = valor;
        indice++;

        return "Nota agregada";
    }

    public int[] mostrarNotas() {

        return notas;
    }

    public double promedio() {

        int suma = 0;

        for(int i = 0; i < indice; i++) {
            suma += notas[i];
        }

        return (double) suma / indice;
    }

    public int maximo() {

        int max = notas[0];

        for(int i = 1; i < indice; i++) {

            if(notas[i] > max) {
                max = notas[i];
            }
        }

        return max;
    }

    public int minimo() {

        int min = notas[0];

        for(int i = 1; i < indice; i++) {

            if(notas[i] < min) {
                min = notas[i];
            }
        }

        return min;
    }
}