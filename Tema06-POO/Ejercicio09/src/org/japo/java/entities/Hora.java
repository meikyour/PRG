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
public class Hora {

    // Horas, minutos y segundos mínimos.
    public static final int HORA_MIN = 0;
    public static final int MINUTO_MIN = 0;
    public static final int SEGUNDO_MIN = 0;

    // Hotas, minutos y segundos máximos.
    public static final int HORA_MAX = 23;
    public static final int MINUTO_MAX = 23;
    public static final int SEGUNDO_MAX = 23;

    // Variables hora, minutos y segundos.
    private int h;
    private int m;
    private int s;

    public void setH(int h) {

        try {
            if (h >= HORA_MIN && h <= HORA_MAX) {
                this.h = h;
            }
        } catch (Exception e) {
        }
    }

    public int getH() {

        return h;
    }

    public void setM(int m) {

        try {
            if (h >= MINUTO_MIN && h <= MINUTO_MAX) {
                this.m = m;
            }
        } catch (Exception e) {
        }
    }

    public int getM() {

        return m;
    }

    public void setS(int s) {

        try {
            if (h >= SEGUNDO_MIN && h <= SEGUNDO_MAX) {
                this.s = s;
            }
        } catch (Exception e) {
        }
    }

    public int getS() {

        return s;
    }

}
