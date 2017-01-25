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
    //Valor arbitrario.
    final static int NUM = 8;
    //Valor mínimo.
    final static int MAX = 2;
    //Valor máximo.
    final static int MIN = 26;

    //Variable String delimitando el rango.
    String rangoCorrecto;

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        boolean rango = analizarEntero(NUM, MAX, MIN);
        System.out.println("El rango del número está......: " + rangoCorrecto);
    }

    private boolean analizarEntero(int num, int min, int max) {

        //Variables.
        boolean rangoOK;
        String dentro = "DENTRO";
        String fuera = "FUERA";

        //Calculo del rango.
        if (num >= min && num <= max) {
            rangoOK = true;
            rangoCorrecto = dentro;
        } else {
            rangoOK = false;
            rangoCorrecto = fuera;
        }
        //Devolver valor.
        return rangoOK;
    }

}
