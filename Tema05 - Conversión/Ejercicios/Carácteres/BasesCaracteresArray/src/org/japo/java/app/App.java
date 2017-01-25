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

    //Constantes String.
    public static final String NUMERACION = "#";
    public static final String DECIMAL = "DECIMAL";
    public static final String OCTAL = "OCTAL";
    public static final String UNICODE = "UNICODE";
    public static final String SIMBOLO = "SIMBOLO";

    //Constantes Carácteres.
    public static final char NUMO1 = '7';
    public static final char NUMO2 = '\100';
    public static final char NUMO3 = (char) 88;
    public static final char NUMO4 = '\u0062';
    public static final char NUMO5 = (char) 126;
    public static final char NUMO6 = '\251';
    public static final char NUMO7 = 'Ω';
    public static final char NUMO8 = (char) 1161;
    public static final char NUMO9 = '\u058D';
    public static final char NUM10 = '٨';
    public static final char NUM11 = (char) 8359;
    public static final char NUM12 = '\u20AC';
    public static final char NUM13 = '㉇';
    public static final char NUM14 = (char) 13357;
    public static final char NUM15 = '\uE2C6';

    // Insanciación del Array "caracteres".
    public static char[] caracteres = {NUMO1, NUMO2, NUMO3, NUMO4, NUMO5, NUMO6, NUMO7, NUMO8, NUMO9, NUM10, NUM11, NUM12, NUM13, NUM14, NUM15};

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        //Ejecución del método.
        mostrarCaracteres();
    }

    //Método que muestra los números en la disitintas bases.
    public void mostrarCaracteres() {

        //Mensaje que muestra el tipo de número que mostrará debajo.
        System.out.printf("%-4s %-5s  %-7s  %-7s  %-7s\n", NUMERACION, OCTAL, DECIMAL, UNICODE, SIMBOLO);

        //Bucle para localizar la posición correspondiente del Array.
        for (int veces = 0; veces < 15; veces++) {
            //Mensaje con el carácter y cada base numérica.
            System.out.printf("%-4d 0%-7o  %-6d  u%-4x  %4c\n", veces + 1, (int) caracteres[veces], (int) caracteres[veces], (int) caracteres[veces], caracteres[veces]);
        }
    }

}
