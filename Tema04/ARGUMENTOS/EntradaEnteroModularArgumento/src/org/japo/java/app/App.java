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

import java.util.Scanner;
import java.util.Locale;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    //Constantes.
    public static final String MSG_USER = "Nombre";
    public static final String MSG_ERROR = "Error";

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */

    public void lanzarAplicacion() {

        int numeroUsuario = obtenerEntero(MSG_USER, MSG_ERROR);
        System.out.printf("Número introducido......: %d", numeroUsuario);
    }

    private int obtenerEntero(String msgUser, String msgError) {

        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        Locale lcl = new Locale("EN", "uk");
        scn.useLocale(lcl);

        boolean testOK = true;
        int numero = 0;

        do {
            try {
                System.out.printf("Número.........: ");
                numero = scn.nextInt();
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error e");
            } finally {
                scn.nextLine();
            }
        } while (testOK);
        return numero;
    }

}
