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
public class Contacto implements Serializable {

    private String alias = "Aupatú";
    private int edad;

    public void setAlias(String alias) {

        this.alias = alias;
    }

    public String getAlias() {

        return alias;
    }

    public void setEdad(int edad) {

        if (edad >= 18) {
            this.edad = edad;
        }
    }

    public int getEdad() {

        return edad;
    }
}
