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
        // Constantes
        final String NOMBRE_PERSONA = "Jaimito";
        final String NOMBRE_ENCARGO = "Patatas";
        final String NOMBRE_ANTOJO = "Piruleta";
        final int CANTIDAD_ENCARGO = 3;
        final double PRECIO_PATATAS = 0.30;
        final double PRECIO_PIRULETA = 0.20;
        final double DINERO_INICIAL = 1.0;
        
        // Variables 
        double vueltas;
        int numeroKilos;

        // Mensajes del supuesto
        System.out.printf("Persona encargada .....: %s\n", NOMBRE_PERSONA);
        System.out.printf("Artículo encargado ....: %s\n", NOMBRE_ENCARGO);
        System.out.printf("Cantidad encargada ....: %d kg\n", CANTIDAD_ENCARGO);
        System.out.printf("Precio encargo ........: %.2f €/kg\n", PRECIO_PATATAS);
        System.out.printf("Dinero suministrado ...: %.2f €\n", DINERO_INICIAL);
        System.out.printf("Artículo imprevisto ...: %s\n", NOMBRE_ANTOJO);
        System.out.printf("Precio imprevisto .....: %.2f €\n", PRECIO_PIRULETA);

        // Recalcula el dinero disponible para el encargo
        vueltas = DINERO_INICIAL - PRECIO_PIRULETA;
        numeroKilos = (int) (vueltas / PRECIO_PATATAS);

        // Mensajes del supuesto
        System.out.printf("Cantidad comprada .....: %d kg\n",
                numeroKilos);
        System.out.printf("Dinero devuelto .......: %.2f €\n",
                DINERO_INICIAL - PRECIO_PIRULETA - numeroKilos * PRECIO_PATATAS);
    }
}
