/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import java.io.Serializable;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Maceta implements Serializable {

    private String nombre = "Anita";

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;
    }
}
