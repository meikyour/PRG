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

public class Main {

    public static void main(String[] args) {
        // Datos del supuesto
        final int NUM_CANICAS_INI = 5;
        final int NUM_CANICAS_FIN = 1;
        final String NOMBRE = "Ruperta";
        
        // Mensajes del supuesto
        System.out.printf("Número de canicas inicial ..: %d\n", NUM_CANICAS_INI);
        System.out.printf("Número de canicas final ....: %d\n", NUM_CANICAS_FIN);
        System.out.printf("Nombre de la canica ........: %s\n", NOMBRE);
    }
}
