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
public class UtilesAcumularArray {

    public static final Random RND = new Random(System.currentTimeMillis());

    // Llenar el Array con valores.
    public static void llenarArrayAleatorio(double lista[], double min, double max) {

        for (int i = 0; i < lista.length; i++) {
            lista[i] = RND.nextDouble() * (max - min) + min;
        }
    }

    // Acumula los valores con un for.
    public static double sumarArrayReal(double[] lista) {

        double acumulador = 0;

        for (int i = 0; i < lista.length; i++) {
            acumulador = acumulador + lista[i];
        }
        return acumulador;
    }

    /*
    // Acumula los valores con un foreach.
    public static double sumarArrayReal(double[] lista) {

        double acumulador = 0;

        for (double item : lista) {
            acumulador += item;
        }
        return acumulador;
    }
     */
}
