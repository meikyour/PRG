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

public class Main {

    public static void main(String[] args) {
        // Datos del supuesto
        final double DINERO_INICIAL = 2.0;
        final double PRECIO_PELICULA = 1.30;
        final double PRECIO_PALOMITAS = 0.90;
        
        // Variables
        double partePalomitas = PRECIO_PALOMITAS / 2;
        double dineroRestante = DINERO_INICIAL - PRECIO_PELICULA - partePalomitas;

        // Mensajes del supuesto
        System.out.printf("Dinero inicial  ....: %.2f\n", DINERO_INICIAL);
        System.out.printf("Precio pelicula ....: %.2f\n", PRECIO_PELICULA);
        System.out.printf("Parte palomitas ....: %.2f\n", partePalomitas);
        System.out.printf("Dinero restante ....: %.2f\n", dineroRestante);
    }
}
