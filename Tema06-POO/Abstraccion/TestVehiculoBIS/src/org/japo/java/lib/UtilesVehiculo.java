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
    
    Random rnd = new Random(System.currentTimeMillis());

    public static boolean validarContador(int contador) {
        
        return contador >= 0;
    }
    
    public int obtenerInicial(int margenKm){
        
        return rnd.nextInt(margenKm);
    }
    
    public boolean comprobarProximidad(int contador, int kmMargenRevision, int kmRevision){
        
        return kmRevision - contador <= kmRevision; 
    }
}
