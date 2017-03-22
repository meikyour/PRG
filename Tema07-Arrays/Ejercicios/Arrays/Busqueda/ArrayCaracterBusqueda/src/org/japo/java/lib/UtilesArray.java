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
public class UtilesArray {

    public static int buscarCaracterArray(char[] lista, char clave) {

        boolean finalBusquedaOK = false;
        int posicion = 0;

        do {
            if (lista[posicion] == clave) {
                finalBusquedaOK = true;
            } else if (posicion == lista.length - 1) {
                finalBusquedaOK = true;
                posicion = -1;
            } else {
                posicion++;
            }
        } while (!finalBusquedaOK);
                    
        return posicion;
    }
}
