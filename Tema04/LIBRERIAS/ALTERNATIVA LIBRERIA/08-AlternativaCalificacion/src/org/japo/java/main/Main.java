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
        final String CAL_NE = "No evaluado";
        final String CAL_NP = "No presentado";
        final String CAL_MD = "Muy deficiente";
        final String CAL_IN = "Insuficiente";
        final String CAL_SF = "Suficiente";
        final String CAL_BN = "Bien";
        final String CAL_NT = "Notable";
        final String CAL_SB = "Sobresaliente";
        final String CAL_XX = "Calificación errónea";
        
        try {
            // Instancia un objeto Scanner
            Scanner sc = new Scanner(System.in);

            // Introduce la calificación numérica
            System.out.print("Calificación numérica ....: ");
            int calNumerica = sc.nextInt();

            // Gestiona la nota
            String calDescriptiva;
            switch (calNumerica) {
                case 0:
                    calDescriptiva = CAL_NE;
                    break;
                case 1:
                    calDescriptiva = CAL_NP;
                    break;
                case 2:
                case 3:
                    calDescriptiva = CAL_MD;
                    break;
                case 4:
                    calDescriptiva = CAL_IN;
                    break;
                case 5:
                    calDescriptiva = CAL_SF;
                    break;
                case 6:
                    calDescriptiva = CAL_BN;
                    break;
                case 7:
                case 8:
                    calDescriptiva = CAL_NT;
                    break;
                case 9:
                    calDescriptiva = CAL_SB;
                    break;
                default:
                    calDescriptiva = CAL_XX;
            }

            // Muestra la calificación
            System.out.printf("Calificación descriptiva .: %s\n", calDescriptiva);
        } catch (Exception e) {
            System.out.println("Error en la entrada");
        }

    }
}
