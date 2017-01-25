package org.japo.java.main;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        // Constantes
        final int LLUVIA_MAX = 500;
        final int LLUVIA_MIN = 0;
        final int NUM_DIAS = 7;

        // Random
        Random rnd = new Random();

        // Variables
        int lluviaAct;
        int lluviaMin = 0;
        int lluviaMax = 0;
        int lluviaAcu = 0;
        int lluviaMed;
        int diaMax = 0;
        int diaMin = 0;

        // Simulacion lluvia
        for (int dia = 0; dia < NUM_DIAS; dia++) {
            // Generar la lluvia
            lluviaAct = rnd.nextInt(LLUVIA_MAX - LLUVIA_MIN + 1) + LLUVIA_MIN;

            // Mostrar Lluvia HOY
            String nombreDia = "";
            switch (dia) {
                case 0:
                    nombreDia = "lunes";
                    break;
                case 1:
                    nombreDia = "martes";
                    break;
                case 2:
                    nombreDia = "miércoles";
                    break;
                case 3:
                    nombreDia = "jueves";
                    break;
                case 4:
                    nombreDia = "viernes";
                    break;
                case 5:
                    nombreDia = "sábado";
                    break;
                case 6:
                    nombreDia = "domingo";
            }

            // Mostrar lluvia HOY
            System.out.printf("Dia: %-9s - Lluvia %d\n", nombreDia, lluviaAct);

            // Acumular LLuvia
            lluviaAcu += lluviaAct;

            // MAXIMO
            if (dia == 0) { // Primer dia del periodo
                // Dia de máxima lluvia
                diaMax = 0;

                // LLuvia máxima
                lluviaMax = lluviaAct;
            } else if (lluviaAct > lluviaMax) {  // Restantes dias del periodo
                // Dia de máxima lluvia
                diaMax = dia;

                // LLuvia máxima
                lluviaMax = lluviaAct;
            }

            // MINIMO
            if (dia == 0) { // Primer dia del periodo
                // Dia de mínima lluvia
                diaMin = 0;

                // LLuvia mínima
                lluviaMin = lluviaAct;
            } else if (lluviaAct < lluviaMin) {  // Restantes dias del periodo
                // Dia de míxima lluvia
                diaMin = dia;

                // LLuvia máxima
                lluviaMin = lluviaAct;
            }
        }

        // Lluvia Media 
        lluviaMed = lluviaAcu / NUM_DIAS;

        // Resultados
        System.out.printf("Lluvia acumulada ......: %d\n", lluviaAcu);
        System.out.printf("Lluvia media ..........: %d\n", lluviaMed);

        // Mostrar Lluvia MAX
        String nombreDiaMax = "";
        switch (diaMax) {
            case 0:
                nombreDiaMax = "lunes";
                break;
            case 1:
                nombreDiaMax = "martes";
                break;
            case 2:
                nombreDiaMax = "miércoles";
                break;
            case 3:
                nombreDiaMax = "jueves";
                break;
            case 4:
                nombreDiaMax = "viernes";
                break;
            case 5:
                nombreDiaMax = "sábado";
                break;
            case 6:
                nombreDiaMax = "domingo";
        }

        // Mostrar lluvia MAX
        System.out.println("");
        System.out.printf("Max: %-9s - Lluvia %d\n", nombreDiaMax, lluviaMax);
        
        // Mostrar Lluvia MIN
        String nombreDiaMin = "";
        switch (diaMin) {
            case 0:
                nombreDiaMin = "lunes";
                break;
            case 1:
                nombreDiaMin = "martes";
                break;
            case 2:
                nombreDiaMin = "miércoles";
                break;
            case 3:
                nombreDiaMin = "jueves";
                break;
            case 4:
                nombreDiaMin = "viernes";
                break;
            case 5:
                nombreDiaMin = "sábado";
                break;
            case 6:
                nombreDiaMin = "domingo";
        }

        // Mostrar lluvia MIN
        System.out.println("");
        System.out.printf("Min: %-9s - Lluvia %d\n", nombreDiaMin, lluviaMin);
    }

}
