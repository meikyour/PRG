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

//Importación clase Locale.
import java.util.Locale;
//Importación clase Scanner.
import java.util.Scanner;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        //Instanciación objeto Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        //Instanciamos el objeto Locale.                        
        Locale lcl = new Locale("EN");
        scn.useLocale(lcl);

        //Constantes.
        final int NUM_PERSONAS = 5;
        final char PISO_MIN = '0';
        final char PISO_MAX = '9';

        //Variables.  
        char piso = '0';

        // Recorrer PERSONAS
        for (int persona = 1; persona < NUM_PERSONAS; persona++) {
            // Validar PISO
            boolean ascensorOK = true;
            do {
                // Entrar PISO
                boolean testOK = true;
                do {
                    try {
                        System.out.printf("Persona %d ---> ", persona);
                        piso = scn.nextLine().charAt(0);
                        testOK = false;
                    } catch (Exception e) {
                        System.out.println("Error entrada.");
                    }
                } while (testOK);
                ascensorOK = !(piso >= PISO_MIN && piso <= PISO_MAX);
                if (ascensorOK) {
                    System.out.println("Plantas 0...9");
                }
            } while (ascensorOK);

            //Mensaje.
            System.out.printf("Persona %d ---> %c\n", persona, piso);
        }
    }
    
}
