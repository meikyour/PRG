package org.japo.java.main;

//Importación clase Scanner y Locale.
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {

        // Escaner
        Scanner scn = new Scanner(System.in);
        // Codificación local
        Locale lcl = new Locale("EN", "uk");

        //Vatiables.
        int votosA = 0;
        int votosB = 0;
        double porcentajeVotosA;
        double porcentajeVotosB;
        char voto = 0;

        //Calculos.
        do {
            boolean condicionOK = true;
            do {
                boolean testOK = true;
                do {
                    try {
                        System.out.printf("Introduce tu voto al candidato A o B\n");
                        System.out.printf("Introduce C para salir..............:");
                        voto = scn.nextLine().charAt(0);
                        testOK = false;
                    } catch (Exception e) {
                        System.out.println("Error de entrada, introduce un voto válido.");
                    }
                } while (testOK);
                condicionOK = !(voto == 'A' || voto == 'B' || voto == 'C');
            } while (condicionOK);

            //Recuento de votos.
            switch (voto) {
                case 'A':
                    votosA++;
                    break;
                case 'B':
                    votosB++;
                    break;
            }
            porcentajeVotosA = votosA * 100 / (votosA + votosB);
            porcentajeVotosB = votosB * 100 / (votosA + votosB);
            System.out.printf("Candidato A....: %d - %.2f%%\n", votosA, porcentajeVotosA);
            System.out.printf("Candidato B....: %d - %.2f%%\n", votosB, porcentajeVotosB);
        } while (voto != 'C');
    }
}
