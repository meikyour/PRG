/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import org.japo.java.interfaces.ICosa;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Cosa implements ICosa {

    private boolean combustibleOK;

    // ------------ Constructores -------------
    public Cosa() {
    }

    public Cosa(boolean combustibleOK) {
        this.combustibleOK = combustibleOK;
    }

    // ------ Setters y Getters -------------
    public boolean isCombustibleOK() {
        return combustibleOK;
    }

    public void setCombustibleOK(boolean combustibleOK) {
        this.combustibleOK = combustibleOK;
    }

    // ------- Método Override -------------
    @Override
    public void mostrarInfo() {
        System.out.println(isCombustibleOK());
    }

}
