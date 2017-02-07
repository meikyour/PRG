/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
package org.japo.java.lib;

import java.util.Random;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class UtilesPassword {

    // Categorias de caracteres
    public static final int CAT_MIN = 0;
    public static final int CAT_MAY = 1;
    public static final int CAT_NUM = 2;
    public static final int CAT_PUN = 3;
    public static final int NUM_CAT = 4;
    
    // Símbolos categoria
    public static final String CAR_MIN = "abcçdefghijklmnñopqrstuvwxyz";
    public static final String CAR_MAY = "ABCÇDEFGHYJKLMNÑOPQRSTUVWXYZ";
    public static final String CAR_NUM = "0123456789";
    public static final String CAR_PUN = "$%&/()=?¿[]{}-_:.*+";

    // Sistema aleatorio
    public static final Random RND = new Random();

    public static String generarPassword(int longitud) {
        // Semáforos
        boolean minOK = false;      // Cat 0
        boolean mayOK = false;      // Cat 1
        boolean numOK = false;      // Cat 2
        boolean punOK = false;      // Cat 3

        // Password a generar
        String password = "";
        
        // Bucle generador
        for (int posAct = 0; posAct < longitud; posAct++) {
            // Generar categoria
//            int catActual = generarCategoria(longitud, posAct, minOK, mayOK, numOK, punOK);
            int catActual = generarCategoria();

            // Caracter actual
            char carActual;
            
            // Analizar categoria actual 
            switch (catActual) {
                case CAT_MIN:
                    minOK = true;
                    carActual = generarCaracter(CAR_MIN);
                    password += carActual;
                    break;
                case CAT_MAY:
                    mayOK = true;
                    carActual = generarCaracter(CAR_MAY);
                    password += carActual;
                    break;
                case CAT_NUM:
                    numOK = true;
                    carActual = generarCaracter(CAR_NUM);
                    password += carActual;
                    break;
                case CAT_PUN:
                    punOK = true;
                    carActual = generarCaracter(CAR_PUN);
                    password += carActual;
            }
        }

        // Devolver password
        return password;
    }

    public static char generarCaracter(String lista) {
        // Posición aleatoria
        int posicion = RND.nextInt(lista.length());

        // Devuelve un caracter
        return lista.charAt(posicion);
    }

    private static int generarCategoria() {
        // Generar
        return RND.nextInt(NUM_CAT);
    }

}
