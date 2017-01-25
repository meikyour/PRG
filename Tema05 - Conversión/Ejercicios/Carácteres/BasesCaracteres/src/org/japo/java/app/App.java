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

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
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

    //Constantes para contabilizar.
    public static final int N01 = 1;
    public static final int N02 = 2;
    public static final int N03 = 3;
    public static final int N04 = 4;
    public static final int N05 = 5;
    public static final int N06 = 6;
    public static final int N07 = 7;
    public static final int N08 = 8;
    public static final int N09 = 9;
    public static final int N10 = 10;
    public static final int N11 = 11;
    public static final int N12 = 12;
    public static final int N13 = 13;
    public static final int N14 = 14;
    public static final int N15 = 15;

    public void lanzarAplicacion() {

        mostrarCaracteres();
    }

    //Método que muestra los números en la disitintas bases.
    public void mostrarCaracteres() {

        //Mensaje que muestra el tipo de número que mostrará debajo.
        System.out.printf("%-4S %-5s  %-7s  %-7s  %-7s\n", NUMERACION, OCTAL, DECIMAL, UNICODE, SIMBOLO);

        //Mensaje con el carácter y cada base numérica.
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N01, (int) NUMO1, (int) NUMO1, (int) NUMO1, NUMO1);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N02, (int) NUMO2, (int) NUMO2, (int) NUMO2, NUMO2);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N03, (int) NUMO3, (int) NUMO3, (int) NUMO3, NUMO3);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N04, (int) NUMO4, (int) NUMO4, (int) NUMO4, NUMO4);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N05, (int) NUMO5, (int) NUMO5, (int) NUMO5, NUMO5);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N06, (int) NUMO6, (int) NUMO6, (int) NUMO6, NUMO6);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N07, (int) NUMO7, (int) NUMO7, (int) NUMO7, NUMO7);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N08, (int) NUMO8, (int) NUMO8, (int) NUMO8, NUMO8);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N09, (int) NUMO9, (int) NUMO9, (int) NUMO9, NUMO9);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N10, (int) NUM10, (int) NUM10, (int) NUM10, NUM10);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N11, (int) NUM11, (int) NUM11, (int) NUM11, NUM11);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N12, (int) NUM12, (int) NUM12, (int) NUM12, NUM12);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N13, (int) NUM13, (int) NUM13, (int) NUM13, NUM13);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N14, (int) NUM14, (int) NUM14, (int) NUM14, NUM14);
        System.out.printf("%-4s 0%-7o  %-6d  u%-4x  %4c\n", N15, (int) NUM15, (int) NUM15, (int) NUM15, NUM15);
    }

}
