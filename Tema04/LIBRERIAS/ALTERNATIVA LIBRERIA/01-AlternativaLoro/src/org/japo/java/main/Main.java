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
package org.japo.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Referencias
        final String NOMBRE_AMO = "Sócrates Martinez";
        final String MSG_SI = "¡Ave César!";
        final String MSG_NO = "¡Sócrates socorro!";

        // Instancia un objeto Scanner
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        // Variables
        String nombrePersona;
        String mensajeLoro;

        // Introduce la persona que se acerca
        System.out.printf("Persona que se acerca: ");
        nombrePersona = sc.nextLine();

        // Analiza la persona que se acerca
        if (nombrePersona.equals(NOMBRE_AMO)) {
            mensajeLoro = MSG_SI;
        } else {
            mensajeLoro = MSG_NO;
        }

        // Mensajes de salida
        System.out.printf("Dueño del loro ......: %s\n", NOMBRE_AMO);
        System.out.printf("Persona que se acerca: %s\n", nombrePersona);
        System.out.printf("Mensaje Loro ........: %s\n", mensajeLoro);
    }
}
