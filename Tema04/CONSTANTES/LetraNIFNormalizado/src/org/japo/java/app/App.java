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

//Importación de la clase Scanner.
import java.util.Scanner;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public void lanzarAplicacion() {

        //Instanciacón clase Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        int numeroDni = 0;
        
        boolean testOK = true;
        do {
            try {
                System.out.printf("Introduce un número de DNI........:");
                numeroDni = scn.nextInt();
                int posicion = (numeroDni % 23);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada.");
            } finally {
                scn.nextLine();
            }

        } while (testOK);

        int posicion = numeroDni % 23;
        char letraDni = LETRAS.charAt(posicion);

        System.out.printf("Código DNI.........:%d-%c\n", numeroDni, letraDni);
    }

}
