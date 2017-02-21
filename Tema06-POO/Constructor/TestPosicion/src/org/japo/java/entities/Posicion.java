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
    private int x;
    private int y;

    public Posicion() {
        this.x = X_INI;
        this.y = Y_INI;
    }

    public Posicion(int x, int y) {
        if (validarX(x)) {
            this.x = x;
        } else {
            this.x = W_SCR / 2;
        }
        if (validarY(y)) {
            this.y = y;
        } else {
            this.x = W_SCR / 2;
        }
    }

    public void setX(int x) {

        if (validarX(x)) {
            this.x = x;
        }
    }

    public void setY(int y) {

        if (validarY(y)) {
            this.y = y;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static boolean validarX(int x) {

        return x < W_SCR && x >= 0;
    }

    public static boolean validarY(int y) {

        return y < H_SCR && y >= 0;
    }
    
}
