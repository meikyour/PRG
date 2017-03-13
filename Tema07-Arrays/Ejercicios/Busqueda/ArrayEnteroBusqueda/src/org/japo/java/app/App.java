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

import java.util.Random;
import org.japo.java.lib.UtilesArray;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public static final Random RND = new Random(System.currentTimeMillis());

    public static final int LONG_MAX = 5;
    public static final int MIN = 0;
    public static final int MAX = 10;

    public void lanzarAplicacion() {

        int[] numero = new int[LONG_MAX];
        int number = RND.nextInt(MAX - MIN + 1) + MIN;

        UtilesArray.llenarArrayAleatorioEntero(numero, MIN, MAX);

        for (int i = 0; i < numero.length; i++) {
            System.out.printf("Número %d.........: %d\n", i + 1, numero[i]);
        }

        if (UtilesArray.buscarEnteroArray(numero, number) != -1) {
            System.out.printf("Aforo......: %d - Sí encontrado - Posición %d\n", number, UtilesArray.buscarEnteroArray(numero, number) + 1);
        } else {
            System.out.println("Número no encontrado.");
        }
    }

}
