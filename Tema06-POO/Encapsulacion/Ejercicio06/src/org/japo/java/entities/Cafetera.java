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
public class Cafetera {

    public final static int CAFE = 0;
    public final static int TE = 1;
    public final static int BATIDO = 2;
    public final static int CON_AZUCAR = 4;
    public final static int SIN_AZUCAR = 8;

    private int servicio = 8;

    public void setServicio(int servicio) {

        if (servicio == CAFE) {
            this.servicio = CAFE;
            if (servicio == CAFE + CON_AZUCAR) {
                this.servicio = CAFE + CON_AZUCAR;
            } else {
                this.servicio = CAFE + SIN_AZUCAR;
            }

        } else if (servicio == TE) {
            this.servicio = TE;
            if (servicio == TE + CON_AZUCAR) {
                this.servicio = TE + CON_AZUCAR;
            } else {
                this.servicio = TE + SIN_AZUCAR;
            }
        } else {
            this.servicio = BATIDO;
            if (servicio == BATIDO + CON_AZUCAR) {
                this.servicio = BATIDO + CON_AZUCAR;
            } else {
                this.servicio = BATIDO + SIN_AZUCAR;
            }
        }
    }

    public int getServicio() {

        return servicio;
    }
}
