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
public class Posicion {

    // Tamaño de pantalla.
    public static final int W_SCR = 800; // Ancho
    public static final int H_SCR = 600; // Alto

    // Posición por defecto.
    public static final int X_INI = W_SCR / 2;
    public static final int Y_INI = H_SCR / 2;

    // Coordenadas.
    private int x = X_INI;
    private int y = Y_INI;

    public void setX(int x) {

        if (x < W_SCR && x >= 0) {
            this.x = x;
        }
    }

    public void setY(int y) {

        if (x < W_SCR && x >= 0) {
            this.y = y;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
