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
public class AlternativaClave {

    // Definición de la referencia
    public static final String CLAVE_REAL = "123456";
    //public static final String CLAVE_ACTUAL = "S@rg0z";
    public static final String MSG_SI = "Acceso permitido";
    public static final String MSG_NO = "Acceso denegado";

    // Instancia un objeto Scanner
    //Scanner sc = new Scanner(System.in, "ISO-8859-1");
    public static final Scanner SCN = new Scanner(System.in, "utf-8");

    public static String introduceClave() {

        // Variables
        String claveActual;

        // Introducción de la clave
        //claveActual = CLAVE_ACTUAL;
        System.out.printf("Introduzca la clave: ");
        claveActual = SCN.nextLine();

        return claveActual;
    }

    public static String comparaClave(String cReal) {

        // Variables
        String claveActual = introduceClave();
        boolean testOK;
        String mensaje;

        // Comparación
        testOK = claveActual.equals(CLAVE_REAL);

        // Analisis
        if (testOK) {
            mensaje = MSG_SI;
        } else {
            mensaje = MSG_NO;
        }
        return mensaje;
    }

    public static void mensajes() {

        //Variables.
        String claveActual = "";
        String mensaje = comparaClave(CLAVE_REAL);

        // Resultado
        System.out.printf("Clave real ........: %s\n", CLAVE_REAL);
        System.out.printf("Clave actual ......: %s\n", claveActual);
        System.out.printf("Resultado .........: %s\n", mensaje);
    }

}
