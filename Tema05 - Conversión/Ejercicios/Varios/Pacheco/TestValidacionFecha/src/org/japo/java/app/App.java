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
import org.japo.java.lib.UtilesTemporales;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        // Instanciación clase Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        // Instanciación clase Locale.
        Locale lcl = new Locale("EN", "uk");
        // Uso de la clase Locale.
        scn.useLocale(lcl);

        System.out.println("Fecha a validar......:");
        String fecha = scn.nextLine();

        if (UtilesTemporales.validarFecha(fecha)) {
            System.out.println("Validación.......: CORRECTO.");
        } else {
            System.out.println("Validación.......: INCORRECTO");
        }
    }

}
