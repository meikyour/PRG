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

// Importación del paquete de la libreria.
import org.japo.java.lib.UtilesArray;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        // Constantes.
        final int LONG_LISTA = 5;
        final double MIN = 0;
        final double MAX = 42;

        // Instancia Array.
        double[] lista = new double[LONG_LISTA];

        // Método que rellena el Array con valores aleatorios.
        UtilesArray.llenarArrayAleatorio(lista, MIN, MAX);

        // Muestra lo que hay en el Array en cada posición.
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("Dato %d........: %.2f\n", i + 1, lista[i]);
        }

        // Muestra el total acumulado por el Array.
        System.out.printf("Total suma........: %.2f\n", UtilesArray.sumarArrayReal(lista));
    }

}
