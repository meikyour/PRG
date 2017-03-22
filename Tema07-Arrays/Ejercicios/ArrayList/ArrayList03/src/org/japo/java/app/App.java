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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        //Declaraciones 
        String[] nombres = {"juanito", "pablito", "jorgito", "pablito", "juanito"};

        List<String> listaNombres = Arrays.asList(nombres);

        ArrayList<String> lista = new ArrayList<>(listaNombres);

        Iterator<String> it = lista.iterator();

        //Consola
        System.out.println("Sobrinos de Donald");

        // Bucle que muestra los nombres de los sobrinos 
        while (it.hasNext()) {
            System.out.printf(" Sobrinos ....: %s\n", it.next());

        }

        // Consola, mostrando la cantidad de sobrinos.
        System.out.printf(" Sobrinos ...: %d\n", lista.size());
        System.out.println("");

        /* Reutilizando el Iterator para probar que en el bucle si se cumple el if eliminara el nombre que deseas mediante un "remove",
         *simpre y cuando el if se cumpla.
         */
        it = lista.iterator();

        while (it.hasNext()) {
            String elementos = (String) it.next();

            if (elementos.equals("pablito")) {
                it.remove();
            }
        }

        // Reutilizando el Iterator Para que le muestre el resultado final.
        it = lista.iterator();

        System.out.println("Sobrinos [Autenticos] de Donald");

        while (it.hasNext()) {
            System.out.printf(" Sobrinos ....: %s\n", it.next());
        }

        // Mostrando la cantidad de sobrinos final tras el ultimo bucle
        System.out.printf(" Sobrinos ...: %d\n", lista.size());
    }

}
