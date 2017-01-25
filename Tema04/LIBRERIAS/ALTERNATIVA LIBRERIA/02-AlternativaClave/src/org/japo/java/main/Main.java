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
        // Definición de la referencia
        final String CLAVE_REAL = "123456";
//        final String CLAVE_ACTUAL = "S@rg0z";
        final String MSG_SI = "Acceso permitido";
        final String MSG_NO = "Acceso denegado";

        // Variables
        String claveActual;
        boolean testOK;
        String mensaje;
        
        // Instancia un objeto Scanner
//        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        Scanner sc = new Scanner(System.in, "utf-8");
        
        // Introducción de la clave
//        claveActual = CLAVE_ACTUAL;
        System.out.printf("Introduzca la clave: ");
        claveActual = sc.nextLine();
        
        // Comparación
        testOK = claveActual.equals(CLAVE_REAL);

        // Analisis
        if (testOK) {
            mensaje = MSG_SI;
        } else {
            mensaje = MSG_NO;
        }
        
        // Resultado
        System.out.printf("Clave real ........: %s\n", CLAVE_REAL);
        System.out.printf("Clave actual ......: %s\n", claveActual);
        System.out.printf("Resultado .........: %s\n", mensaje);
    }
}
