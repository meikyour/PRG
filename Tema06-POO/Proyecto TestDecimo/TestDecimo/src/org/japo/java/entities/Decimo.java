/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import java.io.Serializable;
import java.util.Random;
import org.japo.java.interfaces.IDecimo;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Decimo implements Serializable, IDecimo {

    Random rnd = new Random(System.currentTimeMillis());

    // Constantes.
    public static int NUMERO_MIN = 00000;
    public static int NUMERO_MAX = 99999;
    public static int SERIE_MIN = 1;
    public static int SERIE_MAX = 160;
    public static int FRACCION_MIN = 0;
    public static int FRACCION_MAX = 10;

    // Atributos.
    private int numero;
    private int serie;
    private int fraccion;

    // ---------------------------- Constructores ------------------------------
    public Decimo() {
        generarDecimoAleatorio();
    }

    public Decimo(int numero, int serie, int fraccion) {

        if (validarDecimo(numero, serie, fraccion)) {
            this.numero = numero;
            this.serie = serie;
            this.fraccion = fraccion;
        } else {
            generarDecimoAleatorio();
        }
    }

    // ------------------------ Setters ----------------------
    public void setNumero(int numero) {
        if (numero >= NUMERO_MIN && numero <= NUMERO_MAX) {
            this.numero = numero;
        }
    }

    public void setSerie(int serie) {
        if (serie >= SERIE_MIN && serie <= SERIE_MAX) {
            this.serie = serie;
        }
    }

    public void setFraccion(int fraccion) {
        if (fraccion >= FRACCION_MIN && fraccion <= FRACCION_MAX) {
            this.fraccion = fraccion;
        }
    }

    // ----------------------- Getters ------------------------
    public int getNumero() {
        return numero;
    }

    public int getSerie() {
        return serie;
    }

    public int getFraccion() {
        return fraccion;
    }

    // ------------------ Métodos Override -------------------
    public String toString() {

        return String.format("%05d - %3d - %2d", numero, serie, fraccion);
    }

    @Override
    public boolean equals(Object obj) {

        boolean testOK = obj == null ? false : obj instanceof Decimo;
        if (testOK) {
            Decimo d = (Decimo) obj;
            testOK = this.numero == d.numero && this.serie == d.serie && this.fraccion == d.fraccion;
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.numero;
        hash = 47 * hash + this.serie;
        hash = 47 * hash + this.fraccion;
        return hash;
    }

    @Override
    public void mostrarDecimo() {
        System.out.println(toString());
    }

    // ------------------ Métodos -----------------
    private void generarDecimoAleatorio() {

        numero = rnd.nextInt(NUMERO_MAX - NUMERO_MIN) + NUMERO_MIN;
        serie = rnd.nextInt(SERIE_MAX - SERIE_MIN) + SERIE_MIN;
        fraccion = rnd.nextInt(FRACCION_MAX - FRACCION_MIN) + FRACCION_MIN;
    }

    public static boolean validarDecimo(int numero, int serie, int fraccion) {

        return numero >= NUMERO_MIN && numero <= NUMERO_MAX && serie >= SERIE_MIN && serie <= SERIE_MAX && fraccion >= FRACCION_MIN && fraccion <= FRACCION_MAX;
    }

}
