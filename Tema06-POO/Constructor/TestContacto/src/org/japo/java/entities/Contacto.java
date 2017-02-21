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

    public static final int MAYORIA_EDAD = 18;
    private String alias;
    private int edad;

    public Contacto() {
        this.alias = "Aupatú";
    }

    public Contacto(String alias, int edad) {

        this.alias = "Aupatú";
        if (edad >= MAYORIA_EDAD) {
            this.edad = edad;
        }
    }

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
