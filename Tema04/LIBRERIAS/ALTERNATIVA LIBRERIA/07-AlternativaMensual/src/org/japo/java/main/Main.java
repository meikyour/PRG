package org.japo.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Constantes
        final int NUM_MES_INI = 1;
        final int NUM_MES_FIN = 12;

        // Instancia un objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Variables de trabajo
        int numeroDiasMes;
        int numeroMes;
        int any;

        // Introducir número de mes
        System.out.print("Mes de la fecha ...: ");
        numeroMes = sc.nextInt();

        // Introducir año
        System.out.print("Año de la fecha ...: ");
        any = sc.nextInt();

        // Analiza el mes introducido
        if (numeroMes < NUM_MES_INI || numeroMes > NUM_MES_FIN) {
            System.out.println("Dato incorrecto");
        } else {
            switch (numeroMes) {
                case 2:
                    if (any % 400 == 0 || any % 100 != 0 && any % 4 == 0) {
                        numeroDiasMes = 29;
                    } else {
                        numeroDiasMes = 28;
                    }   break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numeroDiasMes = 30;
                    break;
                default:
                    numeroDiasMes = 31;
                    break;
            }
            System.out.printf("El mes %d tiene %d dias\n", numeroMes, numeroDiasMes);
        }
    }
}
