/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import java.io.Serializable;
import org.japo.java.interfaces.IVehiculo;
import org.japo.java.lib.UtilesVehiculo;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public abstract class Vehiculo implements Serializable, IVehiculo{

    private int contador;

    private Vehiculo() {
    }

    public Vehiculo(int contador, int margen) {

        if (UtilesVehiculo.validarContador(contador)) {
            this.contador = contador;
        } else {
            this.contador = UtilesVehiculo.obtenerInicial(margen);
        }
    }

    public void setContador(int contador) {
        if (UtilesVehiculo.validarContador(contador)) {
            this.contador = contador;
        }
    }

    public int getContador() {
        return contador;
    }
    
}
