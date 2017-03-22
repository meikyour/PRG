/*
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
import org.japo.java.lib.UtilesSemana;

/**
 *
 * @author Raul Granel - raul.granel@gmail.com
 */
public class App {

    // Inicio Aplicacion
    public void lanzarAplicacion() {

        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        try {
            System.out.printf("Numero de dia...:");
            int dia = scn.nextInt();
            System.out.printf("Idioma elegido...:");
            int idioma = scn.nextInt();
            System.out.printf("Nombre de dia...: %s\n", UtilesSemana.obtenerNombreDia(dia, idioma));
        } catch (Exception e) {
            System.out.printf("Nombre de dia....: ");
        } finally {
            scn.nextLine();
        }
    }

}
