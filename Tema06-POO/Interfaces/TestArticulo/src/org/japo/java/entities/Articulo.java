/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import java.io.Serializable;
import org.japo.java.interfaces.IArticulo;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Articulo implements IArticulo, Serializable {

    private double precio;

    // ---------------------- Constructores -------------------------------
    public Articulo(double precio, IArticulo art) {
        this.precio = precio;
    }

    public Articulo() {
    }

    public Articulo(double precio) {
        if (validarPrecio(precio)) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    // --------------- Setters y Getters -------------------------------
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    // -------------------------- Métodos Override --------------------------------
    @Override
    public void mostrarPrecio() {
        System.out.println(precio);
    }

    // ------------------------ Otros Métodos --------------------------------------
    private boolean validarPrecio(double precio) {
        boolean testOK;
        precio = precio * 100;
        int precioInt = (int) precio;

        return precio - precioInt == 0 && precio >= 0.0;
    }

}
