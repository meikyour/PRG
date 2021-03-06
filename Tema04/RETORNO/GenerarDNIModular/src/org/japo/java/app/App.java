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
    
    //Constantes.
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final int DNI = 29211661;

    public void lanzarAplicacion() {
        
        //Variable.
        char letra = calcularLetraDNI();
        System.out.printf("DNI.......: %d-%c\n", DNI, letra);
    }
    private char calcularLetraDNI(){
        int posicion = DNI % 23;
        return LETRAS.charAt(posicion);
    }
    
}
