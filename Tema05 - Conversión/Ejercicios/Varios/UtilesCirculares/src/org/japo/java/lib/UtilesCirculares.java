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
public class UtilesCirculares {

    public static double calcularPerimetroCirculo(double radio) {

        return 2 * Math.PI * radio;
    }

    public static double calcularAreaCirculo(double radio) {

        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaEsfera(double radio) {

        return 4 / 3 * Math.PI * Math.pow(radio, 2);
    }

    public static double calcularVolumenEsfera(double radio) {

        return 4.0 / 3 * Math.PI * Math.pow(radio, 3);
    }

}
