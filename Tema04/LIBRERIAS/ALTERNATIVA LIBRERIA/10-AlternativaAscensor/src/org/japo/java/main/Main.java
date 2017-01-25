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
        // Nombres de plantas
        final String NOMBRE_PLANTA_0 = "Planta Baja";
        final String NOMBRE_PLANTA_1 = "Primera Planta";
        final String NOMBRE_PLANTA_2 = "Segunda Planta";
        final String NOMBRE_PLANTA_3 = "Tercera Planta";
        final String NOMBRE_PLANTA_A = "Ático";
        final String NOMBRE_PLANTA_X = "Selección incorrecta";
        
        // Números de plantas
        final int NUMERO_PLANTA_0 = 0;
        final int NUMERO_PLANTA_1 = 1;
        final int NUMERO_PLANTA_2 = 2;
        final int NUMERO_PLANTA_3 = 3;
        final int NUMERO_PLANTA_A = 9;
        
        // Instancia un objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        // Selección de planta
        System.out.print("Selección de planta ..: ");
        int numeroPlanta = sc.nextInt();

        // Análisis selección
        String nombrePlanta;
        switch (numeroPlanta) {
            case NUMERO_PLANTA_0:
                nombrePlanta = NOMBRE_PLANTA_0;
                break;
            case NUMERO_PLANTA_1:
                nombrePlanta = NOMBRE_PLANTA_1;
                break;
            case NUMERO_PLANTA_2:
                nombrePlanta = NOMBRE_PLANTA_2;
                break;
            case NUMERO_PLANTA_3:
                nombrePlanta = NOMBRE_PLANTA_3;
                break;
            case NUMERO_PLANTA_A:
                nombrePlanta = NOMBRE_PLANTA_A;
                break;
            default:
                nombrePlanta = NOMBRE_PLANTA_X;
        }
        
        // Mensaje selección
        System.out.printf("Planta seleccionada ..: %s\n", nombrePlanta);
    }
}
