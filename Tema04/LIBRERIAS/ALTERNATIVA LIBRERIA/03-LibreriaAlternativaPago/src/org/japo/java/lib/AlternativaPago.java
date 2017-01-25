/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

import java.util.Scanner;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class AlternativaPago {

    // Referencias
    public static final int MAX_ARTICULOS = 10;
    public static final String MSG_SI = "Caja RÁPIDA";
    public static final String MSG_NO = "Caja NORMAL";

    // Instancia un objeto Scanner
    public static final Scanner SCN = new Scanner(System.in);

    public static int introduceNumero() {

        // Introduce el número de artículos
        System.out.print("Número de artículos .: ");
        int numArticulos = SCN.nextInt();

        return numArticulos;
    }

    public static String analizaNumero() {

        // Variables
        boolean testOK;
        int numArticulos = introduceNumero();
        String mensaje;

        // Comparación
        testOK = numArticulos <= MAX_ARTICULOS;

        // Análisis
        if (testOK) {
            mensaje = MSG_SI;
        } else {
            mensaje = MSG_NO;
        }

        return mensaje;
    }

    public static void mensajes() {

        //Variable.
        String mensaje = analizaNumero();

        // Resultados
        System.out.printf("Límite artículos ....: %d\n", MAX_ARTICULOS);
        System.out.printf("Atención por ........: %s\n", mensaje);
    }
}
