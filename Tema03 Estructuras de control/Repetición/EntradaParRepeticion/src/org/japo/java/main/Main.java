package org.japo.java.main;

//Importamos la clase Scanner.
import java.util.Scanner;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {

        //Instanciación objeto Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");     //INICIO.

        //Variables.  
        int n = 0;

        //Evaluación del número par.
        boolean condicionOK = true;
        do {
            //Validación del dato tipo Int.
            boolean testOK = true;
            do {
                try {
                    System.out.print("Número par....: ");
                    n = scn.nextInt();
                    testOK = false;
                } catch (Exception e) {
                    System.out.println("Error entrada.");
                } finally {
                    scn.nextLine();
                }
            } while (testOK);
            condicionOK = !(n % 2 == 0);
            if (condicionOK) {
                System.out.println("Introduce un número par");
            }
        } while (condicionOK);

        //Mensaje con el número par.
        System.out.println("Número..........: " + n);
    }
}
