/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class TiposPrimitivos {

    public static boolean validarParidad(double num) {

        // Variable retorno.
        boolean valor;

        // Determina el valor boolean.
        if (num % 2 == 0) {
            valor = true;
        } else {
            valor = false;
        }
        // Devuelve el valor.
        return valor;
    }

    public static boolean validarSigno(double num) {

        // Variable retorno.
        boolean valor;

        // Determina el valor boolean.
        if (num <= 0) {
            valor = true;
        } else {
            valor = false;
        }
        // Devuelve el valor.
        return valor;
    }

    public static double obtenerMayor(double n1, double n2) {

        // Variable retorno.
        double mayor;

        // Determina el número mayor.
        if (n1 > n2) {
            mayor = n1;
        } else {
            mayor = n2;
        }

        //Devuelve el valor.
        return mayor;
    }

    public static double obtenerMenor(double n1, double n2) {

        // Variable retorno.
        double menor;

        // Determina el número menor.
        if (n1 > n2) {
            menor = n1;
        } else {
            menor = n2;
        }

        //Devuelve el valor.
        return menor;
    }

    public static int obtenerRelacion(double n1, double n2) {

        // Variable retorno.
        int relacion;

        // Determina la relación entre los números.
        if (n1 > n2) {
            relacion = 1;
        } else if (n1 < n2) {
            relacion = -1;
        } else {
            relacion = 0;
        }

        //Devuelve el valor.
        return relacion;
    }
}
