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
        final String NOMBRE_PERSONA = "Marta";
        final String NOMBRE_OBJETO = "Pulsera hippy";
        final double PRECIO_OBJETO = 0.5;
        final double DINERO_INICIAL = 1.0;
        
        // Variables
        double dineroRestante = DINERO_INICIAL - PRECIO_OBJETO;

        // Mensajes del supuesto
        System.out.printf("Nombre de la niña ...: %s\n", NOMBRE_PERSONA);
        System.out.printf("Artículo a comprar ..: %s\n", NOMBRE_OBJETO);
        System.out.printf("Precio artículo .....: %.2f €\n", DINERO_INICIAL);
        System.out.printf("Dinero restante .....: %.2f €\n", dineroRestante);
    }
}
