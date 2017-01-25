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
        // Datos de la situación
        final int SALIDA_BUS_HOR = 5;
        final int SALIDA_BUS_MIN = 0;
        final int DEMORA_BUS_MIN = 5;
        final int SALIDA_PIE_HOR = 4;
        final int SALIDA_PIE_MIN = 30;

        // Mensajes descriptivos
        System.out.printf("Salida prevista del bus ..: %02d:%02d\n",
                SALIDA_BUS_HOR, SALIDA_BUS_MIN);
        System.out.printf("Salida de casa ...........: %02d:%02d\n",
                SALIDA_PIE_HOR, SALIDA_PIE_MIN);
        System.out.printf("Minutos demora ...........: %d\n", 
                DEMORA_BUS_MIN);
        System.out.printf("Salida demorada del bus ..: %02d:%02d\n",
                SALIDA_BUS_HOR, SALIDA_BUS_MIN + DEMORA_BUS_MIN);
    }
}
