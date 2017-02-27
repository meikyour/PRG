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

import org.japo.java.entities.Articulo;
/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        // ---------- Objeto Constructor Predeterminado ----------------.
        Articulo p1 = new Articulo();
        System.out.println(p1.getPrecio());
        p1.setPrecio(23.0);
        System.out.println(p1.getPrecio());
        p1.mostrarPrecio();

        System.out.println();
        // ------------- Objeto Constructor Parametizado ---------------.
        Articulo p2 = new Articulo(256);
        System.out.println(p2.getPrecio());
        p2.setPrecio(-158);
        System.out.println(p2.getPrecio());
        p2.mostrarPrecio();
    }

}