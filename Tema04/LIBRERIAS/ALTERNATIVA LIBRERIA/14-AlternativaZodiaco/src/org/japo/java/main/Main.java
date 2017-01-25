package org.japo.java.main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Constantes
        final int MES_MIN = 1;
        final int MES_MAX = 12;
        final int ANY_MIN = 1900;
        final int ANY_MAX = 2100;

        // Sistema aleatorio
        Random azar = new Random();

        // Generar el año
        int any = azar.nextInt(ANY_MAX - ANY_MIN + 1) + ANY_MIN;

        // Generar el mes
        int mes = azar.nextInt(MES_MAX - MES_MIN + 1) + MES_MIN;

        // Averigurar si el año es bisiesto
        boolean bisiestoOK = any % 400 == 0 || any % 100 != 0 && any % 4 == 0;

        // Calcular cuantos dias tiene el mes generado
        int numDiasMes;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
                || mes == 10 || mes == 12) {
            numDiasMes = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numDiasMes = 30;
        } else if (bisiestoOK) {
            numDiasMes = 29;
        } else {
            numDiasMes = 28;
        }

        // Generar el dia
        int dia = azar.nextInt(numDiasMes) + 1;

        // Obtener signo del zodiaco correspondiente a la fecha
        String signo;
        if (mes == 3 && dia >= 21 || mes == 4 && dia <= 20) {
            signo = "Aries";
        } else if (mes == 4 && dia >= 21 || mes == 5 && dia <= 21) {
            signo = "Tauro";
        } else if (mes == 5 && dia >= 22 || mes == 6 && dia <= 21) {
            signo = "Géminis";
        } else if (mes == 6 && dia >= 21 || mes == 7 && dia <= 23) {
            signo = "Cáncer";
        } else if (mes == 7 && dia >= 24 || mes == 8 && dia <= 23) {
            signo = "Leo";
        } else if (mes == 8 && dia >= 24 || mes == 9 && dia <= 23) {
            signo = "Virgo";
        } else if (mes == 9 && dia >= 24 || mes == 10 && dia <= 23) {
            signo = "Libra";
        } else if (mes == 10 && dia >= 24 || mes == 11 && dia <= 22) {
            signo = "Escorpio";
        } else if (mes == 11 && dia >= 23 || mes == 12 && dia <= 21) {
            signo = "Sagitario";
        } else if (mes == 12 && dia >= 22 || mes == 1 && dia <= 20) {
            signo = "Capricornio";
        } else if (mes == 1 && dia >= 21 || mes == 2 && dia <= 19) {
            signo = "Acuario";
        } else {
            signo = "Piscis";
        }

        // Mostrar resultados
        System.out.printf("Fecha nacimiento ..: %02d/%02d/%d\n", dia, mes, any);
        System.out.printf("Signo zociacal ....: %s\n", signo);
    }
}
