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

import org.japo.java.lib.TiposPrimitivos;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public static final double N1 = 2.2;
    public static final double N2 = 6.8;

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        // Uso del método "relacion", obtiene la relación entre los números.
        int relacion = TiposPrimitivos.obtenerRelacion(N1, N2);

        // Variable asignar nombre a la relación obtenida.
        String nombreRelacion = "";

        // Asigna el nombre a la relación obtenida.
        switch (relacion) {
            case -1:
                nombreRelacion = "MENOR";
                break;
            case 0:
                nombreRelacion = "IGUAL";
                break;
            case 1:
                nombreRelacion = "MAYOR";
                break;
            default:
                throw new AssertionError();
        }

        // Mensaje del método "relacion".
        System.out.printf("El número %.2f es %s que el número %.2f. ", N1, nombreRelacion, N2);
    }

}
