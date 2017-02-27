/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import java.io.Serializable;
import org.japo.java.interfaces.ICosa;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Cosa implements ICosa, Serializable {

    protected boolean fragilidadOK;

    public Cosa() {
    }

    public Cosa(boolean fragilidadOK) {
        this.fragilidadOK = fragilidadOK;
    }

    public boolean isFragilidadOK() {
        return fragilidadOK;
    }

    public void setFragilidadOK(boolean fragilidadOK) {
        this.fragilidadOK = fragilidadOK;
    }

    @Override
    public void mostrarInfo() {

        System.out.printf("Nombre de la clase.....: %s\n", this.getClass().getSimpleName());
        System.out.println(isFragilidadOK());
    }

}
