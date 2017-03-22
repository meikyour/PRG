/* 
 * Copyright 2016  - Raul Granel - raul.granel@gmail.com.
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
package org.japo.java.app;

import java.util.Random;
import java.util.Scanner;
import org.japo.java.lib.UtilesArray;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    final static char CHAR_MIN = '!';
    final static char CHAR_MAX = '~';

    final static Random RND = new Random(System.currentTimeMillis());
    final static Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public void lanzarAplicacion() {
        
        // Array de caracteres
        char[] simbolos = new char[5];

        // Llenar array caracteres aleatorios
        for (int i = 0; i < simbolos.length; i++) {
            simbolos[i] = (char) (RND.nextInt(CHAR_MAX - CHAR_MIN) + CHAR_MIN);
        }

        // Pedir caracter de busqueda
        System.out.printf("Buscar........: ");
        char clave = SCN.nextLine().charAt(0);

        // Mostrar contenido array
        for (int i = 0; i < simbolos.length; i++) {
            System.out.printf("Símbolo %d..........: %c\n", i + 1, simbolos[i]);
        }

        // Buscar caracter
        int resultado = UtilesArray.buscarCaracterArray(simbolos, clave);

        // Analisis resultado
        if (resultado == -1) {
            System.out.printf("Simbolo....: %c - No encontrado.\n", clave);
        } else {
            System.out.printf("Simbolo....: %c - Sí encontrado - Posición....: %d\n", clave, resultado);
        }
    }

}
