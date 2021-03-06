/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

import java.util.Random;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class UtilesArray {

    public static final Random RND = new Random(System.currentTimeMillis());

    // Llenar el Array con valores Enteros.
    public static void llenarArrayAleatorioEntero(int lista[], int min, int max) {

        for (int i = 0; i < lista.length; i++) {
            lista[i] = RND.nextInt(max - min + 1) + min;
        }
    }

    public static int buscarEnteroArray(int[] lista, int numero) {

        int posicion = -1;

        for (int i = 0; i < lista.length; i++) {
            if (numero == lista[i]) {
                posicion = i;
            }
        }
        return posicion;
    }
}
