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

import org.japo.java.entities.Decimo;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        System.out.println("Objeto 1 : Pongo valores dentro del rango correcto.");
        // Objeto 1 : Pongo valores dentro del rango correcto.
        Decimo d1 = new Decimo();
        d1.setNumero(45);
        d1.setSerie(26);
        d1.setFraccion(8);
        d1.mostrarDecimo();

        System.out.println();
        System.out.println("Objeto 2 : Ponemos valores fuera del rango.");
        // Objeto 2 : Ponemos valores fuera del rango.
        Decimo d2 = new Decimo();
        d2.setNumero(28902254);
        d2.setSerie(680);
        d2.setFraccion(32);
        d2.mostrarDecimo();

        System.out.println();
        System.out.println("Objeto 3 : No pongo valores, salen los valores por defecto.");
        // Objeto 3 : No pongo valores, salen los valores por defecto.
        Decimo d3 = new Decimo();
        d3.mostrarDecimo();
    }

}
