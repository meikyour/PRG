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
public class Perro implements Serializable {

    private boolean cuarentenaOK;

    public void setCuarentenaOK(boolean cuarentenaOK) {

        this.cuarentenaOK = cuarentenaOK;
    }

    public boolean isCuarentenaOK() {

        return cuarentenaOK;
    }
}
