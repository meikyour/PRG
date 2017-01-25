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
public class AlternativaMulta {

    // Referencias
    public static final double IMPORTE_MULTA = 60.0;
    public static final int TIPO_DESCUENTO = 20;
    public static final int DIAS_DESCUENTO = 30;

    // Instancia el objeto Scanner
    public static final Scanner SCN = new Scanner(System.in);

    public static int introduceDias() {

        // Introducir los dias de demora
        System.out.print("Dias de demora ...........: ");
        int diasDemora = SCN.nextInt();

        return diasDemora;
    }

    public static boolean comparacion() {

        //Variable.
        int diasDemora = introduceDias();
        // Comparación
        boolean testOK = diasDemora <= DIAS_DESCUENTO;

        return testOK;
    }

    public static double importeDescuento() {

        //Variables.
        boolean testOK = comparacion();
        double importeDecto = 0.0;

        // Calcula el descuento 
        if (testOK) {
            importeDecto = IMPORTE_MULTA * TIPO_DESCUENTO / 100;
        }
        return importeDecto;
    }

    public static void importeFinal() {

        //Variable.
        double importeDecto = importeDescuento();

        // Calcula el importe final
        double importeFinal = IMPORTE_MULTA - importeDecto;
    }

    public static void mensajes() {

        //Variables.
        double importeDecto = importeDescuento();
        double importeFinal = IMPORTE_MULTA - importeDecto;
        
        // Muestra el importe de la multa
        System.out.printf("Importe inicial multa ....: %.2f €\n", IMPORTE_MULTA);
        System.out.printf("Plazo con descuento ......: %d dias\n", DIAS_DESCUENTO);
        System.out.printf("Tipo descuento ...........: %d %%\n", TIPO_DESCUENTO);
        System.out.printf("Importe descuento ........: %.2f €\n", importeDecto);
        System.out.printf("Importe final multa ......: %.2f €\n", importeFinal);
    }
}
