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
        // Animal 1
        final String ANIMAL1_NOMBRE = "Vaca";
        final int ANIMAL1_PATAS = 4;
        final int ANIMAL1_CANTIDAD = 3;
        
        // Animal 2
        final String ANIMAL2_NOMBRE = "Oveja";
        final int ANIMAL2_PATAS = 4;
        final int ANIMAL2_CANTIDAD = 14;
        
        // Animal 3
        final String ANIMAL3_NOMBRE = "Burro";
        final int ANIMAL3_PATAS = 4;
        final int ANIMAL3_CANTIDAD = 2;
        
        // Animal 4
        final String ANIMAL4_NOMBRE = "Gallina";
        final int ANIMAL4_PATAS = 2;
        final int ANIMAL4_CANTIDAD = 18;
        
        // Variables
        int numPatas1 = ANIMAL1_PATAS * ANIMAL1_CANTIDAD;
        int numPatas2 = ANIMAL2_PATAS * ANIMAL2_CANTIDAD;
        int numPatas3 = ANIMAL3_PATAS * ANIMAL3_CANTIDAD;
        int numPatas4 = ANIMAL4_PATAS * ANIMAL4_CANTIDAD;
        int totalPatas = numPatas1 + numPatas2 + numPatas3 + numPatas4;

        // Animal 1
        System.out.printf("Animal  ..: %s\n", ANIMAL1_NOMBRE);
        System.out.printf("Cantidad .: %d\n", ANIMAL1_CANTIDAD);
        System.out.printf("Patas ....: %d\n", numPatas1);
        
        // Separador
        System.out.println();
        
        // Animal 2
        System.out.printf("Animal ...: %s\n", ANIMAL2_NOMBRE);
        System.out.printf("Cantidad .: %d\n", ANIMAL2_CANTIDAD);
        System.out.printf("Patas ....: %d\n", numPatas2);
        
        // Separador
        System.out.println();
        
        // Animal 3
        System.out.printf("Animal ...: %s\n", ANIMAL3_NOMBRE);
        System.out.printf("Cantidad .: %d\n", ANIMAL3_CANTIDAD);
        System.out.printf("Patas ....: %d\n", numPatas3);
        
        // Separador
        System.out.println();
        
        // Animal 4
        System.out.printf("Animal ...: %s\n", ANIMAL4_NOMBRE);
        System.out.printf("Cantidad .: %d\n", ANIMAL4_CANTIDAD);
        System.out.printf("Patas ....: %d\n", numPatas4);
        
        // Separador
        System.out.println();
        
        // TOTAL
        System.out.printf("Patas ....: %d\n", totalPatas);
        System.out.printf("Pares ....: %d\n", totalPatas / 2);
    }
}
