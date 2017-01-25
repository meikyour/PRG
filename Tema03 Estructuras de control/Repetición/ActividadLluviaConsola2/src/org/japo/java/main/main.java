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
        String nombreDiaAct = "";
        String nombreDiaMax = "";
        String nombreDiaMin = "";

        // Simulacion lluvia
        for (int dia = 0; dia < NUM_DIAS; dia++) {
            // Generar la lluvia
            lluviaAct = rnd.nextInt(LLUVIA_MAX - LLUVIA_MIN + 1) + LLUVIA_MIN;

            // Mostrar Lluvia HOY
            switch (dia) {
                case 0:
                    nombreDiaAct = "lunes";
                    break;
                case 1:
                    nombreDiaAct = "martes";
                    break;
                case 2:
                    nombreDiaAct = "miércoles";
                    break;
                case 3:
                    nombreDiaAct = "jueves";
                    break;
                case 4:
                    nombreDiaAct = "viernes";
                    break;
                case 5:
                    nombreDiaAct = "sábado";
                    break;
                case 6:
                    nombreDiaAct = "domingo";
            }

            // Mostrar lluvia HOY
            System.out.printf("Dia: %-9s - Lluvia %d\n", nombreDiaAct, lluviaAct);

            // Acumular LLuvia
            lluviaAcu += lluviaAct;

            // MAXIMO
            if (dia == 0) { // Primer dia del periodo
                // Dia de máxima lluvia
                diaMax = 0;

                // LLuvia máxima
                lluviaMax = lluviaAct;
                
                // Nombre dia MAX
                nombreDiaMax = nombreDiaAct;
            } else if (lluviaAct > lluviaMax) {  // Restantes dias del periodo
                // Dia de máxima lluvia
                diaMax = dia;

                // LLuvia máxima
                lluviaMax = lluviaAct;
                
                // Nombre dia MAX
                nombreDiaMax = nombreDiaAct;
            }
            

            // MINIMO
            if (dia == 0) { // Primer dia del periodo
                // Dia de mínima lluvia
                diaMin = 0;

                // LLuvia mínima
                lluviaMin = lluviaAct;
                
                // Nombre dia MIN
                nombreDiaMin = nombreDiaAct;
            } else if (lluviaAct < lluviaMin) {  // Restantes dias del periodo
                // Dia de míxima lluvia
                diaMin = dia;

                // LLuvia máxima
                lluviaMin = lluviaAct;
                
                // Nombre dia MIN
                nombreDiaMin = nombreDiaAct;
            }
        }

        // Lluvia Media 
        lluviaMed = lluviaAcu / NUM_DIAS;

        // Resultados
        System.out.printf("Lluvia acumulada ......: %d\n", lluviaAcu);
        System.out.printf("Lluvia media ..........: %d\n", lluviaMed);

        // Mostrar lluvia MAX
        System.out.println("");
        System.out.printf("Max: %-9s - Lluvia %d\n", nombreDiaMax, lluviaMax);
        
        // Mostrar lluvia MIN
        System.out.println("");
        System.out.printf("Min: %-9s - Lluvia %d\n", nombreDiaMin, lluviaMin);
    }
}
