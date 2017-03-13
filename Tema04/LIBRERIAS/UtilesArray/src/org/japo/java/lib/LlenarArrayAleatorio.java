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
public class LlenarArrayAleatorio {

    public static final Random RND = new Random(System.currentTimeMillis());

    // Llenar el Array con valores Reales.
    public static void llenarArrayAleatorioReal(double lista[], double min, double max) {

        for (int i = 0; i < lista.length; i++) {
            lista[i] = RND.nextDouble() * (max - min) + min;
        }
    }

    // Llenar el Array con valores Enteros.
    public static void llenarArrayAleatorioEntero(int lista[], int min, int max) {

        for (int i = 0; i < lista.length; i++) {
            lista[i] = RND.nextInt(max - min + 1) + min;
        }
    }

}
