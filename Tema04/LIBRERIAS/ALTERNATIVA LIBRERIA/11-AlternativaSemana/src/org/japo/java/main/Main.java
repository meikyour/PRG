package org.japo.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instancia un objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Introduce el número del dia de la semana
        System.out.print("Número del día de la semana: ");
        int numeroDia = sc.nextInt();

        // Analiza el dia introducido
        String dia;
        switch (numeroDia) {
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miércoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                dia = "indefinido";
        }

        // Muestra el resultado
        System.out.printf("Nombre del dia de la semana: %s\n", dia);
    }
}
