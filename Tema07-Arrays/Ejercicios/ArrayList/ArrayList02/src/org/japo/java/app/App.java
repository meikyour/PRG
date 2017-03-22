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

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        ArrayList<String> lista = new ArrayList<>();

        // Primera parte del ejercicio.
        // Añadido.
        lista.add("Texto 01");
        lista.add("Texto 02");
        lista.add("Texto 03");

        //Longitud
        System.out.printf(" Posicion ...: %d\n\n", lista.size());

        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            System.out.printf(" Elemento ....: %s\n", it.next());
        }

        //Separación.
        System.out.println("");

        //Segunda parte del ejercicio.        
        // Borrado. 
        lista.remove(1);

        //  Regeneració. 
        it = lista.iterator();

        while (it.hasNext()) {
            System.out.printf(" Elemento ....: %s\n", it.next());
        }
    }

}
