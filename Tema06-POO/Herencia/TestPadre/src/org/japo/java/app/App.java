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

import org.japo.java.entities.Hijo;
import org.japo.java.entities.Padre;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        System.out.println("------ Objeto Padre 01-------");
        Padre p1 = new Padre();
        p1.setNombre("Pepe");
        System.out.println(p1.getNombre());
        p1.saludar();
        System.out.println();

        System.out.println("------ Objeto Padre 02-------");
        Padre p2 = new Padre();
        p2.setNombre("Pi");
        System.out.println(p2.getNombre());
        p2.saludar();

        System.out.println();
        System.out.println("------ Objeto Hijo 01-------");
        Hijo h1 = new Hijo();
        h1.setNombre("Federico");
        System.out.println(h1.getNombre());
        h1.saludar();
        System.out.println();

        System.out.println("------ Objeto Hijo 02-------");
        Hijo h2 = new Hijo();
        h2.setNombre("Fe");
        System.out.println(h2.getNombre());
        h2.saludar();
    }

}
