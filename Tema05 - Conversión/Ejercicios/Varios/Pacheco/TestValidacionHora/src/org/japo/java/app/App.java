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

import java.util.Locale;
import java.util.Scanner;
import org.japo.java.lib.UtilesTemporales;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class App {
    /**
     * El método lanzarAplicacion es el punto de netrada de la clase App.
     */
    public void lanzarAplicacion() {
        // Objeto Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        
        // Locale
        Locale.setDefault(Locale.ENGLISH);
        
        // Petición de hora
        System.out.print("Hora ......: ");
        String hora = scn.nextLine();
        
        // Validación Hora
        if (UtilesTemporales.validarHora(hora)) {
            System.out.println("Correcto!!!");
        } else {
            System.out.println("Incorrecto!!!");
        }
    }
}
