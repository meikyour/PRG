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
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        try {
            App.hacerAlgo();
        } catch (Exception e) {
            //System.out.println(e.toString());
        }
    }

    public static void hacerAlgo() throws Exception {

        try {
            System.out.println("Hola");
            System.out.println(2 / 0);        // DivideByZeroException.
            System.out.println("Adios");
        } catch (ArithmeticException e1) {
            System.out.println("Error aritmético. Lo he cogido!");
        } catch (Exception e) {
            System.out.println("Otro error.");
        }
    }

    public static String obtenerNombre(int mes) throws Exception {

        String nombre;

        switch (mes) {
            case 1:
                nombre = "Enero";
                break;
            case 2:
                nombre = "Febrero";
                break;
        }
        default 
        thows new Entrada IOException ("Fuera de rango");
    }
    }

}
