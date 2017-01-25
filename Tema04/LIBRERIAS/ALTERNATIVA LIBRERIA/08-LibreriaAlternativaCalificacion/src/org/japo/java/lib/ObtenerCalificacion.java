/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

//Importación de la clase Scanner.
import java.util.Scanner;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class ObtenerCalificacion {

    //Constantes.
    public static final String CAL_NE = "No evaluado";
    public static final String CAL_NP = "No presentado";
    public static final String CAL_MD = "Muy deficiente";
    public static final String CAL_IN = "Insuficiente";
    public static final String CAL_SF = "Suficiente";
    public static final String CAL_BN = "Bien";
    public static final String CAL_NT = "Notable";
    public static final String CAL_SB = "Sobresaliente";
    public static final String CAL_XX = "Calificación errónea";

    //Instanciación del objeto Scanner.
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    // Introduce la calificación numérica.
    public static int entrarNota() {

        int calNumerica = 0;
        try {
            System.out.print("Calificación numérica ....: ");
            calNumerica = SCN.nextInt();
        } catch (Exception e) {
            System.out.println("Error en la entrada");
        }

        return calNumerica;
    }

    // Gestiona la nota.
    public static String gestionNota(int nota) {

        String calDescriptiva;
        switch (nota) {
            case 0:
                calDescriptiva = CAL_NE;
                break;
            case 1:
                calDescriptiva = CAL_NP;
                break;
            case 2:
            case 3:
                calDescriptiva = CAL_MD;
                break;
            case 4:
                calDescriptiva = CAL_IN;
                break;
            case 5:
                calDescriptiva = CAL_SF;
                break;
            case 6:
                calDescriptiva = CAL_BN;
                break;
            case 7:
            case 8:
                calDescriptiva = CAL_NT;
                break;
            case 9:
                calDescriptiva = CAL_SB;
                break;
            default:
                calDescriptiva = CAL_XX;
        }
        return calDescriptiva;
    }

    // Muestra la calificación.
    public static void mensajeCalificacion() {

        int nota = entrarNota();
        String calDescriptiva = gestionNota(nota);
        System.out.printf("Calificación descriptiva .: %s\n", calDescriptiva);
    }
}
