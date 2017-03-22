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

import java.util.Scanner;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        // Array con for.each.
        int[] aforos = new int[5];

        for (int i = 0; i < aforos.length; i++) {
            System.out.printf("Aforo %d....: ", i + 1);
            aforos[i] = scn.nextInt();
        }

        // Array con for.each (No muestra la posición).
        for (int aforo : aforos) {
            System.out.printf("Aforo....: %d\n", aforo);
        }

        // Array con for para mostrar el valor y la posición.
        for (int veces = 0; veces < aforos.length; veces++) {
            System.out.printf("Aforo %d....: %d\n", veces, aforos[veces]);
        }

    }

}
