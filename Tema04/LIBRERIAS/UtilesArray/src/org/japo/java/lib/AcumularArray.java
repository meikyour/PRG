/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class AcumularArray {

    // Acumula los valores Reales con un for.
    public static double sumarArrayReal(double[] lista) {

        double acumulador = 0;

        for (int i = 0; i < lista.length; i++) {
            acumulador = acumulador + lista[i];
        }
        return acumulador;
    }

    // Acumula los valores Reales con un foreach.
    public static double sumarArrayRealForEach(double[] lista) {

        double acumulador = 0;

        for (double item : lista) {
            acumulador += item;
        }
        return acumulador;
    }

    public static Object[] sumarArrayReal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Acumula los valores Enteros con un for.
    public static int sumarArrayEntero(int[] lista) {

        int acumulador = 0;

        for (int i = 0; i < lista.length; i++) {
            acumulador = acumulador + lista[i];
        }
        return acumulador;
    }
}
