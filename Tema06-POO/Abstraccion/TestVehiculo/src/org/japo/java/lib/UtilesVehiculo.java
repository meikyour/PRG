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
public class UtilesVehiculo {

    public static boolean validarContador(int contador) {
        return contador >= 0;
    }

    public static int obtenerInicial(int kmInicial) {
        return new Random().nextInt(kmInicial);
    }

    public static int obtenerRestante(int contador, int kmRevision) {
        return kmRevision - contador % kmRevision;
    }

    public static boolean comprobarProximidad(int contador, int kmRevision, int kmProximidad) {
        return obtenerRestante(contador, kmRevision) <= kmProximidad;
    }
    
}
