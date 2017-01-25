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

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        System.out.println("--------------------WRAPPERS--------------------------");
        System.out.println();

        System.out.println("-------------Cantidad de bits y bytes----------------");
        System.out.println();
        System.out.println("Bytes - byte...." + Byte.BYTES);
        System.out.println("Bits - byte....." + Byte.SIZE);
        System.out.println();
        System.out.println("Bytes - short..." + Short.BYTES);
        System.out.println("Bits - short...." + Short.SIZE);
        System.out.println();
        System.out.println("Bytes - int....." + Integer.BYTES);
        System.out.println("Bits - int......" + Integer.SIZE);
        System.out.println();
        System.out.println("Bytes - long...." + Long.BYTES);
        System.out.println("Bits - long....." + Long.SIZE);
        System.out.println();

        System.out.println("---------------Máximo valor positivo-----------------");
        System.out.println();
        System.out.println("Máximo valor positivo - byte......" + Byte.MAX_VALUE);
        System.out.println("Máximo valor positivo - short....." + Short.MAX_VALUE);
        System.out.println("Máximo valor positivo - int....." + Integer.MAX_VALUE);
        System.out.println("Máximo valor positivo - long....." + Long.MAX_VALUE);

        System.out.println();
        System.out.println("---------------Mínimo valor negativo-----------------");
        System.out.println();
        System.out.println("Mínimo valor negativo - byte......" + Byte.MIN_VALUE);
        System.out.println("Mínimo valor negativo - short....." + Short.MIN_VALUE);
        System.out.println("Mínimo valor negativo - int....." + Integer.MIN_VALUE);
        System.out.println("Mínimo valor negativo - long....." + Long.MIN_VALUE);
        System.out.println();
    }

}
