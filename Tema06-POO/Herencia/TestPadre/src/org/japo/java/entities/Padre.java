/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import org.japo.java.interfaces.IPadre;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Padre implements IPadre {

    private String nombre;

    public Padre() {
        this.nombre = "Papuchi";
    }

    public Padre(String nombre) {

        if (nombre.length() >= 3) {
            this.nombre = nombre;
        } else {
            this.nombre = "Papuchi";
        }
    }

    public void setNombre(String nombre) {

        if (nombre.length() >= 3) {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void saludar() {

        System.out.printf("%s.....: %s\n", this.getClass().getSimpleName(), getNombre());
    }

}
