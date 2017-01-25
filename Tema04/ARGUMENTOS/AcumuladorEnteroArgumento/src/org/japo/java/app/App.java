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

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    //Constantes.
    public static final int BASE = 2;
    public static final int EXPONENTE = 6;

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        int resultado = elevarEntero(BASE, EXPONENTE);

        //Mensaje.
        System.out.printf("El resultado de la potencia de %d elevado a %d es %d\n", BASE, EXPONENTE, resultado);
    }

    private int elevarEntero(int base, int exponente) {

        int resultado = 0;

        //Bucle para controlar las veces que se va a elevar el número sobre si mismo.
        for (int veces = 1; veces <= exponente; veces++) {
            resultado += base;
            //int resultado = base * resultado;
        }
        //Devuelve resultado.
        return resultado;
    }

}

