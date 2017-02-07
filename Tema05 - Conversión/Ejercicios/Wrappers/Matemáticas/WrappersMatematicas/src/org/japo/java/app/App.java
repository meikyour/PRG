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
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        System.out.println("Número PI............: " + Math.PI);
        System.out.println("Número E (Euler).....: " + Math.E);
        System.out.println("30º en Radianes.......: " + Math.PI / 6);
        System.out.println("45º en Radianes.......: " + Math.PI / 4);
        System.out.println("60º en Radianes.......: " + Math.PI / 3);
        System.out.println("90º en Radianes.......: " + Math.PI / 2);
        System.out.println("180º en Radianes......: " + Math.PI);
        System.out.println("270º en Radianes......: " + 3 * Math.PI / 2);
        System.out.println("360º en Radianes......: " + 2 * Math.PI);

        System.out.println();
        System.out.println("Seno de PI / 2............: " + Math.sin(Math.PI / 2));
        System.out.println("Tangente de PI / 4........: " + Math.tan(Math.PI / 4));
        System.out.println("Coseno de PI / 2..........: " + Math.cos(Math.PI / 2));

        System.out.println();
        System.out.println("--------Valores equivalentes------");
        // Valores que son iguales.
        System.out.println("Arcoseno de 1.0...........: " + Math.asin(1));
        System.out.println("90º en Radianes...........: " + Math.PI / 2);

        // Valores que son iguales.
        System.out.println();
        System.out.println("Arcotangente de 1.0.......: " + Math.atan(1));
        System.out.println("45º en Radianes...........: " + Math.PI / 4);

        // Valores que son iguales.
        System.out.println();
        System.out.println("Arcoseno de 0.0...........: " + Math.acos(1));
        System.out.println("90º en Radianes...........: " + Math.PI / 2);

        System.out.println();
        System.out.println("----Valores absolutos----");
        System.out.println("Valor absoluto de 5.......: " + Math.abs(5));
        System.out.println("Valor absoluto de -5......: " + Math.abs(-5));

        System.out.println();
        System.out.println("----Suma----");
        System.out.println("Suma de 3 y 7..............: " + Math.addExact(3, 7));
        System.out.println("Suma de 3L y 7L............: " + Math.addExact(3L, 7L));

        System.out.println();
        System.out.println("-------- Cubo --- Techo --- Suelo ---------");
        System.out.println("Cubo de 3..................: " + Math.cbrt(3));
        System.out.println("Techo de 3.21..............: " + Math.ceil(3.21));
        System.out.println("Suelo de 3.21..............: " + Math.floor(3.21));

        System.out.println();
        System.out.println("----- Redondeos -----");
        // De double redondea a long.
        System.out.println("Redondeo long de 3.21......: " + Math.round(3.21) + " (float redondea en long)");
        // De float redodea a int.
        System.out.println("Redondeo int de 3.21f......: " + Math.round(3.21f) + " (double redondea en int)");
        // De double redondea a Double.
        System.out.println("Redondeo double de 3.21....: " + Math.rint(3.21) + " (double redondea en double (con rint))");

        System.out.println();
        // Son equivalentes.
        System.out.println("E elevado a X (de 1)............: " + Math.exp(1));
        System.out.println("Número E (Euler)................: " + Math.E);

        System.out.println();
        System.out.println("------- Logaritmos -------");
        System.out.println("Logaritmo Natural de Math.E.....: " + Math.log(Math.E));
        System.out.println("Logaritmo base 10 de 1000.......: " + Math.log10(1000));

        System.out.println();
        System.out.println("--------- Potencia y Raíz Cuadarada -----------");
        // Devuelve un double.
        System.out.println("(X elevado a Y) con valores 3 y 4.......: " + Math.pow(3, 4));
        // Devuelve un double.
        System.out.println("Raíz cuadrada de 9......................: " + Math.sqrt(9));

        System.out.println();
        System.out.println("------------ Conversión de Radianes en Grados y Viceversa -------------");
        System.out.println("(rad a deg) de Math.PI / 6......: " + Math.toDegrees(Math.PI / 6));
        // Son equivalentes.         
        System.out.println("(deg a rad) de 30...............: " + Math.toRadians(30));
        System.out.println("30º en Radianes.......: " + Math.PI / 6);

        // Ejemplos de transformaciones.
        System.out.println();
        System.out.println("Radianes en 33 grados......: " + Math.PI * 33 / 180);
        System.out.println("Grados en 2 radianes.......: " + 2 * 180 / Math.PI);
    }

}
