/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

// Se importa.
import java.io.Serializable;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Mandocleta implements Serializable {
    // Hijo.    // Hereda de.    //Padre.

    private double velocidad;

    public void setVelocidad(double velocidad) {

        // Accesores: Set > Para escribir.
        // Los set siempre son public + void.
        this.velocidad = velocidad;
    }

    public double getvelocidad() {

        // Los get son para obtener.
        // El get siempre el public + tipo de la variable.
        return velocidad;   // return this.velocidad (No hay conflicto).
    }

}
