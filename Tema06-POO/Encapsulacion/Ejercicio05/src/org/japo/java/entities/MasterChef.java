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
public class MasterChef {
    
    public static final int MIEMBROS_MIN = 2;
    public static final int MIEMBROS_MAX = 4;

    private int miembros;
    private double presupuesto = 21;

    public void setMiembros(int miembros) {

        if (miembros >= MIEMBROS_MIN && miembros <= MIEMBROS_MAX) {
            this.miembros = miembros;
        }
    }

    public int getMiembros() {

        return miembros;
    }

    public void setPresupuesto(double presupuesto) {

        if (presupuesto <= 30) {

            this.presupuesto = presupuesto;
        }
    }

    public double presupuesto() {

        return presupuesto;
    }

}
