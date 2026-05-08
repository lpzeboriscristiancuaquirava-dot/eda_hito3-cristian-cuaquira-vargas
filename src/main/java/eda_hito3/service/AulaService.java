package eda_hito3.service;

import org.springframework.stereotype.Service;

@Service
public class AulaService {

    private int[][] aula = new int[5][15];

    public AulaService() {

        for(int i = 0; i < 5; i++) {

            for(int j = 0; j < 15; j++) {
                aula[i][j] = 1;
            }
        }
    }

    public String ocupar(int fila, int columna) {

        aula[fila][columna] = 0;

        return "Asiento ocupado";
    }

    public String liberar(int fila, int columna) {

        aula[fila][columna] = 1;

        return "Asiento liberado";
    }

    public int[][] mostrar() {
        return aula;
    }

    public int ocupados() {

        int contador = 0;

        for(int i = 0; i < 5; i++) {

            for(int j = 0; j < 15; j++) {

                if(aula[i][j] == 0) {
                    contador++;
                }
            }
        }

        return contador;
    }
}