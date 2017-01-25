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
package org.japo.java.app;

import java.util.Random;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class App {

    // Rangos
    public static final int H_MIN = 71;
    public static final int H_MAX = 86;
    public static final int T_MIN = 19;
    public static final int T_MAX = 22;
    public static final int I_MIN = 2;
    public static final int I_MAX = 13;

    // Limites
    public static final int MIN = 0;
    public static final int MAX = 100;

    /**
     * El método lanzarAplicacion es el punto de netrada de la clase App.
     */
    public void lanzarAplicacion() {
        // Objeto Random
        Random rnd = new Random();

        // Valores simulados
        int valorHum = rnd.nextInt(MAX - MIN + 1) + MIN;
        int valorTem = rnd.nextInt(MAX - MIN + 1) + MIN;
        int valorIlu = rnd.nextInt(MAX - MIN + 1) + MIN;

        // Semaforos
        boolean humOK = analizarEntero(valorHum, H_MIN, H_MAX);
        boolean temOK = analizarEntero(valorTem, T_MIN, T_MAX);
        boolean iluOK = analizarEntero(valorIlu, I_MIN, I_MAX);

        // Mensajes
        String msgHum = humOK ? "OK" : "ALARMA";
        String msgTem = temOK ? "OK" : "ALARMA";
        String msgIlu = iluOK ? "OK" : "ALARMA";

        // Pantalla
        System.out.printf("Humedad .......: %3d %%    - %s\n", valorHum, msgHum);
        System.out.printf("Temperatura ...: %3d ºC   - %s\n", valorTem, msgTem);
        System.out.printf("Iluminación ...: %3d kLux - %s\n", valorIlu, msgIlu);
    }

    private boolean analizarEntero(int num, int min, int max) {
        return num >= min && num <= max;
    }

}
