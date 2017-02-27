/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Hijo extends Padre {

    public Hijo() {
        super.setNombre("BorjaMari");
    }

    public Hijo(String nombre) {

        if (nombre.length() >= 3) {
            super.setNombre(nombre);
        } else {
            super.setNombre("BorjaMari");
        }
    }

    @Override
    public void setNombre(String nombre) {
        if (nombre.length() >= 3) {
            super.setNombre(nombre);
        }
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

}
