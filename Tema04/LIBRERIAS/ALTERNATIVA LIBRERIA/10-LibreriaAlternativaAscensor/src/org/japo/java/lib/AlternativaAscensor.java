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
public class AlternativaAscensor {

    // Nombres de plantas.
    public static final String NOMBRE_PLANTA_0 = "Planta Baja";
    public static final String NOMBRE_PLANTA_1 = "Primera Planta";
    public static final String NOMBRE_PLANTA_2 = "Segunda Planta";
    public static final String NOMBRE_PLANTA_3 = "Tercera Planta";
    public static final String NOMBRE_PLANTA_A = "Ático";
    public static final String NOMBRE_PLANTA_X = "Selección incorrecta";

    // Números de plantas.
    public static final int NUMERO_PLANTA_0 = 0;
    public static final int NUMERO_PLANTA_1 = 1;
    public static final int NUMERO_PLANTA_2 = 2;
    public static final int NUMERO_PLANTA_3 = 3;
    public static final int NUMERO_PLANTA_A = 9;

    //Instanciación del objeto Scanner.
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    // Selección de planta.
    public static int entrarPlanta() {

        System.out.print("Selección de planta ..: ");
        int numeroPlanta = SCN.nextInt();

        return numeroPlanta;
    }

    // Análisis selección.
    public static String analizaPlanta(int numeroPlanta) {

        String nombrePlanta;

        switch (numeroPlanta) {
            case NUMERO_PLANTA_0:
                nombrePlanta = NOMBRE_PLANTA_0;
                break;
            case NUMERO_PLANTA_1:
                nombrePlanta = NOMBRE_PLANTA_1;
                break;
            case NUMERO_PLANTA_2:
                nombrePlanta = NOMBRE_PLANTA_2;
                break;
            case NUMERO_PLANTA_3:
                nombrePlanta = NOMBRE_PLANTA_3;
                break;
            case NUMERO_PLANTA_A:
                nombrePlanta = NOMBRE_PLANTA_A;
                break;
            default:
                nombrePlanta = NOMBRE_PLANTA_X;
        }

        return nombrePlanta;
    }

    // Mensaje selección.
    public static void mensajeNombrePlanta() {

        int numeroPlanta = entrarPlanta();
        String nombrePlanta = analizaPlanta(numeroPlanta);
        System.out.printf("Planta seleccionada ..: %s\n", nombrePlanta);
    }
}
