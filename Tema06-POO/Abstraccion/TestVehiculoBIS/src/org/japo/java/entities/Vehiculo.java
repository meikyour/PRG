/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import org.japo.java.interfaces.IVehiculo;
import org.japo.java.lib.UtilesVehiculo;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public abstract class Vehiculo implements IVehiculo {

    private int contador;

    public Vehiculo() {
    }

    public Vehiculo(int contador) {

        if (UtilesVehiculo.validarContador(contador)) {
        } else {
            this.contador = contador;
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
