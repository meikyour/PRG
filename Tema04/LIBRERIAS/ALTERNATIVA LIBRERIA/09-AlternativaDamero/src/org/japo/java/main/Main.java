/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Referencias
        final int TABLERO_ANCHO = 400;
        final int TABLERO_ALTO = 400;
        final char FILA_MIN = 1;
        final char FILA_MAX = 8;
        final char COLU_MIN = 'a';
        final char COLU_MAX = 'h';

        // Variables
        int xAct;
        int yAct;
        int filaAct;
        char coluAct;
        
        // Tamaño del damero
        int numFilas = FILA_MAX - FILA_MIN + 1;
        int numColus = COLU_MAX - COLU_MIN + 1;
        
        // Tamaño de casilla
        int altoFila = TABLERO_ALTO / numFilas;
        int anchoColu = TABLERO_ANCHO / numColus;

        // Instanciar objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Introducir la coordenada X
        System.out.print("Coordenada X ...: ");
        xAct = sc.nextInt();

        // Introducir la coordenada Y
        System.out.print("Coordenada Y ...: ");
        yAct = sc.nextInt();

        // Columna actual
        if (xAct >= 0 && xAct < TABLERO_ANCHO) {
            coluAct = (char) (xAct / anchoColu + COLU_MIN);
        } else {
            coluAct = '?';
        }

        // Fila actual
        if (yAct >= 0 || yAct < TABLERO_ALTO) {
            filaAct = (char) (yAct / altoFila + FILA_MIN);
        } else {
            filaAct = '?';
        }

        // Muestra la posición equivalente
        if (coluAct == '?' || filaAct == '?') {
            System.out.println("Posición incorrecta");
        } else {
            System.out.printf("Posición .......: %c%d\n", coluAct, filaAct);
        }
    }
}
