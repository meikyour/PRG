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
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final int DNI_NUMERO = 29211661;
    public static final char DNI_CONTROL = 'M';

    public static final String SI = "SÍ";
    public static final String NO = "NO";

    //Variable que determina si corresponde la letra con el DNI.
    String correcto;
    //Variable que determina la letra que le corresponde a ese número de DNI.
    char posicion;
    //String correspondencia;

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        //Calcula le latra del DNI en base al número.
        char letraCorrecta = calcularLetraDNI(DNI_NUMERO);

        //Comprueba si letra y el número de DNI se corresponden.
        boolean controlLetra = comprobarletraDNI(DNI_NUMERO, DNI_CONTROL);

        //Mensaje con la letra y número de DNI, que determina si es correcto o no.
        System.out.printf("DNI....: %d-%c >>>>> %s es correcto.", DNI_NUMERO, DNI_CONTROL, correcto);

    }

    //Comprueba si la letra y el número de DNI se corresponden.
    private boolean comprobarletraDNI(int num, char ctr) {

        //Variable.
        boolean letraOK;

        if (ctr == posicion) {
            letraOK = true;
            correcto = SI;
        } else {
            letraOK = false;
            correcto = NO;
        }

        //Devolver valor boolean.
        return letraOK;
    }

    //Calculo de la letra correspondiente al numero de DNI.
    private char calcularLetraDNI(int num) {

        posicion = LETRAS.charAt(num % 23);

        //Devolver char posición.
        return posicion;
    }

}
