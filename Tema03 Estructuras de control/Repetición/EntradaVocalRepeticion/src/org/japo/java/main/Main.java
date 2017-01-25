package org.japo.java.main;

//Importación clase Scanner.
import java.util.Scanner;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Instanciación clase Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        //Variables.
        char vocal = '0';
        String vocalNO = "Error de entrada, introduce una vocal.";
        String caracterNO = "Error de entrada, introduce un carácter.";

        //Cálculos.
        boolean vocalOK = true;
        do {
            //Introducción de datos y validación de Char.
            boolean testOK = true;
            do {
                try {
                    System.out.printf("Introduce una vocal mayuscula inglesa.......:");
                    vocal = scn.nextLine().charAt(0);
                    testOK = false;
                } catch (Exception e) {
                    System.out.println(caracterNO);
                }
            } while (testOK);

            //Evaluación de Char desedo.
            vocalOK = !(vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U');
            if (vocalOK) {
                System.out.println(vocalNO);
            }
        } while (vocalOK);

        //Mensajes.
        System.out.println("Vocal...........:" + vocal);
    }
}
