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

// Importación Locale.
import java.util.Locale;
// Importación Scanner.
import java.util.Scanner;
// Importación Libreria.
import org.japo.java.lib.UtilesCirculares;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        // Instanciación Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        // Instanciación Locale.
        Locale lcl = new Locale("EN", "uk");
        // Uso Locale.
        scn.useLocale(lcl);

        // Entrada usuario.
        try {
            System.out.println("Radio.....: ");
            double radio = scn.nextDouble();

            // Estadísticas.
            System.out.println("Perímetro círculo....: ");
            UtilesCirculares.calcularPerimetroCirculo(radio);

            System.out.println("Área círculo....: ");
            UtilesCirculares.calcularAreaCirculo(radio);

            System.out.println("Área esfera....: ");
            UtilesCirculares.calcularAreaEsfera(radio);

            System.out.println("Volumen esfera....: ");
            UtilesCirculares.calcularVolumenEsfera(radio);

        } catch (Exception e) {
            System.out.println("Error entrada datos.");
        }

    }
}
