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
public class Color {

    // Niveles de color mínimo y máximo.
    public static final int NIV_MIN = 0; // (Por defecto)
    public static final int NIV_MAX = 255;

    // Atributos para cada color.
    private int r;
    private int v;
    private int a;

    public Color() {
        this.r = NIV_MIN;
        this.v = v;
        this.a = NIV_MIN;
    }

    public Color(int r, int v, int a) {
        if (r >= NIV_MIN && r <= NIV_MAX) {
            this.r = r;
        } else {
            this.r = NIV_MIN;
        }
        if (v >= NIV_MIN && v <= NIV_MAX) {
            this.v = v;
        } else {
            this.v = NIV_MIN;
        }
        if (a >= NIV_MIN && a <= NIV_MAX) {
            this.a = a;
        } else {
            this.a = NIV_MIN;
        }
    }

    public void setR(int r) {

        if (r >= NIV_MIN && r <= NIV_MAX) {
            this.r = r;
        }
    }

    public int getR() {

        return r;
    }

    public void setV(int v) {

        if (v >= NIV_MIN && v <= NIV_MAX) {
            this.v = v;
        }
    }

    public int getV() {

        return v;
    }

    public void setA(int a) {

        if (a >= NIV_MIN && a <= NIV_MAX) {
            this.a = a;
        }
    }

    public int getA() {

        return a;
    }
}
