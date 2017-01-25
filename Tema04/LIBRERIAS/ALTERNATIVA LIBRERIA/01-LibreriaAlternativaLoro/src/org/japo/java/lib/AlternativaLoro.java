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
public class AlternativaLoro {

    // Referencias
    public static final String NOMBRE_AMO = "Sócrates Martinez";
    public static final String MSG_SI = "¡Ave César!";
    public static final String MSG_NO = "¡Sócrates socorro!";

    // Instancia un objeto Scanner
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static String introduceNombre() {

        // Variables
        String nombrePersona;

        // Introduce la persona que se acerca
        System.out.printf("Persona que se acerca: ");
        nombrePersona = SCN.nextLine();

        return nombrePersona;
    }

    public static String analizaNombre() {

        // Variables
        String nombrePersona = introduceNombre();
        String mensajeLoro;

        // Analiza la persona que se acerca
        if (nombrePersona.equals(NOMBRE_AMO)) {
            mensajeLoro = MSG_SI;
        } else {
            mensajeLoro = MSG_NO;
        }
        return mensajeLoro;
    }

    public static void mensajesLoro() {
        
        String nombrePersona = "";
        String mensajeLoro = analizaNombre();

        // Mensajes de salida
        System.out.printf("Dueño del loro ......: %s\n", NOMBRE_AMO);
        System.out.printf("Persona que se acerca: %s\n", nombrePersona);
        System.out.printf("Mensaje Loro ........: %s\n", mensajeLoro);
    }
}
