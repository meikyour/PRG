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

import java.util.Locale;
import java.util.Scanner;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    private final Scanner scn = new Scanner(System.in, "ISO-8859-1");
    private final Locale lcl = new Locale("EN", "uk");

    public final String MSG_USUARIO = "Introduce un número....:";
    public final String MSG_ERROR = "Dato incorrecto, introduce un número...:";

    int numero = obtenerNumero(MSG_USUARIO, MSG_ERROR);
    //int numeroPrimitiva = obtenerNumeroPrimitiva();

    int n1;
    int n2;
    int n3;
    int n4;
    int n5;

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        //Asignamos la clase Locale a a la clase Scanner.
        scn.useLocale(lcl);

        repetirNumeroPrimitiva(numero);

        /*String[] kk = {"Hola","KK","Pl'atano","micasa"};
        System.out.println(kk[0]);*/
    }

    private int obtenerNumero(String msgUser, String msgError) {

        boolean testOK = true;
        numero = 0;

        do {
            try {
                System.out.printf(msgUser);
                numero = scn.nextInt();
                testOK = false;
            } catch (Exception e) {
                System.out.println(msgError);
            } finally {
                scn.nextLine();
            }
        } while (testOK);

        //Devuelve valor int.
        return numero;
    }

    private boolean obtenerNumeroPrimitiva() {

        final int MIN = 1;
        final int MAX = 49;

        obtenerNumero(MSG_USUARIO, MSG_ERROR);
        /*
        if (numero >= MIN && numero <= MAX) {
            numero = numeroPrimitiva;
        }
*/
        return numero >= MIN && numero <= MAX;
    }

    private void repetirNumeroPrimitiva(int number) {

        for(int veces = 1; veces <= 5; veces++) {

            obtenerNumeroPrimitiva();

            switch (veces) {
                case 1:
                    n1 = number;
                    break;
                case 2:
                    n2 = number;
                    break;
                case 3:
                    n3 = number;
                    break;
                case 4:
                    n4 = number;
                    break;
                case 5:
                    n5 = number;
                    break;
            }
        }

        System.out.printf("Número papeleta....: %d-%d-%d-%d-%d\n", n1, n2, n3, n4, n5);
    }
}
