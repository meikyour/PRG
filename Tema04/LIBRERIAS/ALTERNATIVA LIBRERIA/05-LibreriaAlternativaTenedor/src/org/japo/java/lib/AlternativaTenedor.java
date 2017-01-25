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
public class AlternativaTenedor {

    // Referencias
    public static final String COMIDA1 = "carne";
    public static final String COMIDA2 = "pescado";
    public static final int PUAS0 = 0;
    public static final int PUAS1 = 3;
    public static final int PUAS2 = 4;

    // Instancia un objeto Scanner
    public static final Scanner SCN = new Scanner(System.in);

    public static String introduceComida() {

        // Introduce el tippo de comida
        System.out.print("Tipo de comida .....: ");
        String tipoComida = SCN.nextLine();

        return tipoComida;
    }

    public static int analizaComida() {

        //Variable.
        String tipoComida = introduceComida();

        // Analiza el tipo de comida
        int puas;
        switch (tipoComida) {
            case COMIDA1:
                puas = PUAS1;
                break;
            case COMIDA2:
                puas = PUAS2;
                break;
            default:
                puas = PUAS0;
        }
        return puas;

    }

    public static void mensaje() {

        //Variable.
        int puas = analizaComida();

        // Muestra el resultado
        System.out.printf("El tenedor tiene ...: %d púas\n", puas);
    }

}
